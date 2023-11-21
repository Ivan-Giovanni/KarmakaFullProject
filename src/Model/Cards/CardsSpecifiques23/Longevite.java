package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 */
public class Longevite extends Card {

    // =========================================== LES ATTRIBUTS ========================================= //
    private static Longevite longevite1 = new Longevite();
    private static Longevite longevite2 = new Longevite();
    private static Longevite longevite3 = new Longevite();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Longevite() {
        super("Longevite", 2, Couleur.VERT);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     * @return longevite 1
     */
    public static Longevite getLongevite1() {
        if (longevite1 == null) {
            longevite1 = new Longevite();
            return longevite1;
        }
        else {
            return longevite1;
        }
    }

    public static Longevite getLongetvite2() {
        if (longevite2 == null) {
            longevite2 = new Longevite();
            return longevite2;
        }
        else {
            return longevite2;
        }
    }

    public static Longevite getLongetvite3() {
        if (longevite3 == null) {
            longevite3 = new Longevite();
            return longevite3;
        }
        else {
            return longevite3;
        }
    }

    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }

}
