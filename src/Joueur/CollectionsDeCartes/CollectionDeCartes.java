package Joueur.CollectionsDeCartes;

import Cards.Card;
import Cards.CardsSpecifiques23.Fournaise;

import java.util.ArrayList;
import java.util.List;

/**
 * @author giovannizangue
 * <br>
 * Cette classe abstraite est la classe mere des collections de cartes que possede le jouer <b>Main,
 * Pile, Oeuvre, VieFuture</b>
 */
public abstract class CollectionDeCartes {

    // ====================================== LES ATTRIBUTS ============================================ //
    private List<Card> listeDeCartes = new ArrayList<Card>();
    private static int nombreDeCartes;

    // ====================================== LES GETTERS ET SETTERS ========================================== //


    // ========================================= LE CONSTRUCTEUR ============================================ //


    // ========================================= LES METHODES ============================================ //

    // ========================================= ADD_CARD ============================================ //
    public void addCard(Card carte) {

    }

    // ========================================= REMOVE_CARD ============================================ //
    public Card removeCard() {

        return Fournaise.getFournaise1();  // On va modifier après
    }



}
