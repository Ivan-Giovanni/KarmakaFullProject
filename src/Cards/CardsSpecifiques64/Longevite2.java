package Cards.CardsSpecifiques64;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la 2e carte Longevite (il en exite 3)
 */
public class Longevite2 extends Card {

    // =========================================== LES ATTRIBUTS ========================================= //
    private static Longevite2 longetvite2 = new Longevite2();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Longevite2() {

        super("Longevite", 2, Couleur.VERT);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 64 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return longevite 2
     */
    public static Longevite2 getLongetvite2() {
        if (longetvite2 == null) {
            longetvite2 = new Longevite2();
            return longetvite2;
        } else {
            return longetvite2;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }

}
