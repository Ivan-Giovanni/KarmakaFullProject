package Cards.CardsSpecifiques23;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Reves Brises
 */
public class RevesBrises extends Card {

    private static RevesBrises revesBrises1 = new RevesBrises();
    private static RevesBrises revesBrises2 = new RevesBrises();
    private static RevesBrises revesBrises3 = new RevesBrises();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private RevesBrises() {
        super("RevesBrises", 2, Couleur.BLEU);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static RevesBrises getRevesBrises1() {
        if (revesBrises1 == null) {
            revesBrises1 = new RevesBrises();
            return revesBrises1;
        } else {
            return revesBrises1;
        }
    }

    public static RevesBrises getRevesBrises2() {
        if (revesBrises2 == null) {
            revesBrises2 = new RevesBrises();
            return revesBrises2;
        } else {
            return revesBrises2;
        }
    }

    public static RevesBrises getRevesBrises3() {
        if (revesBrises3 == null) {
            revesBrises3 = new RevesBrises();
            return revesBrises3;
        } else {
            return revesBrises3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
