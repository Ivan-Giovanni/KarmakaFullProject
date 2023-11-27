package Model.Joueur;

import Model.Joueur.CollectionsDeCartes.Main;
import Model.Joueur.CollectionsDeCartes.Oeuvre;
import Model.Joueur.CollectionsDeCartes.Pile;
import Model.Joueur.CollectionsDeCartes.VieFuture;

/**
 * @author giovannizangue
 * <br>
 * Cette classe est une specialisation de la classe Jouer. Elle correspond au <b>Model.Joueur Virtuel</b> (Le CPU)
 */
public class JoueurVirtuel extends Joueur{

	private String strategie;
	
    // ====================================== LE CONSTRUCTEUR ============================================ //
	public JoueurVirtuel(String pseudo, OptionDeJeu optionDeJeu, Main main, Oeuvre oeuvre, VieFuture vieFuture,
			Pile pile, String strategie) {
		super(pseudo, optionDeJeu, main, oeuvre, vieFuture, pile);
		this.strategie = strategie;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "JoueurVirtuel [strategie=" + strategie + ", niveau=" + niveau + ", pseudo=" + pseudo + ", optionDeJeu="
				+ optionDeJeu + ", main=" + main + ", oeuvre=" + oeuvre + ", vieFuture=" + vieFuture + ", pile=" + pile
				+ ", reserveDAnneauxKarmique=" + reserveDAnneauxKarmique + "]";
	}

	
    

	

    // Strategie // Faire jouer 02 jouers virtuels en meme temps
}
