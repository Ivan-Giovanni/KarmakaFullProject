package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Roulette
 */
public class Roulette extends Card {

    private static Roulette roulette1 = new Roulette();
    private static Roulette roulette2 = new Roulette();
    private static Roulette roulette3 = new Roulette();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Roulette() {
        super("Deni", 2, Couleur.ROUGE);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return roulette
     */
    public static Roulette getRoulette1() {
        if (roulette1 == null) {
            roulette1 = new Roulette();
            return roulette1;
        } else {
            return roulette1;
        }
    }

    public static Roulette getRoulette2() {
        if (roulette2 == null) {
            roulette2 = new Roulette();
            return roulette2;
        } else {
            return roulette2;
        }
    }

    public static Roulette getRoulette3() {
        if (roulette3 == null) {
            roulette3 = new Roulette();
            return roulette3;
        } else {
            return roulette3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
