package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;
import Model.Partie.Partie;

import java.util.Random;
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
        System.out.println("EXECUTION DE LA CAPCITE DE LA CARTE 'CRISE'...\n");

        partie.getActivePlayer().getMain().getCartesDeLaMain().remove(this);

        if (!partie.getOpponentPlayer().getOeuvre().getCartesDeLOeuvre().isEmpty()) {
            Random random = new Random();
            int index = random.nextInt();
            partie.getOpponentPlayer().getOeuvre().getCartesDeLOeuvre().remove(index);
        }
    }
}
