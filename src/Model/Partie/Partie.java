package Model.Partie;

import Model.Joueur.Joueur;
import Model.Joueur.JoueurVirtuel;
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
    private TypeDePartie typeDePartie;


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

    // ==================================== LES GETTERS & SETTERS ========================================= //
    public EtatDeLaPartie getEtatDeLaPartie() {
        return etatDeLaPartie;
    }

    public TypeDePartie getTypeDePartie() {
        return typeDePartie;
    }

    public void setTypeDePartie(TypeDePartie typeDePartie) {
        this.typeDePartie = typeDePartie;
    }

    public void setEtatDeLaPartie(EtatDeLaPartie etatDeLaPartie) {
        this.etatDeLaPartie = etatDeLaPartie;
    }

    public List<Joueur> getListeDeJoueurs() {
        return listeDeJoueurs;
    }

    // ====================================== LES SETTERS =========================================== //


    // ====================================== LES METHODES ============================================ //

    // ================================== AJOUTER_JOUEURS_REEL_VS_CPU ======================================= //
    public void ajouterJoueurReelVsCPU(Joueur joueur) {
        listeDeJoueurs.add(joueur);
        listeDeJoueurs.add(new JoueurVirtuel("strategie1")); // On va modifier apres
    }

    // ================================== AJOUTER_JOUEURS_CPU_VS_CPU ======================================= //
    public void ajouterJoueurCPUvsCPU() {
        listeDeJoueurs.add(new JoueurVirtuel("Strategie1")); // On va modifier apres
        listeDeJoueurs.add(new JoueurVirtuel("Strategie2")); // On va modifier apres
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
