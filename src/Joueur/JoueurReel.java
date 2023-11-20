package Joueur;

import Joueur.CollectionsDeCartes.Main;
import Joueur.CollectionsDeCartes.Oeuvre;
import Joueur.CollectionsDeCartes.Pile;
import Joueur.CollectionsDeCartes.VieFuture;

/**
 * @author giovannizangue
 * <br>
 * Cette classe est une specialisation de la classe joueur. Elle est specifique au <b>Joueur Reel</b>
 * (toi, moi, etc...)
 */
public class JoueurReel extends Joueur{


    // ====================================== LE CONSTRUCTEUR ============================================ //

    public JoueurReel(Niveau niveau, String pseudo, String strategie, Main main,
                      Oeuvre ouevre, VieFuture vieFuture, Pile pile) {
        super(niveau, pseudo, strategie, main, ouevre, vieFuture, pile);
    }
}
