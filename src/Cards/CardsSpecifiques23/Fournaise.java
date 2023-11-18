package Cards.CardsSpecifiques23;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Duperie
 */
public class Fournaise extends Card {

    private static Fournaise fournaise1 = new Fournaise();
    private static Fournaise fournaise2 = new Fournaise();
    private static Fournaise fournaise3 = new Fournaise();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Fournaise() {
        super("Fournaise", 2, Couleur.ROUGE);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static Fournaise getFournaise1() {
        if (fournaise1 == null) {
            fournaise1 = new Fournaise();
            return fournaise1;
        } else {
            return fournaise1;
        }
    }

    public static Fournaise getFournaise2() {
        if (fournaise2 == null) {
            fournaise2 = new Fournaise();
            return fournaise2;
        } else {
            return fournaise2;
        }
    }

    public static Fournaise getFournaise3() {
        if (fournaise3 == null) {
            fournaise3 = new Fournaise();
            return fournaise3;
        } else {
            return fournaise3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
