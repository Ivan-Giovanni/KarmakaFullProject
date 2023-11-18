package Cards.CardsSpecifiques23;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Jubile
 */
public class Jubile extends Card {

    private static Jubile jubile1 = new Jubile();
    private static Jubile jubile2 = new Jubile();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Jubile() {
        super("Jubile", 3, Couleur.VERT);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return jubile
     */
    public static Jubile getJubile1() {
        if (jubile1 == null) {
            jubile1 = new Jubile();
            return jubile1;
        } else {
            return jubile1;
        }
    }

    public static Jubile getJubile2() {
        if (jubile2 == null) {
            jubile2 = new Jubile();
            return jubile2;
        } else {
            return jubile2;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
