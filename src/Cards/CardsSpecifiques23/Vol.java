package Cards.CardsSpecifiques23;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Vol
 */
public class Vol extends Card {


    private static Vol vol1 = new Vol();
    private static Vol vol2 = new Vol();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Vol() {
        super("Vol", 3, Couleur.BLEU);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static Vol getVol1() {
        if (vol1 == null) {
            vol1 = new Vol();
            return vol1;
        } else {
            return vol1;
        }
    }

    public static Vol getVol2() {
        if (vol2 == null) {
            vol2 = new Vol();
            return vol2;
        } else {
            return vol2;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
