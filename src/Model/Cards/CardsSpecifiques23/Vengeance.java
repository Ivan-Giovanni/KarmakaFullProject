package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;
import Model.Partie.Partie;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Veangeance
 */
public class Vengeance extends Card {


    // =========================================== LES ATTRIBUTS ========================================= //

    // =========================================== LE CONSTRUCTEUR ========================================= //
    public Vengeance() {
        super("Vengeance", 3, Couleur.ROUGE);
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite(Partie partie) {

    }
}
