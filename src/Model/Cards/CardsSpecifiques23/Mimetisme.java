package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;
import Model.Partie.Partie;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Duperie
 */
public class Mimetisme extends Card {

    // =========================================== LE CONSTRUCTEUR ========================================= //
    public Mimetisme() {
        super("Mimetisme", 1, Couleur.MOSAIQUE);
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite(Partie partie) {

    }
}
