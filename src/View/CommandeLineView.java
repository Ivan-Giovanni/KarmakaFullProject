package View;

import Controller.GameController;
import Model.Partie.Partie;

import java.util.Scanner;

public class CommandeLineView implements GameViewable {

    // ==================================== LES ATTRIBUTS ============================================ //
    GameController controller;
    Scanner keyboard = new Scanner(System.in);


    // =================================== PUBLIC STATIC VOID MAIN ========================================== //
    public static void main(String[] args) {
        GameViewables views = new GameViewables();
        CommandeLineView myView = new CommandeLineView();
        views.addViewable(myView);

        Partie partie = Partie.getPartie();

        GameController gameController = new GameController(views, partie);
        gameController.run();
        //
    }


    // ==================================== LES METHODES ============================================ //

    // ==================================== SET_CONTROLLER ============================================ //
    public void setController(GameController gameController) {
        this.controller = gameController;
    }

    // ==================================== PROMPT_FOR_NOM_DU_JOUEUR ========================================= //
    @Override
    public void promptForNomDuJoueur() {
        System.out.println("Enter Player Name:");
        String name = keyboard.nextLine();
        if (name.isEmpty()) {
            controller.creerLaPartie();
        }
    }

    @Override
    public void doSomething() {

    }

    @Override
    public void promptForNouvellePartie() {

    }



    @Override
    public void afficherNomDuJoueur() {

    }

    @Override
    public void afficherLesCartesDeLaMain() {

    }

    @Override
    public void afficherLesCartesDeLaPile() {

    }

    @Override
    public void afficherLeNomDuGagnant() {

    }

    @Override
    public void promptForTerminerLaPartie() {

    }

}
