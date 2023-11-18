package Cards.CardsSpecifiques23;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Sauvetage
 */
public class Sauvetage extends Card {

    private static Sauvetage sauvetage1 = new Sauvetage();
    private static Sauvetage sauvetage2 = new Sauvetage();
    private static Sauvetage sauvetage3 = new Sauvetage();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Sauvetage() {
        super("Sauvetage", 2, Couleur.VERT);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static Sauvetage getSauvetage1() {
        if (sauvetage1 == null) {
            sauvetage1 = new Sauvetage();
            return sauvetage1;
        } else {
            return sauvetage1;
        }
    }

    public static Sauvetage getSauvetage2() {
        if (sauvetage2 == null) {
            sauvetage2 = new Sauvetage();
            return sauvetage2;
        } else {
            return sauvetage2;
        }
    }

    public static Sauvetage getSauvetage3() {
        if (sauvetage3 == null) {
            sauvetage3 = new Sauvetage();
            return sauvetage3;
        } else {
            return sauvetage3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
