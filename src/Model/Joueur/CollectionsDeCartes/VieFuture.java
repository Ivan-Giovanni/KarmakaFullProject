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
 

    // ============================================= LE CONSTRUCTEUR ========================================= //
    public VieFuture() {
        super();
    }

    // =============================================== LES GETTERS ============================================ //
    /*public List<Card> getCartesDeLaVieFuture() {
        return th;
    }*/


    // ============================================= LES METHODES ============================================ //

    // ============================================= ADD & REMOVE ============================================ //
 // =============================================== LES METHODES ============================================ //
    @Override
    public void addCard(Card carte) {
        this.listeDeCartes.add(carte);
    }
    @Override
    public Card removeCard() {
        return this.listeDeCartes.remove(0);
    }
    
    public Card removeCard(int index) {
        return this.listeDeCartes.remove(index);
    }
}
