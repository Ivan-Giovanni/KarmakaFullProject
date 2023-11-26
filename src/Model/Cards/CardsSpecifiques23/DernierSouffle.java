package Model.Cards.CardsSpecifiques23;


import Model.Cards.Card;
import Model.Cards.Couleur;
import Model.Partie.Partie;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Dernier Souffle
 */
public class DernierSouffle extends Card {

    // =========================================== LE CONSTRUCTEUR ========================================= //
    public DernierSouffle() {
        super("DernierSouffle", 1, Couleur.ROUGE);
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite(Partie partie) {

    }
}
