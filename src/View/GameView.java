package View;

import Model.ReservesDeCartes.Source;

public class GameView {

    public static void main(String[] args) {
        System.out.println();

        Source.Source().melanger();
        System.out.println(Source.Source());
        System.out.println(Source.Source().getSize());

        System.out.println(Source.Source().distribuer());
        System.out.println(Source.Source().getSize());

        System.out.println(Source.Source().distribuer());
        System.out.println(Source.Source().getSize());

    }
}
