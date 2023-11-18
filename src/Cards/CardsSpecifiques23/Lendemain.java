package Cards.CardsSpecifiques23;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Lendemain
 */
public class Lendemain extends Card {


    private static Lendemain lendemain1 = new Lendemain();
    private static Lendemain lendemain2 = new Lendemain();
    private static Lendemain lendemain3 = new Lendemain();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Lendemain() {
        super("Lendemain", 1, Couleur.VERT);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return Lendemain
     */
    public static Lendemain getLendemain1() {
        if (lendemain1 == null) {
            lendemain1 = new Lendemain();
            return lendemain1;
        } else {
            return lendemain1;
        }
    }

    public static Lendemain getLendemain2() {
        if (lendemain2 == null) {
            lendemain2 = new Lendemain();
            return lendemain2;
        } else {
            return lendemain2;
        }
    }

    public static Lendemain getLendemain3() {
        if (lendemain3 == null) {
            lendemain3 = new Lendemain();
            return lendemain3;
        } else {
            return lendemain3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
