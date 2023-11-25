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
    public JoueurVirtuel(String strategie) {
        super.setNiveau(Niveau.BOUSIER);
    }

    @Override
    public String toString() {
        return "JoueurVirtuel{" +
                "•Pseudo = " + "CPU"+
                "  •Niveau = " + super.getNiveau() +
                "  •Main = " + super.getMain() +
                "  •Oeuvre = " + super.getOeuvre() +
                "  •Pile = " + super.getPile() +
                "  •Vie Future = " + super.getVieFuture() +
                "}";
    }

    // Strategie // Faire jouer 02 jouers virtuels en meme temps
}
