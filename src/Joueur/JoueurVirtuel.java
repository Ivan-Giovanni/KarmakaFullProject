package Joueur;

import Joueur.CollectionsDeCartes.Main;
import Joueur.CollectionsDeCartes.Oeuvre;
import Joueur.CollectionsDeCartes.Pile;
import Joueur.CollectionsDeCartes.VieFuture;

/**
 * @author giovannizangue
 * <br>
 * Cette classe est une specialisation de la classe Jouer. Elle correspond au <b>Joueur Virtuel</b> (Le CPU)
 */
public class JoueurVirtuel extends Joueur{


    // ====================================== LE CONSTRUCTEUR ============================================ //
    public JoueurVirtuel(Niveau niveau, String pseudo, String strategie,
                         Main main, Oeuvre ouevre, VieFuture vieFuture, Pile pile) {
        super(niveau, pseudo, strategie, main, ouevre, vieFuture, pile);
    }
}
