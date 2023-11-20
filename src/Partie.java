import Joueur.Joueur;
import ReservesDeCartes.Fosse;
import ReservesDeCartes.Source;
import Joueur.JoueurReel;
import Joueur.JoueurVirtuel;

import java.util.List;

/**
 * @author giovannizangue
 * <br>
 * Cette classe est la 1ere classe du jeu. C'est a partir d'elle que le jeu sera launch.
 * <br>
 * Etant donne qu'il n'existe qu'une seule partie, on va utiliser <b>SINGLETON PATTERN</b>
 */
public class Partie {


    // ====================================== LES ATTRIBUTS ============================================ //
    private static Partie partie;
    private Source source;
    private Fosse fosse;
    private List<Joueur> listeDeJouers;

    // ====================================== LES GETTERS ET SETTERS =========================================== //

    // ====================================== LES GETTERS =========================================== //
    public Source getSource() {
        return source;
    }

    public Fosse getFosse() {
        return fosse;
    }

    public List<Joueur> getListeDeJouers() {
        return listeDeJouers;
    }

    // ====================================== LES SETTERS =========================================== //
    public static void setPartie(Partie partie) {
        Partie.partie = partie;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void setFosse(Fosse fosse) {
        this.fosse = fosse;
    }

    public void setListeDeJouers(List<Joueur> listeDeJouers) {
        this.listeDeJouers = listeDeJouers;
    }

    // ====================================== LE CONSTRUCTEUR ============================================ //
    private Partie(Source source, Fosse fosse, List<Joueur> listeDeJouers) {
        this.source = source;
        this.fosse = fosse;
        listeDeJouers = listeDeJouers;
    }


    public Partie getPartie() {
        if (partie == null) {
            partie = new Partie(source, fosse, listeDeJouers);
            return partie;
        }
        else {
            return partie;
        }
    }

    // ====================================== LES METHODES ============================================ //

    // ====================================== EST_GAGNEE ============================================ //
    public boolean estGagne() {
        return false;
    }

    // ====================================== DESIGNER_GAGNANT ============================================ //
    public String designerGagnant() {
        return "CPU";    // On va modifier apres.
    }
}
