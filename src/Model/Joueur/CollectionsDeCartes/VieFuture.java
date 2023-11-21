package Model.Joueur.CollectionsDeCartes;

import Model.Cards.Card;

import java.util.List;

/**
 * @author giovannizangue
 * <br>
 * Cette classe correspond à la Vie Future du Model.Joueur
 */
public class VieFuture extends CollectionDeCartes {

    // =============================================== LES ATTRIBUTS ============================================ //
    private List<Card> vieFuture;

    // =============================================== LES GETTERS ============================================ //
    private List<Card> getVieFuture() {
        return vieFuture;
    }


    // ============================================= LES METHODES ============================================ //

    // ============================================= ADD & REMOVE ============================================ //
    @Override
    public void addCard(Card carte) {

    }

    @Override
    public Card removeCard() {
        return null;
    }
}
