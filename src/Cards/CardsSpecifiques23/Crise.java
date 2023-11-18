package Cards.CardsSpecifiques23;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Crise
 */
public class Crise extends Card {

    private static Crise crise1 = new Crise();
    private static Crise crise2 = new Crise();
    private static Crise crise3 = new Crise();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Crise() {
        super("Crise", 2, Couleur.ROUGE);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static Crise getCrise1() {
        if (crise1 == null) {
            crise1 = new Crise();
            return crise1;
        } else {
            return crise1;
        }
    }

    public static Crise getCrise2() {
        if (crise2 == null) {
            crise2 = new Crise();
            return crise2;
        } else {
            return crise2;
        }
    }

    public static Crise getCrise3() {
        if (crise3 == null) {
            crise3 = new Crise();
            return crise3;
        } else {
            return crise3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
