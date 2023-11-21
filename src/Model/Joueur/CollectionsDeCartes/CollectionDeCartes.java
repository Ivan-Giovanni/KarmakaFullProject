package Model.Joueur.CollectionsDeCartes;

import Model.Cards.Card;
import Model.Cards.CardsSpecifiques23.Fournaise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author giovannizangue
 * <br>
 * Cette classe abstraite est la classe mere des collections de cartes que possede le jouer <b>Main,
 * Pile, Oeuvre, VieFuture</b>
 */
public abstract class CollectionDeCartes {

    // ====================================== LES ATTRIBUTS ============================================ //
    private List<Card> listeDeCartes = new LinkedList<Card>();
    private static int nombreDeCartes;

    // ====================================== LES GETTERS ET SETTERS ========================================== //
    public int getNombreDeCartes() {
        return nombreDeCartes;
    }

    protected void setNombreDeCartes(int nbre) {
        nombreDeCartes = nbre;
    }

    // ========================================= LE CONSTRUCTEUR ============================================ //


    // ========================================= LES METHODES ============================================ //
    public abstract void addCard(Card carte);
    public abstract Card removeCard();

    protected void decrementNombreDeCartes() {
        nombreDeCartes -= 1;
    }

    protected void incrementNombreDeCartes() {
        nombreDeCartes += 1;
    }



}
