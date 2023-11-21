package View;

import Model.Cards.CardsSpecifiques23.DernierSouffle;
import Model.Cards.CardsSpecifiques23.Fournaise;
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
        System.out.println();

        // =================================================================================================== //

        Main main = new Main();
        System.out.println(main.getMain());
        System.out.println(main.getNombreDeCartes());

        main.addCard(DernierSouffle.getDernierSouffle1());
        System.out.println(main.getMain());
        System.out.println(main.getNombreDeCartes());


    }
}
