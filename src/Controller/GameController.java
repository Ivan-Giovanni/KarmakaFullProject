package Controller;

import Model.Joueur.JoueurReel;
import Model.Partie.EtatDeLaPartie;
import Model.Partie.Partie;
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
        while (partie.getEtatDeLaPartie() == EtatDeLaPartie.CREATING) {
            view.promptForNomDuJoueur();
        }
    }

    // ======================================== AJOUTER LES JOUEURS ======================================== //
    public void ajouterLesJoueurs(String name) {
        if (partie.getEtatDeLaPartie() == EtatDeLaPartie.CREATING) {
            partie.ajouterJoueur(new JoueurReel(name));
        }
    }

    public void commencerLaPartie() {
        /* */
        view.afficherNomDuJoueur();
    }

    public void creerLaSource() {
        /* */
        view.doSomething();
    }

    public void shuffleLaSource() {
        /* */
        view.doSomething();
    }

    public void creerLaFosse() {
        /* */
        view.doSomething();
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
