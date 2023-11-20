package Joueur;

/**
 * @author giovannizangue
 * <br>
 * Cette classe abstraite contient tous les attributs et les methodes d'un joueur.
 * <br>
 * Elle est <b>Abstraite</b> car on aura 02 types de joueurs (Joueur reel et joueur virtuel)
 * <br>
 * <b>Le Joueur Reel</b> aura sa propre classe. De même que le <b>Joueur Virtuel</b>
 */
public abstract class Joueur {

    // ====================================== LES ATTRIBUTS ============================================ //
    private Niveau niveau;
    private String pseudo;
    private String strategie; // Pour l'instant je met un String. On va modifier après
}
