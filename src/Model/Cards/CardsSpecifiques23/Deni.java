package Model.Cards.CardsSpecifiques23;

import Model.Cards.Card;
import Model.Cards.Couleur;
import Model.Joueur.OptionDeJeu;
import Model.Partie.Partie;

import java.util.Scanner;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Classe de la carte Deni
 */
public class Deni extends Card {

    Scanner keyboard = new Scanner(System.in);

    // =========================================== LE CONSTRUCTEUR ========================================= //
    public Deni() {
        super("Deni", 2, Couleur.BLEU);
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite(Partie partie) {
        /* Defausser une carte de votre main. Copier le pouvoir de cette carte. */
        System.out.println("EXECUTION DE LA CAPACITE DE LA CARTE 'DENI'...\n");

        if (partie.getActivePlayer().getMain().getCartesDeLaMain().contains(this)) {
            int indexOfThis = partie.getActivePlayer().getMain().getCartesDeLaMain().indexOf(this);
            partie.getFosse().addCard(
                    partie.getActivePlayer().getMain().getCartesDeLaMain().remove(indexOfThis)
            );
        }

        try {
            Thread.sleep(2000);

            System.out.println(partie.getActivePlayer() + "\n");

            if (!partie.getActivePlayer().getMain().getCartesDeLaMain().isEmpty()) {
                System.out.println("Entrez l'index de la carte de la main a defausser: ");
                int index = keyboard.nextInt();
                Card carteAJouer = partie.getActivePlayer().getMain().getCartesDeLaMain().get(index);

                Thread.sleep(1000);

                partie.getActivePlayer().setOptionDeJeu(OptionDeJeu.POUR_SON_POUVOIR);
                OptionDeJeu optionDeJeu = partie.getActivePlayer().getOptionDeJeu();

                partie.getActivePlayer().jouer(carteAJouer, optionDeJeu);
            } else {
                System.out.println("Vous n'avez pas assez de cartes dans votre main!w");
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
