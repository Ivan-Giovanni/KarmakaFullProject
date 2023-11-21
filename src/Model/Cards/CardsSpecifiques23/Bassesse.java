package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la 1e carte Basses (il en exite 2)
 */
public class Bassesse extends Card {

    // =========================================== LES ATTRIBUTS ========================================= //
    private static Bassesse bassesse1 = new Bassesse();
    private static Bassesse bassesse2 = new Bassesse();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Bassesse() {
        super("Bassesse", 3, Couleur.ROUGE);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 64 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return destinee1
     */
    public static Bassesse getBassesse1() {
        if (bassesse1 == null) {
            bassesse1 = new Bassesse();
            return bassesse1;
        } else {
            return bassesse1;
        }
    }

    public static Bassesse getBassesse2() {
        if (bassesse2 == null) {
            bassesse2 = new Bassesse();
            return bassesse2;
        } else {
            return bassesse2;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
