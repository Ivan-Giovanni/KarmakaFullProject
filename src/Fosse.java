import Cards.Card;

import java.util.LinkedList;
import java.util.List;

/**
 * @author giovannizangue
 * <br>
 * La fosse est l'endroit où seront jetées le cartes déja utilisée.
 * <br>
 * Etant donnée qu'il n'existe qu'une seule Fosse on va utiliser le <b>SINGLETON PATTERN</b>
 */
public class Fosse extends ReserveDeCartes {

    // =============================================== LES ATTRIBUTS ============================================ //
    List<Card> reserve = new LinkedList<Card>();
    private static Fosse fosse = new Fosse();


    // =========================================== LE CONSTRUCTEUR ========================================= //
    public Fosse() {
        this.reserve = reserve;
    }

}
