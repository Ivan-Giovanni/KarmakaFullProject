package View;

import Controller.GameController;

public class GUIview implements GameViewable{

    // =================================== LES ATTRIBUTS ========================================== //


    // =================================== LES METHODES ========================================== //
    @Override
    public void setController(GameController gameController) {

    }

    @Override
    public void promptForTypeDePartie() {

    }

    @Override
    public int promptForVoulezVousJouezOuPasser() {
        return 0;
    }

    @Override
    public void doSomething() {

    }

    @Override
    public void promptForNouvellePartie() {

    }

    @Override
    public void promptForNomDuJoueur() {

    }

    @Override
    public void afficherNomDuJoueur() {

    }

    @Override
    public void afficherLeNomDuGagnant() {

    }

    @Override
    public void promptForTerminerLaPartie() {

    }

    @Override
    public int promptForIndexDeLaCarteDeLaMainAJouer() {
        return 0;
    }

    @Override
    public int promptForOptionDeJeu() {
        return 0;
    }
}
