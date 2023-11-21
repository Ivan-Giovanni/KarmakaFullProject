package Model.Cards;

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


    // =============================================== GETTERS & SETTERS ======================================= //
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEstVisible() {
        return estVisible;
    }

    public void setEstVisible(boolean estVisible) {
        this.estVisible = estVisible;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
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
    public abstract void executerCapacite();

}
