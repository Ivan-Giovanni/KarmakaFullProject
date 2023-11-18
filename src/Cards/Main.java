package Cards;

import Cards.Card;
import Cards.CardsSpecifiques23.Longevite;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        List<Card> myCards = new ArrayList<Card>();

        myCards.add(Longevite.getLongevite1());


        System.out.println(myCards.get(2).getNom());

    }

}
