package View;

import Controller.GameController;
import Model.Cards.CardsSpecifiques23.DernierSouffle;
import Model.Joueur.CollectionsDeCartes.Main;
import Model.ReservesDeCartes.Source;

public class CommandeLineView implements GameViewable{

    // ==================================== LES ATTRIBUTS ============================================ //
    GameController controller;

    public static void main(String[] args) {
        System.out.println();

        Source.Source().melanger();
        System.out.println(Source.Source());
        System.out.println(Source.Source().getSize());

        System.out.println(Source.Source().removeCard());
        System.out.println(Source.Source().getSize());

        System.out.println(Source.Source().removeCard());
        System.out.println(Source.Source().getSize());

        System.out.println(Source.Source().distribuerMain());
        System.out.println(Source.Source().getSize());

        System.out.println(Source.Source().distribuerPile());
        System.out.println(Source.Source().getSize());
        System.out.println();

        // =================================================================================================== //

        Main main = new Main();
        System.out.println(main.getMain());
        System.out.println(main.getNombreDeCartes());

        main.addCard(DernierSouffle.getDernierSouffle1());
        System.out.println(main.getMain());
        System.out.println(main.getNombreDeCartes());


    }


    // =================================== PUBLIC STATIC VOID MAIN ========================================== //

    // ==================================== LES METHODES ============================================ //
    public void doSomething() {

    }

    public void promptForNouvellePartie() {
    }

    public void promptForNomDuJoueur() {
    }

    public void afficherNomDuJoueur() {
    }

    public void afficherLesCartesDeLaMain() {
    }

    public void afficherLesCartesDeLaPile() {
    }

    public void afficherLeNomDuGagnant() {
    }

    public void promptForTerminerLaPartie() {
    }
}
