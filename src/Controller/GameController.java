package Controller;

import Model.Partie.Partie;
import View.CommandeLineView;
import View.GameViewable;
import View.GameViewables;

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
    }

    // =============================================== LES METHODES ========================================== //

    public void run() {
        /* */
        creerLaPartie();
        view.doSomething();
    }

    public void creerLaPartie() {
        /* */
        System.out.println("\nCREATION DE LA PARTIE...");
        view.doSomething();
        view.promptForNouvellePartie();
    }

    public void ajouterLesJoueurs() {
        /* */
        view.promptForNomDuJoueur();
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
