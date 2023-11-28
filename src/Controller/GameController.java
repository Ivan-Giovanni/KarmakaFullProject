package Controller;

import Model.Cards.Card;
import Model.Joueur.Joueur;
import Model.Joueur.JoueurReel;
import Model.Joueur.OptionDeJeu;
import Model.Partie.EtatDeLaPartie;
import Model.Partie.Partie;
import Model.Partie.TypeDePartie;
import View.GameViewable;

import java.util.Random;

/**
 * @author giovannizangue
 * Cette classe correspond au controller de notre jeu
 */
public class GameController {

    // =============================================== LES ATTRIBUTS ======================================== //
    GameViewable view;
    Partie partie = Partie.getPartie();

    // ============================================ LE CONSTRUCTEUR ========================================= //
    public GameController(GameViewable view, Partie partie) {
        this.view = view;
        this.partie = partie;
        view.setController(this);
    }


    // =============================================== LES METHODES ========================================== //

    // ================================================= RUN ================================================ //
    public void run() {
        view.promptForTypeDePartie();

        if (partie.getTypeDePartie() == TypeDePartie.JOUEUR_REEL_VS_CPU) {

            // CREER LE JOUEUR
            creerLeJoueur();

            // MELANGER LA SOURCE
            melangerLaSource();

            // DISTRIBUER LA MAIN
            distribuerLesCartesDeLaMain();
            afficherListeDesJoueurs();

            // DISTRIBUER LA PILE
            distribuerLesCartesDeLaPile();
            afficherListeDesJoueurs();

            // WHO START
            whoStarts(partie.getListeDeJoueurs().get(0), partie.getListeDeJoueurs().get(1));

            // NEXT ACTION
            while (partie.getEtatDeLaPartie() != EtatDeLaPartie.FINISHED) {
                while (partie.getEtatDeLaPartie() == EtatDeLaPartie.JOUEUR_REEL_PLAYING) {
                    piocher();
                    jouer();
                    endTurn();
                }
                while (partie.getEtatDeLaPartie() == EtatDeLaPartie.CPU_PLAYING) {
                    piocher();
                    jouerCPU();
                    endTurn();
                }


            }


        } else if (partie.getTypeDePartie() == TypeDePartie.CPU_VS_CPU) {

        }
    }


    // ======================================== AJOUTER_LES_JOUEURS ======================================== //
    public void ajouterLesJoueurs(String name) {
        partie.ajouterJoueurReelVsCPU(new JoueurReel(name));
    }

    public void afficherListeDesJoueurs() {
        System.out.println(partie.getListeDeJoueurs());
    }

    public void creerLeJoueur() {
        while (partie.getEtatDeLaPartie() == EtatDeLaPartie.CREATING) {
            view.promptForNomDuJoueur();
            System.out.println("\nADDING PLAYERS...\n");
            try {
                Thread.sleep(1500);
                partie.setEtatDeLaPartie(EtatDeLaPartie.PLAYERS_ADDED);
                afficherListeDesJoueurs();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // ======================================== SET_TYPE_PARTIE ======================================== //
    public void setTypeDePartie(int typeDePartie) {
        if (typeDePartie == 0) {
            partie.setTypeDePartie(TypeDePartie.JOUEUR_REEL_VS_CPU);
        } else if (typeDePartie == 1) {
            partie.setTypeDePartie(TypeDePartie.CPU_VS_CPU);
        }
    }

    // ======================================= MELANGER_LA_SOURCE ======================================== //
    public void melangerLaSource() {
        System.out.println("\nSHUFFLING LA SOURCE...\n");
        try {
            Thread.sleep(1500);
            partie.getSource().melanger();
            System.out.println(partie.getSource());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // ================================= DISTIBUER_LES_CARTES_DE_LA_MAIN ================================== //
    public void distribuerLesCartesDeLaMain() {
        System.out.println("\nDISTRIBUTION DES CARTES DE LA MAIN...\n");
        try {
            Thread.sleep(1500);
            for (int i = 0; i < 4; i++) {
                partie.getListeDeJoueurs().get(0).getMain().addCard(partie.getSource().removeCard());
                partie.getListeDeJoueurs().get(1).getMain().addCard(partie.getSource().removeCard());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // ================================= DISTIBUER_LES_CARTES_DE_LA_PILE ================================== //
    public void distribuerLesCartesDeLaPile() {
        System.out.println("\nDISTRIBUTION DES CARTES DE LA PILE...\n");
        try {
            Thread.sleep(1500);
            for (int i = 0; i < 2; i++) {
                partie.getListeDeJoueurs().get(0).getPile().addCard(partie.getSource().removeCard());
                partie.getListeDeJoueurs().get(1).getPile().addCard(partie.getSource().removeCard());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // ====================================== WHO_STARTS ============================================ //
    public void whoStarts(Joueur joueur1, Joueur joueur2) {
        System.out.println("\nCHOOSING WHO START...\n");
        try {
            Thread.sleep(1500);
            Random random = new Random();

            if (random.nextInt(2) == 0) {
                partie.setActivePlayer(joueur1);
                partie.setOpponentPlayer(joueur2);
            } else {
                partie.setActivePlayer(joueur2);
                partie.setOpponentPlayer(joueur1);
            }

            // Ici je set ActivePlayer a joueurReel pour effectuer les tests. On va modifier apres
            partie.setActivePlayer(joueur1);
            partie.setOpponentPlayer(joueur2);
            partie.setEtatDeLaPartie(EtatDeLaPartie.JOUEUR_REEL_PLAYING);

            System.out.println("•ACTIVE PLAYER: " + partie.getActivePlayer());
            System.out.println("•OPPONENT PLAYER: " + partie.getOpponentPlayer());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    // ====================================== NEXT_PLAYER ============================================ //
    public void endTurn() {
        Joueur temp = partie.getActivePlayer();
        partie.setActivePlayer(partie.getOpponentPlayer());
        partie.setOpponentPlayer(temp);

        try {

            if (partie.getEtatDeLaPartie() == EtatDeLaPartie.JOUEUR_REEL_PLAYING) {
                partie.setEtatDeLaPartie(EtatDeLaPartie.CPU_PLAYING);
                System.out.println("\nC'EST AU TOUR DU CPU DE JOUER!\n");
                Thread.sleep(3000);
            }
            else if (partie.getEtatDeLaPartie() == EtatDeLaPartie.CPU_PLAYING) {
                partie.setEtatDeLaPartie(EtatDeLaPartie.JOUEUR_REEL_PLAYING);
                System.out.println("\nC'EST A VOTRE TOUR DE JOUER!\n");
                Thread.sleep(3000);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ====================================== PIOCHER ============================================ //
    public void piocher() {
        System.out.println("\nACTIVE PLAYER PIOCHE UNE CARTE...\n");
        try {
            Thread.sleep(1500);
            partie.getActivePlayer().getMain().getCartesDeLaMain().add(partie.getSource().removeCard());
            System.out.println(partie.getActivePlayer().getMain().getCartesDeLaMain());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // ====================================== JOUER ============================================ //

    // ======================== JOUEUR_REEL ======================= //
    public void jouer() {
        // Le joueur peut decider de jouer une carte, ou bien de passer son tour
        // Pour jouer, le Joueur choisit d'abord l'index de la carte a jouer
        // Puis il choisit l'option de jeu (points, pouvoir, vieFuture)

        System.out.println("\nPHASE DE JEU DE ACTIVE PLAYER...\n");
        try {
            Thread.sleep(1500);

            System.out.println(partie.getActivePlayer().getMain().getCartesDeLaMain() + "\n");

            int index = view.promptForIndexDeLaCarteDeLaMainAJouer();
            Card carteAJouer = partie.getActivePlayer().getMain().getCartesDeLaMain().get(index);

            Thread.sleep(1500);

            int index2 = view.promptForOptionDeJeu();
            setOptionDeJeu(index2);
            OptionDeJeu optionDeJeu = partie.getActivePlayer().getOptionDeJeu();
            System.out.println("\nOption de jeu = " + optionDeJeu);

            Thread.sleep(1500);

            partie.getActivePlayer().jouer(carteAJouer, optionDeJeu);
            System.out.println(partie.getActivePlayer());

            System.out.println("\nACTIVE PLAYER'S TOUR EST TERMINE!\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // ======================== JOUER_REEL ======================= //
    public void jouerCPU() {
        System.out.println("\nPHASE DE JEU DE ACTIVE PLAYER...\n");
        try {
            Thread.sleep(1500);

            System.out.println(partie.getActivePlayer().getMain().getCartesDeLaMain() + "\n");

            Random random = new Random();
            int index = random.nextInt(4);
            Card carteAJouer = partie.getActivePlayer().getMain().getCartesDeLaMain().get(index);

            Thread.sleep(1500);

            int index2 = random.nextInt(3);
            setOptionDeJeu(index2);
            OptionDeJeu optionDeJeu = partie.getActivePlayer().getOptionDeJeu();
            System.out.println("\nOption de jeu = " + optionDeJeu);

            Thread.sleep(1500);

            partie.getActivePlayer().jouer(carteAJouer, optionDeJeu);
            System.out.println(partie.getActivePlayer());

            System.out.println("\nACTIVE PLAYER'S TOUR EST TERMINE!\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



    // ==================================== VERIFIER_ETAT_DE_LA_PARTIE ==================================== //
    public void verifierEtatDeLaPartie() {

        //partie.setEtatDeLaPartie(EtatDeLaPartie.JOUEUR_REEL_PLAYING);
    }

    // ==================================== SET_OPTION_DE_JEU ==================================== //
    public void setOptionDeJeu(int index) {
        if (index == 0) {
            partie.getActivePlayer().setOptionDeJeu(OptionDeJeu.POUR_SES_POINTS);
        } else if (index == 1) {
            partie.getActivePlayer().setOptionDeJeu(OptionDeJeu.POUR_SON_POUVOIR);
        } else if (index == 2) {
            partie.getActivePlayer().setOptionDeJeu(OptionDeJeu.POUR_LA_VIE_FUTURE);
        }
    }


    public void commencerLaPartie() {
        /* */
        view.afficherNomDuJoueur();
    }

    public void nextAction() {
        /* Sucession de switch case, d'action performed, etc... */
        /* */
        view.doSomething();
    }

    public void determinerLeGagnant() {
        /* */
        view.doSomething();
        view.afficherLeNomDuGagnant();
    }

    public void terminerLaPartie() {
        /* Voulez vous rejouer une nouvelle partie? */
        /* */
        view.promptForTerminerLaPartie();
    }


}
