package Cards.CardsSpecifiques64;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Veangeance
 */
public class Vengeance extends Card {


    // =========================================== LES ATTRIBUTS ========================================= //
    private static Vengeance vengeance1 = new Vengeance();
    private static Vengeance vengeance2 = new Vengeance();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Vengeance() {
        super("Vengeance", 3, Couleur.ROUGE);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return destinee1
     */
    public static Vengeance getVengeance1() {
        if (vengeance1 == null) {
            vengeance1 = new Vengeance();
            return vengeance1;
        } else {
            return vengeance1;
        }
    }

    public static Vengeance getVengeance2() {
        if (vengeance2 == null) {
            vengeance2 = new Vengeance();
            return vengeance2;
        } else {
            return vengeance2;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
