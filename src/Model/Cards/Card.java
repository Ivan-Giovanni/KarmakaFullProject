package Model.Cards;

import Model.Partie.Partie;

/**
 * @author giovannizangue
 * @version 1.0
 *
 * <br>
 * Cette classe contient les proprietes communes a toutes les 64 cartes du jeu
 */
public abstract class Card {


    // ====================================== LES ATTRIBUTS ============================================ //
    private String nom;
    private boolean estVisible = false;
    private int point;
    private Couleur couleur;


    // =============================================== GETTERS  ======================================= //
    public String getNom() {
        return nom;
    }

    public boolean isEstVisible() {
        return estVisible;
    }

    public int getPoint() {
        return point;
    }

    public Couleur getCouleur() {
        return couleur;
    }


    // =========================================== LE CONSTRUCTEUR ========================================= //

    /**
     * @param nom
     * @param point
     * @param couleur
     *
     * <br>
     * On contruit une carte avec son nom, ses points et sa couleur
     */
    public Card(String nom, int point, Couleur couleur) {
        this.nom = nom;
        this.point = point;
        this.couleur = couleur;
    }

    // =========================================== TOSTRING ================================================ //
    @Override
    public String toString() {
        return "(" + nom + ", " + point + ", " + couleur + ", " + estVisible + ")";
    }


    // ================================================= METHODES ============================================== //

    // =========================================== EXECUTER CAPACITE ========================================= //
    /**
     * <br>
     * Executer la capacite d'une carte
     */
    public abstract void executerCapacite(Partie partie);

    // ====================================== UTILISER POUR SES POINTS ===================================== //
    public void utiliserPourSesPoints(Partie partie) {

        try {

            System.out.println("\nAJOUT DE LA CARTE A VOS OEUVRES...\n");
            Thread.sleep(1000);

            partie.getActivePlayer().getOeuvre().addCard(this);
            partie.getActivePlayer().getMain().getCartesDeLaMain().remove(this);

            System.out.println("\nOPPONENT PLAYER's Oeuvre: " +
                    partie.getOpponentPlayer().getOeuvre().getCartesDeLOeuvre());
            System.out.println("FOSSE: " +
                    partie.getFosse().getCartes());
            System.out.println("•Nombre de cartes de la Fosse = " +
                    partie.getFosse().getCartes().size());
            System.out.println("•Nombre de cartes de la Source = " +
                    partie.getSource().getCartes().size());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ================================== UTILISER POUR LA VIE FUTURE ===================================== //
    public void utiliserPourLaVieFuture(Partie partie) {

        try {

            System.out.println("\nAJOUT DE LA CARTE A VOTRE VIE FUTURE...\n");
            Thread.sleep(1000);

            partie.getActivePlayer().getVieFuture().addCard(this);
            partie.getActivePlayer().getMain().getCartesDeLaMain().remove(this);

            System.out.println("\nOPPONENT PLAYER's Oeuvre: " +
                    partie.getOpponentPlayer().getOeuvre().getCartesDeLOeuvre());
            System.out.println("FOSSE: " +
                    partie.getFosse().getCartes());
            System.out.println("•Nombre de cartes de la Fosse = " +
                    partie.getFosse().getCartes().size());
            System.out.println("•Nombre de cartes de la Source = " +
                    partie.getSource().getCartes().size());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
