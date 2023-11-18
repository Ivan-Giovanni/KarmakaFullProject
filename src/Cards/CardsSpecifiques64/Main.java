package Cards.CardsSpecifiques64;

import Cards.Card;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        List<Card> myCards = new ArrayList<Card>();

        myCards.add(Longevite.getLongevite1());


        System.out.println(myCards.get(2).getNom());

    }

}
