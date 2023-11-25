package Model.Partie;

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

    // ====================================== LES ATTRIBUTS ============================================ //
    private static Partie partie;
    Source source;


    // ====================================== LES GETTERS ET SETTERS =========================================== //

    // ====================================== LE CONSTRUCTEUR ============================================ //
    private Partie() {
       source = Source.Source();
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




    // ====================================== LES SETTERS =========================================== //
    public static void setPartie(Partie partie) {
        Partie.partie = partie;
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
    // ====================================== SAUVEGARDER PARTIE ========================================//
    public void sauvegarderPartie() {
    	
    }
    // ===================================== CHARGER PARTIE =============================================//
    public void chargerPartie() {
    	
    }


}
