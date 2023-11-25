package Controller;

import Model.Joueur.JoueurReel;
import Model.Partie.EtatDeLaPartie;
import Model.Partie.Partie;
import Model.Partie.TypeDePartie;
import Model.ReservesDeCartes.Source;
import View.GameViewable;

/**
 * @author giovannizangue
 * Cette classe correspond au controller de notre jeu
 */
public class GameController {

    // =============================================== LES ATTRIBUTS ========================================== //
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

    // ======================================= COMMENCER_LA_PARTIE ======================================== //
    public void commencerLaPartie() {
        /* */
        view.afficherNomDuJoueur();
    }

    // ======================================= CREER_LA_SOURCE ======================================== //
    public void melangerLaSource() {
        System.out.println("\nSHUFFLING LA SOURCE...\n");
        partie.getSource().melanger();
        System.out.println(partie.getSource());
    }


    public void creerLesAnneauxKarmiques() {
        /* */
        view.doSomething();
    }

    public void distribuerLesCartesDeLaMain() {
        /* */
        view.afficherLesCartesDeLaMain();
    }

    public void distribuerLesCartesDeLaPile() {
        /* */
        view.afficherLesCartesDeLaPile();
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
