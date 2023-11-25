package Model.Joueur;

import Model.Cards.Card;
import Model.Cards.CardsSpecifiques23.Fournaise;
import Model.Joueur.CollectionsDeCartes.Main;
import Model.Joueur.CollectionsDeCartes.Oeuvre;
import Model.Joueur.CollectionsDeCartes.Pile;
import Model.Joueur.CollectionsDeCartes.VieFuture;

/**
 * @author giovannizangue
 * <br>
 * Cette classe abstraite contient tous les attributs et les methodes d'un joueur.
 * <br>
 * Elle est <b>Abstraite</b> car on aura 02 types de joueurs (Model.Joueur reel et joueur virtuel)
 * <br>
 * <b>Le Model.Joueur Reel</b> aura sa propre classe. De même que le <b>Model.Joueur Virtuel</b>
 */
public abstract class Joueur {

    // ====================================== LES ATTRIBUTS ============================================ //
    private Niveau niveau;
    private String pseudo;
    private String strategie; // Pour l'instant je met un String. On va modifier après

    private Main main;
    private Oeuvre oeuvre;
    private VieFuture vieFuture;
    private Pile pile;

    // ====================================== LES GETTERS ET SETTERS ============================================ //

    // ====================================== LES GETTERS ============================================ //

    public Niveau getNiveau() {
        return niveau;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getStrategie() {
        return strategie;
    }

    public Main getMain() {
        return main;
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    public VieFuture getVieFuture() {
        return vieFuture;
    }

    public Pile getPile() {
        return pile;
    }

    // ====================================== LES SETTERS ============================================ //

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setStrategie(String strategie) {
        this.strategie = strategie;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void setOeuvre(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
    }

    public void setVieFuture(VieFuture vieFuture) {
        this.vieFuture = vieFuture;
    }

    public void setPile(Pile pile) {
        this.pile = pile;
    }

    // ====================================== LE CONSTRUCTEUR ============================================ //



    // ====================================== LES METHODES ============================================ //

    // ====================================== PIOCHER ============================================ //
    public Card piocher() {
        return new Fournaise();   // On va modifier apres
    }

    // ====================================== JOUER ============================================ //
    public void jouer() {
        /* Je met void car je ne connais pas encore comment implementer cette methode */
    }



    // AZERTY


}
