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
 * Classe de la carte Coup d'oeil
 */
public class CoupDOeil extends Card {

    Scanner keyboard = new Scanner(System.in);


    // =========================================== LE CONSTRUCTEUR ========================================= //
    public CoupDOeil() {
        super("CoupDOeil", 1, Couleur.BLEU);
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    @Override
    public void executerCapacite(Partie partie) {
        /* Regarder la main du rival. Vous pouvez ensuite jouer une autre carte */
        System.out.println("EXECUTION DE LA CAPACITE DE LA CARTE 'COUP D'OEIL'...\n");

        if (partie.getActivePlayer().getMain().getCartesDeLaMain().contains(this)) {
            int indexOfThis = partie.getActivePlayer().getMain().getCartesDeLaMain().indexOf(this);
            partie.getFosse().addCard(
                    partie.getActivePlayer().getMain().getCartesDeLaMain().remove(indexOfThis)
            );
        }

        System.out.println("OPPONENT PLAYER'S Main: " +
                partie.getOpponentPlayer().getMain().getCartesDeLaMain() + "\n");

        try {
            Thread.sleep(2000);

            System.out.println(partie.getActivePlayer() + "\n");

            System.out.println("Entrez l'index de la carte de la main a jouer: ");
            int index = keyboard.nextInt();
            Card carteAJouer = partie.getActivePlayer().getMain().getCartesDeLaMain().get(index);

            Thread.sleep(2000);

            System.out.println("""
                    Choisir l'option de jeu:\s
                    •0 = Jouer pour ses points
                    •1 = Jouer pour ses pouvoirs
                    •2 = Jouer pour la vie future""");
            int index2 = keyboard.nextInt();
            if (index2 == 0) {
                partie.getActivePlayer().setOptionDeJeu(OptionDeJeu.POUR_SES_POINTS);
            } else if (index2 == 1) {
                partie.getActivePlayer().setOptionDeJeu(OptionDeJeu.POUR_SON_POUVOIR);
            } else if (index2 == 2) {
                partie.getActivePlayer().setOptionDeJeu(OptionDeJeu.POUR_LA_VIE_FUTURE);
            }
            OptionDeJeu optionDeJeu = partie.getActivePlayer().getOptionDeJeu();
            System.out.println("\nOption de jeu = " + optionDeJeu);

            Thread.sleep(2000);

            partie.getActivePlayer().jouer(carteAJouer, optionDeJeu);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
