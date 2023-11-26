package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;
import Model.Partie.Partie;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la 1ere carte Destine (il en exite 3)
 */
public class Destinee extends Card {

    // =========================================== LES ATTRIBUTS ========================================= //

    // =========================================== LE CONSTRUCTEUR ========================================= //
    public Destinee() {
        super("Destinee", 2, Couleur.BLEU);
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite(Partie partie) {

    }

}
