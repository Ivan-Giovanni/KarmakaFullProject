package Cards.CardsSpecifiques23;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Deni
 */
public class Deni extends Card {

    private static Deni deni1 = new Deni();
    private static Deni deni2 = new Deni();
    private static Deni deni3 = new Deni();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Deni() {
        super("Deni", 2, Couleur.BLEU);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static Deni getDeni1() {
        if (deni1 == null) {
            deni1 = new Deni();
            return deni1;
        } else {
            return deni1;
        }
    }

    public static Deni getDeni2() {
        if (deni2 == null) {
            deni2 = new Deni();
            return deni2;
        } else {
            return deni2;
        }
    }

    public static Deni getDeni3() {
        if (deni3 == null) {
            deni3 = new Deni();
            return deni3;
        } else {
            return deni3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
