package Model.Joueur.CollectionsDeCartes;

import Model.Cards.Card;
import Model.ReservesDeCartes.Source;

import java.util.List;

/**
 * @author giovannizangue
 * Cette classe correspond à la pile du Model.Joueur
 */
public class Pile extends CollectionDeCartes{

    // =============================================== LES ATTRIBUTS ============================================ //
    private List<Card> pile;

    // ============================================= LE CONSTRUCTEUR ============================================ //
    public Pile() {
        pile = Source.Source().disribuerPile();
    }

    // =============================================== LES GETTERS ============================================ //
    public List<Card> getPile() {
        setNombreDeCartes(2);
        return pile;
    }


    // =============================================== LES METHODES ============================================ //
    @Override
    public void addCard(Card carte) {
        incrementNombreDeCartes();
        pile.add(carte);
    }
    @Override
    public Card removeCard() {
        decrementNombreDeCartes();
        return pile.remove(0);
    }
}
