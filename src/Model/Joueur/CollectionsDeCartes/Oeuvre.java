package Model.Joueur.CollectionsDeCartes;

import Model.Cards.Card;
import Model.ReservesDeCartes.Source;

import java.util.ArrayList;
import java.util.List;

/**
 * @author giovannizangue
 * Cette classe correspond à l'oeuvre du Model.Joueur
 */
public class Oeuvre extends CollectionDeCartes{

    // =============================================== LES ATTRIBUTS ========================================= //
    private List<Card> cartesDeLOeuvre;

    // ============================================= LE CONSTRUCTEUR ========================================= //
    public Oeuvre() {
        cartesDeLOeuvre = new ArrayList<Card>();
    }

    // =============================================== LES GETTERS ============================================ //
    public List<Card> getCartesDeLOeuvre() {
        return cartesDeLOeuvre;
    }


    // ========================================= LES METHODES ============================================ //

    // ========================================= ADD & REMOVE ============================================ //
    @Override
    public void addCard(Card carte) {
        cartesDeLOeuvre.add(carte);
    }

    @Override
    public Card removeCard() {
        return cartesDeLOeuvre.remove(0);
    }

    // ================================= CALCULER NOMBRE DE POINTS ======================================= //
    public void CalculerNombreDePoints() {

    }

}
