package ReservesDeCartes;

import Cards.Card;
import Cards.CardsSpecifiques23.Fournaise;

import java.util.LinkedList;
import java.util.List;

/**
 * @author giovannizangue
 * <br>
 * La fosse est l'endroit où seront jetées le cartes déja utilisée.
 * <br>
 * Etant donnée qu'il n'existe qu'une seule Soucre on va utiliser le <b>SINGLETON PATTERN</b>
 */
public class Source extends ReserveDeCartes{

    // =============================================== LES ATTRIBUTS ============================================ //
    List<Card> reserve = new LinkedList<Card>();
    private static Source source = new Source();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Source() {
        this.reserve = reserve;
    }

    public static Source Source() {
        if (source == null) {
            source = new Source();
            return source;
        }
        else {
            return source;
        }
    }

    // =========================================== LES METHODES ========================================= //
    // =========================================== MELANGER LES CARTES ========================================= //
    public void melanger(Card card) {

    }

    // =========================================== DISTRIBUER ========================================= //
    public Card distribuer() {

        return Fournaise.getFournaise1();   // On va modifier apres
    }
}
