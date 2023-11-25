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
        //GameViewables views = new GameViewables();
        CommandeLineView myView = new CommandeLineView();
        //views.addViewable(myView);

        GameController gameController = new GameController(myView, Partie.getPartie());
        gameController.run();

    }

    // ==================================== SET_CONTROLLER ============================================ //
    public void setController(GameController gameController) {
        this.controller = gameController;
    }


    // ==================================== LES METHODES ================================================= //

    // ==================================== PROMPT_FOR_NOM_DU_JOUEUR ========================================= //
    @Override
    public void promptForNomDuJoueur() {
        System.out.println("\nEntrez le nom du joueur: ");
        String name = keyboard.next();
        controller.ajouterLesJoueurs(name);
    }

    // ==================================== PROMPT_FOR_TYPE_PARTIE ========================================= //
    @Override
    public void promptForTypeDePartie() {
        System.out.println("\n*********************** BIENVENUE DANS LE JEU KARMAKA ***********************\n");
        System.out.println("Choisissez le type de partie:\n0 = Joueur reel VS CPU\n1 = CPU vs CPU");
        int typeDePartie = keyboard.nextInt();
        controller.setTypeDePartie(typeDePartie);
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
