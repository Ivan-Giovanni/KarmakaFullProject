package Model.Partie;

import Model.Joueur.Joueur;
import Model.ReservesDeCartes.Fosse;
import Model.ReservesDeCartes.Source;

import java.util.ArrayList;
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
    Source source;
    Fosse fosse;
    List<Joueur> listeDeJoueurs = new ArrayList<Joueur>();
    private EtatDeLaPartie etatDeLaPartie;


    // ====================================== LES GETTERS ET SETTERS =========================================== //

    // ====================================== LE CONSTRUCTEUR ============================================ //
    private Partie() {
        this.source = Source.Source();
        this.fosse = Fosse.Fosse();
        this.etatDeLaPartie = EtatDeLaPartie.CREATING;
    }

    public static Partie getPartie() {
        if (partie == null) {
            partie = new Partie();
            return partie;
        } else {
            return partie;
        }
    }

    // ====================================== LES GETTERS =========================================== //
    public EtatDeLaPartie getEtatDeLaPartie() {
        return etatDeLaPartie;
    }

    // ====================================== LES SETTERS =========================================== //


    // ====================================== LES METHODES ============================================ //

    // ====================================== EST_GAGNEE ============================================ //
    public void ajouterJoueur(Joueur joueur) {
        listeDeJoueurs.add(joueur);
    }

    // ====================================== EST_GAGNEE ============================================ //
    public boolean estGagne() {
        return false;
    }

    // ====================================== DESIGNER_GAGNANT ============================================ //
    public String designerGagnant() {
        return "CPU";    // On va modifier apres.
    }

    // ====================================== SAUVEGARDER PARTIE ========================================//
    public void sauvegarderPartie() {

    }

    // ===================================== CHARGER PARTIE =============================================//
    public void chargerPartie() {

    }


}
