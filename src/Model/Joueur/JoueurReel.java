package Model.Joueur;

import Model.Joueur.CollectionsDeCartes.Main;
import Model.Joueur.CollectionsDeCartes.Oeuvre;
import Model.Joueur.CollectionsDeCartes.Pile;
import Model.Joueur.CollectionsDeCartes.VieFuture;

/**
 * @author giovannizangue
 * <br>
 * Cette classe est une specialisation de la classe joueur. Elle est specifique au <b>Model.Joueur Reel</b>
 * (toi, moi, etc...)
 */
public class JoueurReel extends Joueur{


    // ====================================== LE CONSTRUCTEUR ============================================ //

    public JoueurReel(Niveau niveau, String pseudo, String strategie, Main main,
                      Oeuvre ouevre, VieFuture vieFuture, Pile pile) {
        super(niveau, pseudo, strategie, main, ouevre, vieFuture, pile);
    }
}
