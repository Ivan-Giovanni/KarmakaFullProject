package Controller;

import Model.Joueur.Joueur;
import Model.Joueur.JoueurReel;
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
            while (partie.getEtatDeLaPartie() == EtatDeLaPartie.CREATING) {
                view.promptForNomDuJoueur();
                partie.setEtatDeLaPartie(EtatDeLaPartie.PLAYERS_ADDED);
                afficherListeDesJoueurs();
            }

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
            partie.setEtatDeLaPartie(EtatDeLaPartie.PLAYING);

            // NEXT ACTION
            while (partie.getEtatDeLaPartie() == EtatDeLaPartie.PLAYING) {
                piocher();
                jouer();
                verifierEtatDeLaPartie();
                endTurn();
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
            Thread.sleep(2000);
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
            Thread.sleep(2000);
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
            Thread.sleep(2000);
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
            Thread.sleep(3000);
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
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    // ====================================== NEXT_PLAYER ============================================ //
    public void endTurn() {
        Joueur temp = partie.getActivePlayer();
        partie.setActivePlayer(partie.getOpponentPlayer());
        partie.setOpponentPlayer(temp);
    }

    // ====================================== PIOCHER ============================================ //
    public void piocher() {

    }

    // ====================================== JOUER ============================================ //
    public void jouer() {
        // Le joueur peut decider de jouer une carte, ou bien de passer son tour
    }

    // ==================================== VERIFIER_ETAT_DE_LA_PARTIE ==================================== //
    public void verifierEtatDeLaPartie() {

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
