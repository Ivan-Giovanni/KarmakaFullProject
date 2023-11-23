package Controller;

import Model.Partie;
import View.CommandeLineView;

/**
 * @author giovannizangue
 * Cette classe correspond au controller de notre jeu
 */
public class GameController {

    // =============================================== LES ATTRIBUTS ========================================== //
    CommandeLineView view;

    // ============================================ LE CONSTRUCTEUR ========================================= //
    public GameController(CommandeLineView wiew, Partie partie) {

    }

    // =============================================== LES METHODES ========================================== //

    public void run() {
        /* */
        view.doSomething();
    }

    public void creerLaPartie() {
        /* */
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
