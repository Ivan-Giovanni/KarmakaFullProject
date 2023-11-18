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
public class Mimetisme extends Card {

    private static Mimetisme mimetisme1 = new Mimetisme();
    private static Mimetisme mimetisme2 = new Mimetisme();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Mimetisme() {
        super("Mimetisme", 1, Couleur.MOSAIQUE);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static Mimetisme getMimetisme1() {
        if (mimetisme1 == null) {
            mimetisme1 = new Mimetisme();
            return mimetisme1;
        } else {
            return mimetisme1;
        }
    }

    public static Mimetisme getMimetisme2() {
        if (mimetisme2 == null) {
            mimetisme2 = new Mimetisme();
            return mimetisme2;
        } else {
            return mimetisme2;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
