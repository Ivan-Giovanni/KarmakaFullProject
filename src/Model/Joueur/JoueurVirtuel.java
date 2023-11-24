package Model.Joueur;

import Model.Joueur.CollectionsDeCartes.Main;
import Model.Joueur.CollectionsDeCartes.Oeuvre;
import Model.Joueur.CollectionsDeCartes.Pile;
import Model.Joueur.CollectionsDeCartes.VieFuture;

/**
 * @author giovannizangue
 * <br>
 * Cette classe est une specialisation de la classe Jouer. Elle correspond au <b>Model.Joueur Virtuel</b> (Le CPU)
 */
public class JoueurVirtuel extends Joueur{


    // ====================================== LE CONSTRUCTEUR ============================================ //
    public JoueurVirtuel(Niveau niveau, String pseudo, String strategie,
                         Main main, Oeuvre ouevre, VieFuture vieFuture, Pile pile) {
        super(niveau, pseudo, strategie, main, ouevre, vieFuture, pile);
    }

    // Strategie // Faire jouer 02 jouers virtuels en meme temps
}
