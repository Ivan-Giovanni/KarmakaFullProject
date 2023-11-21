package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Panique
 */
public class Panique extends Card {

    private static Panique panique1 = new Panique();
    private static Panique panique2 = new Panique();
    private static Panique panique3 = new Panique();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Panique() {
        super("Panique", 1, Couleur.ROUGE);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static Panique getPanique1() {
        if (panique1 == null) {
            panique1 = new Panique();
            return panique1;
        } else {
            return panique1;
        }
    }

    public static Panique getPanique2() {
        if (panique2 == null) {
            panique2 = new Panique();
            return panique2;
        } else {
            return panique2;
        }
    }

    public static Panique getPanique3() {
        if (panique3 == null) {
            panique3 = new Panique();
            return panique3;
        } else {
            return panique3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
