package Model.Cards;

/**
 * @author giovannizangue
 * <br>
 * Cette classe correspond aux <b>Anneaux Karmiques</b>
 */
public class AnneauKarmique  {

    // =============================================== LES ATTRIBUTS ========================================== //
    private final int points = 1;
    private static int nombreDAnneaux = 0;
    private static final int LIMITE_MAXIMALE = 12;


    // ============================================ LE CONSTRUCTEUR ========================================= //
    public AnneauKarmique() {
        nombreDAnneaux ++;
    }


    // ============================================ LES METHODES ========================================= //
    public int getPoints() {

        return points;
    }

    @Override
    public String toString() {
        return "anneauKarmique";
    }
}
