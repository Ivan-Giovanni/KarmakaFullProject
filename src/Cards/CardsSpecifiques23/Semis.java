package Cards.CardsSpecifiques23;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Semis
 */
public class Semis extends Card {


    // =========================================== LES ATTRIBUTS ========================================= //
    private static Semis semis1 = new Semis();
    private static Semis semis2 = new Semis();
    private static Semis semis3 = new Semis();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Semis() {
        super("Semis", 2, Couleur.VERT);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return destinee1
     */
    public static Semis getSemis1() {
        if (semis1 == null) {
            semis1 = new Semis();
            return semis1;
        } else {
            return semis1;
        }
    }

    public static Semis getSemis2() {
        if (semis2 == null) {
            semis2 = new Semis();
            return semis2;
        } else {
            return semis2;
        }
    }

    public static Semis getSemis3() {
        if (semis3 == null) {
            semis3 = new Semis();
            return semis3;
        } else {
            return semis3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
