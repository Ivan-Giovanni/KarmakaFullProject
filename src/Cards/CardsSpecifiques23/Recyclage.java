package Cards.CardsSpecifiques23;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Duperie
 */
public class Recyclage extends Card {

    private static Recyclage recyclage1 = new Recyclage();
    private static Recyclage recyclage2 = new Recyclage();
    private static Recyclage recyclage3 = new Recyclage();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Recyclage() {
        super("Recyclage", 1, Couleur.VERT);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static Recyclage getRecyclage1() {
        if (recyclage1 == null) {
            recyclage1 = new Recyclage();
            return recyclage1;
        } else {
            return recyclage1;
        }
    }

    public static Recyclage getRecyclage2() {
        if (recyclage2 == null) {
            recyclage2 = new Recyclage();
            return recyclage2;
        } else {
            return recyclage2;
        }
    }

    public static Recyclage getRecyclage3() {
        if (recyclage3 == null) {
            recyclage3 = new Recyclage();
            return recyclage3;
        } else {
            return recyclage3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
