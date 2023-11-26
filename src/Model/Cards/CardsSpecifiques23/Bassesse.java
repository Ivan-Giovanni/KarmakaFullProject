package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;
import Model.Partie.Partie;

import java.util.Random;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la 1e carte Basses (il en exite 2)
 */
public class Bassesse extends Card {

    // =========================================== LES ATTRIBUTS ========================================= //


    // =========================================== LE CONSTRUCTEUR ========================================= //
    public Bassesse() {
        super("Bassesse", 3, Couleur.ROUGE);
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite(Partie partie) {
        /* Defausser 02 cartes au hasard de la main de votre rival */

        int tailleDeLaMain = partie.getOpponentPlayer().getMain().getCartesDeLaMain().size() - 1;
        Random random = new Random();

        partie.getOpponentPlayer().getMain().getCartesDeLaMain().remove(random.nextInt(tailleDeLaMain));
        tailleDeLaMain -= 1;
        partie.getOpponentPlayer().getMain().getCartesDeLaMain().remove(random.nextInt(tailleDeLaMain));

        System.out.println("RESULTAT:\n");
        System.out.println(partie.getOpponentPlayer());

    }
}
