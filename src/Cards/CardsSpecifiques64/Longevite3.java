package Cards.CardsSpecifiques64;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la 3e carte Longevite (il en exite 3)
 */
public class Longevite3 extends Card {

    // =========================================== LES ATTRIBUTS ========================================= //
    private static Longevite3 longetvite3 = new Longevite3();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Longevite3() {

        super("Longevite", 2, Couleur.VERT);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 64 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return longevite 2
     */
    public static Longevite3 getLongetvite2() {
        if (longetvite3 == null) {
            longetvite3 = new Longevite3();
            return longetvite3;
        } else {
            return longetvite3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }

}
