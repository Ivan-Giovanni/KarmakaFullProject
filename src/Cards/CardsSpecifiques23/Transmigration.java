package Cards.CardsSpecifiques23;

import Cards.Card;
import Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la 1e carte Transmigration (il en exite 3)
 */
public class Transmigration extends Card {

    // =========================================== LES ATTRIBUTS ========================================= //
    private static Transmigration transmigration1 = new Transmigration();
    private static Transmigration transmigration2 = new Transmigration();
    private static Transmigration transmigration3 = new Transmigration();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private Transmigration() {
        super("Transmigration", 1, Couleur.BLEU);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return destinee1
     */
    public static Transmigration getTransmigration1() {
        if (transmigration1 == null) {
            transmigration1 = new Transmigration();
            return transmigration1;
        } else {
            return transmigration1;
        }
    }

    public static Transmigration getTransmigration2() {
        if (transmigration2 == null) {
            transmigration2 = new Transmigration();
            return transmigration2;
        } else {
            return transmigration2;
        }
    }

    public static Transmigration getTransmigration3() {
        if (transmigration3 == null) {
            transmigration3 = new Transmigration();
            return transmigration3;
        } else {
            return transmigration3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
