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
public class Voyage extends Card {

    private static Voyage voyage1 = new Voyage();
    private static Voyage voyage2 = new Voyage();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Voyage() {
        super("Voyage", 3, Couleur.VERT);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static Voyage getVoyage1() {
        if (voyage1 == null) {
            voyage1 = new Voyage();
            return voyage1;
        } else {
            return voyage1;
        }
    }

    public static Voyage getVoyage2() {
        if (voyage2 == null) {
            voyage2 = new Voyage();
            return voyage2;
        } else {
            return voyage2;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
