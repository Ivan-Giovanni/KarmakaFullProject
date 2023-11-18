package Cards.CardsSpecifiques64;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la 1ere carte Longevite (il en exite 3)
 */
public class Longevite1 extends Card {

    // =========================================== LES ATTRIBUTS ========================================= //
    private static Longevite1 longetvite1 = new Longevite1();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Longevite1() {
        super("Longevite", 2, Couleur.VERT);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 64 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     * @return longevite 1
     */
    public static Longevite1 getLongetvite1() {
        if (longetvite1 == null) {
            longetvite1 = new Longevite1();
            return longetvite1;
        }
        else {
            return longetvite1;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }

}
