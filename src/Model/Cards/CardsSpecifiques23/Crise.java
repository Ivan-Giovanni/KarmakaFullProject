package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;
import Model.Partie.Partie;

import java.util.Scanner;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Crise
 */
public class Crise extends Card {

    Scanner keyboard = new Scanner(System.in);


    // =========================================== LE CONSTRUCTEUR ========================================= //
    public Crise() {
        super("Crise", 2, Couleur.ROUGE);
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite(Partie partie) {
        /* Le joueur de votre choix defausse une de ses oeuvres */

        if (!partie.getOpponentPlayer().getOeuvre().getCartesDeLOeuvre().isEmpty()) {
            System.out.println("\nChoisir l'index de la carte a defausser: ");
            int index = keyboard.nextInt();
            partie.getOpponentPlayer().getOeuvre().getCartesDeLOeuvre().remove(index);
        }
    }
}
