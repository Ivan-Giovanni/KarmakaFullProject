package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;
import Model.Partie.Partie;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 */
public class Longevite extends Card {

    // =========================================== LES ATTRIBUTS ========================================= //

    // =========================================== LE CONSTRUCTEUR ========================================= //
    public Longevite() {
        super("Longevite", 2, Couleur.VERT);
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite(Partie partie) {

    }

}
