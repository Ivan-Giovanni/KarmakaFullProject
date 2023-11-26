package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;
import Model.Partie.Partie;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Coup d'oeil
 */
public class CoupDOeil extends Card {


    // =========================================== LE CONSTRUCTEUR ========================================= //
    public CoupDOeil() {
        super("CoupDOeil", 1, Couleur.BLEU);
    }



    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite(Partie partie) {
        /* Regarder la main du rival. Vous pouvez ensuite jouer une autre carte */
        System.out.println("EXECUTION DE LA CAPCITE DE LA CARTE 'COUP D'OEIL'...");

        System.out.println(partie.getOpponentPlayer().getMain().getCartesDeLaMain());
        // Jouer une autre carte
    }
}
