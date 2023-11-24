package Model.Joueur.CollectionsDeCartes;

import Model.Cards.Card;

import java.util.LinkedList;
import java.util.List;

/**
 * @author giovannizangue
 * <br>
 * Cette classe abstraite est la classe mere des collections de cartes que possede le jouer <b>Main,
 * Pile, Oeuvre, VieFuture</b>
 */
public abstract class CollectionDeCartes {

    private static int nombreDeCartes;
    // ====================================== LES ATTRIBUTS ============================================ //
    private List<Card> listeDeCartes = new LinkedList<Card>();

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
