package Model.Joueur.CollectionsDeCartes;

import Model.Cards.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * @author giovannizangue
 * <br>
 * Cette classe correspond à la Vie Future du Model.Joueur
 */
public class VieFuture extends CollectionDeCartes {

    // =============================================== LES ATTRIBUTS ============================================ //
    private List<Card> cartesDeLaVieFuture;

    // ============================================= LE CONSTRUCTEUR ========================================= //
    public VieFuture() {
        cartesDeLaVieFuture = new ArrayList<Card>();
    }

    // =============================================== LES GETTERS ============================================ //
    public List<Card> getCartesDeLaVieFuture() {
        return cartesDeLaVieFuture;
    }


    // ============================================= LES METHODES ============================================ //

    // ============================================= ADD & REMOVE ============================================ //
    @Override
    public void addCard(Card carte) {
        cartesDeLaVieFuture.add(carte);
    }

    @Override
    public Card removeCard() {
        return cartesDeLaVieFuture.remove(0);
    }
}
