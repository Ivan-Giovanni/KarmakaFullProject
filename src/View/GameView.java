package View;

import Model.Joueur.CollectionsDeCartes.Main;
import Model.ReservesDeCartes.Source;

public class GameView {

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

        System.out.println(Source.Source().disribuerPile());
        System.out.println(Source.Source().getSize());

        Main maMain = new Main();
        System.out.println(maMain);

    }
}
