package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Coup d'oeil
 */
public class CoupDOeil extends Card {

    private static CoupDOeil coupDOeil1 = new CoupDOeil();
    private static CoupDOeil coupDOeil2 = new CoupDOeil();
    private static CoupDOeil coupDOeil3 = new CoupDOeil();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private CoupDOeil() {
        super("CoupDOeil", 1, Couleur.BLEU);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static CoupDOeil getCoupDOeil1() {
        if (coupDOeil1 == null) {
            coupDOeil1 = new CoupDOeil();
            return coupDOeil1;
        } else {
            return coupDOeil1;
        }
    }

    public static CoupDOeil getCoupDOeil2() {
        if (coupDOeil2 == null) {
            coupDOeil2 = new CoupDOeil();
            return coupDOeil2;
        } else {
            return coupDOeil2;
        }
    }

    public static CoupDOeil getCoupDOeil3() {
        if (coupDOeil3 == null) {
            coupDOeil3 = new CoupDOeil();
            return coupDOeil3;
        } else {
            return coupDOeil3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
