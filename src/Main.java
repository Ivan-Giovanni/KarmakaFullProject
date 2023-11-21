import Model.Cards.Card;
import Model.Cards.CardsSpecifiques23.Longevite;
import Model.Cards.CardsSpecifiques23.Vengeance;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        Queue<Card> myCards = new LinkedList<Card>();
        List<Card> myCards2 = new LinkedList<Card>();

        myCards.add(Longevite.getLongevite1());
        myCards.add(Vengeance.getVengeance1());



    }

}
