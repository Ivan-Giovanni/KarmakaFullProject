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

    private Main main = new Main();
    private Oeuvre oeuvre = new Oeuvre();
    private VieFuture vieFuture = new VieFuture();
    private Pile pile = new Pile();
    private ReserveDAnneauxKarmique reserveDAnneauxKarmique = new ReserveDAnneauxKarmique();

    // ====================================== LES GETTERS ET SETTERS ============================================ //

    // ==================================== LES GETTERS & SETTERS ========================================== //

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
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

    public ReserveDAnneauxKarmique getReserveDAnneauxKarmique() {
        return reserveDAnneauxKarmique;
    }

    // ====================================== LE CONSTRUCTEUR ============================================ //


    // ====================================== LES METHODES ============================================ //

    // ====================================== PIOCHER ============================================ //
    public Card piocher() {
        return new Fournaise();   // On va modifier apres
    }

    // ====================================== JOUER ============================================ //
    public void jouer(Card carte, OptionDeJeu optionDeJeu) {
        switch (optionDeJeu) {
            case POUR_SES_POINTS:
                jouerPourSesPoints(carte);
            case POUR_SON_POUVOIR:
                jouerPourSonPouvoir(carte);
            case POUR_LA_VIE_FUTURE:
                jouerPourLaVieFuture(carte);
        }
    }

    private void jouerPourSesPoints(Card carte) {

    }

    private void jouerPourSonPouvoir(Card carte) {

    }

    private void jouerPourLaVieFuture(Card carte) {

    }


}
