package Model.Joueur.CollectionsDeCartes;

import Model.Cards.Card;
import Model.ReservesDeCartes.Source;

import java.util.ArrayList;
import java.util.List;

/**
 * @author giovannizangue
 * Cette classe correspond à la pile du Model.Joueur
 */
public class Pile extends CollectionDeCartes{

    // =============================================== LES ATTRIBUTS ============================================ 

    // ============================================= LE CONSTRUCTEUR ============================================ //
    public Pile() {
        super();
    }

    // =============================================== LES GETTERS ============================================ //
  


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
