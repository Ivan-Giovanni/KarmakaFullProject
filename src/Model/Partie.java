package Model;

import Model.Joueur.Joueur;
import Model.ReservesDeCartes.Fosse;
import Model.ReservesDeCartes.Source;

import java.util.List;

/**
 * @author giovannizangue
 * <br>
 * Cette classe est la 1ere classe du jeu. C'est a partir d'elle que le jeu sera launch.
 * <br>
 * Etant donne qu'il n'existe qu'une seule partie, on va utiliser <b>SINGLETON PATTERN</b>
 */
public class Partie {

	//Freddy est passé par là
    // ====================================== LES ATTRIBUTS ============================================ //
    private static Partie partie;
    private Source source;
    private Fosse fosse;
    private List<Joueur> listeDeJouers;

    // ====================================== LES GETTERS ET SETTERS =========================================== //

    // ====================================== LE CONSTRUCTEUR ============================================ //
    private Partie(Source source, Fosse fosse, List<Joueur> listeDeJouers) {
        this.source = source;
        this.fosse = fosse;
        listeDeJouers = listeDeJouers;
    }

    // ====================================== LES GETTERS =========================================== //
    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Fosse getFosse() {
        return fosse;
    }

    public void setFosse(Fosse fosse) {
        this.fosse = fosse;
    }

    public List<Joueur> getListeDeJouers() {
        return listeDeJouers;
    }

    public void setListeDeJouers(List<Joueur> listeDeJouers) {
        this.listeDeJouers = listeDeJouers;
    }

    public Partie getPartie() {
        if (partie == null) {
            partie = new Partie(source, fosse, listeDeJouers);
            return partie;
        } else {
            return partie;
        }
    }

    // ====================================== LES METHODES ============================================ //

    // ====================================== LES SETTERS =========================================== //
    public static void setPartie(Partie partie) {
        Partie.partie = partie;
    }

    // ====================================== EST_GAGNEE ============================================ //
    public boolean estGagne() {
        return false;
    }

    // ====================================== DESIGNER_GAGNANT ============================================ //
    public String designerGagnant() {
        return "CPU";    // On va modifier apres.
    }


}
