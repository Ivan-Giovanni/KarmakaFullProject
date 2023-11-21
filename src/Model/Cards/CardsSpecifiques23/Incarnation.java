package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Duperie
 */
public class Incarnation extends Card {

    private static Incarnation incarnation1 = new Incarnation();
    private static Incarnation incarnation2 = new Incarnation();
    private static Incarnation incarnation3 = new Incarnation();
    private static Incarnation incarnation4 = new Incarnation();
    private static Incarnation incarnation5 = new Incarnation();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Incarnation() {
        super("Incarnation", 1, Couleur.MOSAIQUE);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static Incarnation getIncarnation1() {
        if (incarnation1 == null) {
            incarnation1 = new Incarnation();
            return incarnation1;
        } else {
            return incarnation1;
        }
    }

    public static Incarnation getIncarnation2() {
        if (incarnation2 == null) {
            incarnation2 = new Incarnation();
            return incarnation2;
        } else {
            return incarnation2;
        }
    }

    public static Incarnation getIncarnation3() {
        if (incarnation3 == null) {
            incarnation3 = new Incarnation();
            return incarnation3;
        } else {
            return incarnation3;
        }
    }

    public static Incarnation getIncarnation4() {
        if (incarnation4 == null) {
            incarnation4 = new Incarnation();
            return incarnation4;
        } else {
            return incarnation4;
        }
    }

    public static Incarnation getIncarnation5() {
        if (incarnation5 == null) {
            incarnation5 = new Incarnation();
            return incarnation5;
        } else {
            return incarnation5;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
