package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;
import Model.Partie.Partie;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Sauvetage
 */
public class Sauvetage extends Card {



    // =========================================== LE CONSTRUCTEUR ========================================= //
    public Sauvetage() {
        super("Sauvetage", 2, Couleur.VERT);
    }





    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite(Partie partie) {

    }
}
