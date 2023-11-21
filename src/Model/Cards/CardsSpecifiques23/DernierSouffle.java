package Model.Cards.CardsSpecifiques23;


import Model.Cards.Card;
import Model.Cards.Couleur;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Dernier Souffle
 */
public class DernierSouffle extends Card {

    private static DernierSouffle dernierSouffle1 = new DernierSouffle();
    private static DernierSouffle dernierSouffle2 = new DernierSouffle();
    private static DernierSouffle dernierSouffle3 = new DernierSouffle();

    // =========================================== LE CONSTRUCTEUR ========================================= //
    private DernierSouffle() {
        super("DernierSouffle", 1, Couleur.ROUGE);
    }


    /**
     * Etant donne qu'on va creer une classe pour chacune des 23 cartes du jeu, alors les instances de ces classes
     * doivent etre unique: <b>SINGLETON PATTERN</b>
     *
     * @return coupDOeil
     */
    public static DernierSouffle getDernierSouffle1() {
        if (dernierSouffle1 == null) {
            dernierSouffle1 = new DernierSouffle();
            return dernierSouffle1;
        } else {
            return dernierSouffle1;
        }
    }

    public static DernierSouffle getDernierSouffle2() {
        if (dernierSouffle2 == null) {
            dernierSouffle2 = new DernierSouffle();
            return dernierSouffle2;
        } else {
            return dernierSouffle2;
        }
    }

    public static DernierSouffle getDernierSouffle3() {
        if (dernierSouffle3 == null) {
            dernierSouffle3 = new DernierSouffle();
            return dernierSouffle3;
        } else {
            return dernierSouffle3;
        }
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite() {

    }
}
