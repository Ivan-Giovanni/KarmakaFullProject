package Controller;

import Model.Cards.Card;
import Model.Cards.CardsSpecifiques23.Sauvetage;
import Model.Joueur.Joueur;
import Model.Joueur.JoueurReel;
import Model.Joueur.JoueurVirtuel;
import Model.Joueur.OptionDeJeu;
import Model.Partie.EtatDeLaPartie;
import Model.Partie.Partie;
import Model.Partie.TypeDePartie;
import View.GameViewable;

import java.util.Random;
import java.util.Scanner;

/**
 * @author giovannizangue
 * Cette classe correspond au controller de notre jeu
 */
public class GameController {

    // =============================================== LES ATTRIBUTS ======================================== //
    GameViewable view;
    Partie partie = Partie.getPartie();

    Scanner keyboard = new Scanner(System.in);
    Random random = new Random();

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

                    System.out.println("""
                            
                            VOULEZ VOUS JOUER OU BIEN PASSER VOTRE TOUR?
                            •0 = Jouer
                            •1 = Passer""");
                    int reponse = keyboard.nextInt();
                    if (reponse == 0) {
                        jouer();
                        endTurn();
                    }
                    else if(reponse == 1)
                        endTurn();
                    else
                        System.out.println("Invalid Entry");

                }
                while (partie.getEtatDeLaPartie() == EtatDeLaPartie.CPU_1_PLAYING) {
                    piocher();

                    System.out.println("""

                            VOULEZ VOUS JOUER OU BIEN PASSER VOTRE TOUR?
                            •0 = Jouer
                            •1 = Passer""");

                    int reponse = random.nextInt();
                    if (reponse % 5 != 0) {
                        jouerCPU();
                        endTurn();
                    }
                    else
                        endTurn();

                }

            }


        } else if (partie.getTypeDePartie() == TypeDePartie.CPU_VS_CPU) {

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
                while (partie.getEtatDeLaPartie() == EtatDeLaPartie.CPU_2_PLAYING) {
                    piocher();

                    System.out.println("""

                            VOULEZ VOUS JOUER OU BIEN PASSER VOTRE TOUR?
                            •0 = Jouer
                            •1 = Passer""");

                    int reponse = random.nextInt();
                    if (reponse % 5 != 0) {
                        jouerCPU();
                        endTurn();
                    }
                    else
                        endTurn();

                }
                while (partie.getEtatDeLaPartie() == EtatDeLaPartie.CPU_1_PLAYING) {
                    piocher();

                    System.out.println("""

                            VOULEZ VOUS JOUER OU BIEN PASSER VOTRE TOUR?
                            •0 = Jouer
                            •1 = Passer""");

                    int reponse = random.nextInt();
                    if (reponse % 5 != 0) {
                        jouerCPU();
                        endTurn();
                    }
                    else
                        endTurn();

                }

            }

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
        if (partie.getTypeDePartie() == TypeDePartie.JOUEUR_REEL_VS_CPU) {

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
       else {
            partie.ajouterJoueurCPUvsCPU();
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

            System.out.println("•ACTIVE PLAYER: " + partie.getActivePlayer());
            System.out.println("•OPPONENT PLAYER: " + partie.getOpponentPlayer());

            if (partie.getActivePlayer() instanceof JoueurReel)
                partie.setEtatDeLaPartie(EtatDeLaPartie.JOUEUR_REEL_PLAYING);
            else if(partie.getActivePlayer() instanceof JoueurVirtuel)
                partie.setEtatDeLaPartie(EtatDeLaPartie.CPU_1_PLAYING);

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

            if (partie.getTypeDePartie() == TypeDePartie.JOUEUR_REEL_VS_CPU) {
                if (partie.getEtatDeLaPartie() == EtatDeLaPartie.JOUEUR_REEL_PLAYING) {
                    partie.setEtatDeLaPartie(EtatDeLaPartie.CPU_1_PLAYING);
                    System.out.println("\n****************************** C'EST AU TOUR DU CPU DE JOUER! ******************************\n");
                    Thread.sleep(3000);
                } else if (partie.getEtatDeLaPartie() == EtatDeLaPartie.CPU_1_PLAYING) {
                    partie.setEtatDeLaPartie(EtatDeLaPartie.JOUEUR_REEL_PLAYING);
                    System.out.println("\n****************************** C'EST A VOTRE TOUR DE JOUER! ******************************\n");
                    Thread.sleep(3000);
                }
            }
            else if (partie.getTypeDePartie() == TypeDePartie.CPU_VS_CPU) {
                if (partie.getEtatDeLaPartie() == EtatDeLaPartie.CPU_1_PLAYING) {
                    partie.setEtatDeLaPartie(EtatDeLaPartie.CPU_2_PLAYING);
                    System.out.println("\n****************************** C'EST AU TOUR DU CPU_2 DE JOUER! ******************************\n");
                    Thread.sleep(3000);
                } else if (partie.getEtatDeLaPartie() == EtatDeLaPartie.CPU_2_PLAYING) {
                    partie.setEtatDeLaPartie(EtatDeLaPartie.CPU_1_PLAYING);
                    System.out.println("\n****************************** C'EST AU TOUR DU CPU_1 DE JOUER! ******************************\n");
                    Thread.sleep(3000);
                }
            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ====================================== PIOCHER ============================================ //
    public void piocher() {

        try {
            System.out.println("\nPHASE DE PIOCHE...\n");
            Thread.sleep(1500);

            if (partie.getActivePlayer().getMain().getCartesDeLaMain().size() >= 6) {
                System.out.println("\nVOUS AVEZ DEJA ASSEZ DE CARTES DANS LA MAIN");
                Thread.sleep(500);
            }
            else {
                System.out.println("\nACTIVE PLAYER PIOCHE UNE CARTE...\n");
                Thread.sleep(1500);
                partie.getActivePlayer().getMain().getCartesDeLaMain().add(partie.getSource().removeCard());
                System.out.println(partie.getActivePlayer().getMain().getCartesDeLaMain());
            }
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

            System.out.println("\n****************************** ACTIVE PLAYER'S TOUR EST TERMINE! ******************************\n");
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

            System.out.println("\nEntrez l'index de la carte de la main a jouer: ");

            Random random = new Random();
            int index = random.nextInt(0, partie.getActivePlayer().getMain().getCartesDeLaMain().size());

            System.out.println(index);

            Card carteAJouer = partie.getActivePlayer().getMain().getCartesDeLaMain().get(index);

            Thread.sleep(1500);

            System.out.println("""
                    Choisir l'option de jeu:\s
                    •0 = Jouer pour ses points
                    •1 = Jouer pour ses pouvoirs
                    •2 = Jouer pour la vie future""");

            int index2 = random.nextInt(0, 3);
            System.out.println(index2);

            setOptionDeJeu(index2);
            OptionDeJeu optionDeJeu = partie.getActivePlayer().getOptionDeJeu();
            System.out.println("\nOption de jeu = " + optionDeJeu);

            Thread.sleep(1500);

            partie.getActivePlayer().jouer(carteAJouer, optionDeJeu);
            System.out.println(partie.getActivePlayer());

            System.out.println("\n****************************** ACTIVE PLAYER'S TOUR EST TERMINE! ******************************\n");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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
