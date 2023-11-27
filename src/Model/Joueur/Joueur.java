package Model.Joueur;

import Model.Cards.Card;
import Model.Joueur.CollectionsDeCartes.Main;
import Model.Joueur.CollectionsDeCartes.Oeuvre;
import Model.Joueur.CollectionsDeCartes.Pile;
import Model.Joueur.CollectionsDeCartes.VieFuture;
import Model.Partie.Partie;

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
    protected Niveau niveau;
    protected String pseudo;
    protected OptionDeJeu optionDeJeu;
    protected Main main;
    protected Oeuvre oeuvre;
    protected VieFuture vieFuture;
    protected Pile pile;
    protected ReserveDAnneauxKarmique reserveDAnneauxKarmique;

    // ====================================== CONSTRUCTEUR DE JOUEUR============================================ //
    
    public Joueur(String pseudo, OptionDeJeu optionDeJeu, Main main, Oeuvre oeuvre, VieFuture vieFuture,
			Pile pile) {
		this.niveau = Niveau.BOUSIER;
		this.pseudo = pseudo;
		this.optionDeJeu = optionDeJeu;
		this.main = main;
		this.oeuvre = oeuvre;
		this.vieFuture = vieFuture;
		this.pile = pile;
		this.reserveDAnneauxKarmique = null;
	}

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

    public OptionDeJeu getOptionDeJeu() {
        return optionDeJeu;
    }

    public void setOptionDeJeu(OptionDeJeu optionDeJeu) {
        this.optionDeJeu = optionDeJeu;
    }

    // ====================================== LES METHODES ============================================ //

    // ====================================== PIOCHER ============================================ //
    /**
     * Cette Methode permet au joueur de tirer une carte de sa pile pour l'ajoouter à la main
     * @param carte
     */
    public void piocher() {
        main.addCard(pile.removeCard());
    }
    
    

    // ====================================== PASSER ============================================ //
    public void passer() {

    }

    // ====================================== JOUER ============================================ //
    public void jouer(Card carte, OptionDeJeu optionDeJeu) {
        switch (optionDeJeu) {
            case POUR_SES_POINTS:
                jouerPourSesPoints(carte);
                break;
            case POUR_SON_POUVOIR:
                jouerPourSonPouvoir(carte);
                break;
            case POUR_LA_VIE_FUTURE:
                jouerPourLaVieFuture(carte);
                break;
        }
    }

    private void jouerPourSesPoints(Card carte) {
        System.out.println("\nLA CARTE EST EN TRAIN D'ETRE JOUEE POUR SES POINTS...\n");
    }

    private void jouerPourSonPouvoir(Card carte) {
        System.out.println("\nLA CARTE EST EN TRAIN D'ETRE JOUEE POUR SON POUVOIR...\n");
        carte.executerCapacite(Partie.getPartie());
    }

    private void jouerPourLaVieFuture(Card carte) {
        System.out.println("\nLA CARTE EST EN TRAIN D'ETRE JOUEE POUR LA VIE FUTURE...\n");
    }
    
    

}
