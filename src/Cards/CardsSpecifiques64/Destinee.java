package Cards.CardsSpecifiques64;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la 1ere carte Destine (il en exite 3)
 */
public class Destinee extends Card {

    // =========================================== LES ATTRIBUTS ========================================= //
    private static Destinee destinee1 = new Destinee();
    private static Destinee destinee2 = new Destinee();
    private static Destinee destinee3 = new Destinee();


    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Destinee() {
        super("Destinee", 2, Couleur.BLEU);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     * @return destinee1
     */
    public static Destinee getDestinee1() {
        if (destinee1 == null) {
            destinee1 = new Destinee();
            return destinee1;
        }
        else {
            return destinee1;
        }
    }

    public static Destinee getDestinee2() {
        if (destinee2 == null) {
            destinee2 = new Destinee();
            return destinee2;
        }
        else {
            return destinee2;
        }
    }

    public static Destinee getDestinee3() {
        if (destinee3 == null) {
            destinee3 = new Destinee();
            return destinee3;
        }
        else {
            return destinee3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }

}
