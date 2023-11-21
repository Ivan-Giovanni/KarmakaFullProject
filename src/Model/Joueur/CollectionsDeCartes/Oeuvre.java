package Model.Joueur.CollectionsDeCartes;

import Model.Cards.Card;

import java.util.List;

/**
 * @author giovannizangue
 * Cette classe correspond à l'oeuvre du Model.Joueur
 */
public class Oeuvre extends CollectionDeCartes{

    // =============================================== LES ATTRIBUTS ============================================ //
    private List<Card> oeuvre;

    // ============================================= LE CONSTRUCTEUR ============================================ //
    public Oeuvre() {

    }

    // =============================================== LES GETTERS ============================================ //
    public List<Card> getOeuvre() {
        return oeuvre;
    }


    // ========================================= LES METHODES ============================================ //

    // ========================================= ADD & REMOVE ============================================ //
    @Override
    public void addCard(Card carte) {
        oeuvre.add(carte);
    }

    @Override
    public Card removeCard() {
        return oeuvre.remove(0);
    }

    // ================================= CALCULER NOMBRE DE POINTS ======================================= //
    public void CalculerNombreDePoints() {

    }

}
