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
public class Duperie extends Card {

    private static Duperie duperie1 = new Duperie();
    private static Duperie duperie2 = new Duperie();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Duperie() {
        super("Duperie", 3, Couleur.BLEU);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static Duperie getDuperie1() {
        if (duperie1 == null) {
            duperie1 = new Duperie();
            return duperie1;
        } else {
            return duperie1;
        }
    }

    public static Duperie getDuperie2() {
        if (duperie2 == null) {
            duperie2 = new Duperie();
            return duperie2;
        } else {
            return duperie2;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
