package Model.Joueur;

import Model.Cards.CardsSpecifiques23.Bassesse;
import Model.Cards.CardsSpecifiques23.CoupDOeil;
import Model.Joueur.CollectionsDeCartes.Main;
import Model.Joueur.CollectionsDeCartes.Oeuvre;
import Model.Joueur.CollectionsDeCartes.Pile;
import Model.Joueur.CollectionsDeCartes.VieFuture;

/**
 * @author giovannizangue
 * <br>
 * Cette classe est une specialisation de la classe joueur. Elle est specifique au <b>Model.Joueur Reel</b>
 * (toi, moi, etc...)
 */
public class JoueurReel extends Joueur {


    // ====================================== LE CONSTRUCTEUR ============================================ //
    
	 public JoueurReel(String pseudo, OptionDeJeu optionDeJeu, Main main, Oeuvre oeuvre,
				VieFuture vieFuture, Pile pile ) {
			super( pseudo, optionDeJeu, main, oeuvre, vieFuture, pile);
		}
	
	 
    
    @Override
	public String toString() {
		return "JoueurReel [niveau=" + niveau + ", pseudo=" + pseudo + ", optionDeJeu=" + optionDeJeu + ", main=" + main
				+ ", oeuvre=" + oeuvre + ", vieFuture=" + vieFuture + ", pile=" + pile + ", reserveDAnneauxKarmique="
				+ reserveDAnneauxKarmique + "]";
	}
    
  //============================================Ajout du main pour les tests=========================
    public static void main(String[] args) {
    	Pile pile1 = new Pile();
    	pile1.addCard(new Bassesse());
    	pile1.addCard(new CoupDOeil());
    	Oeuvre oeuvre1 = new Oeuvre();
    	oeuvre1.addCard(new Bassesse());
    	oeuvre1.addCard(new CoupDOeil() );
    	VieFuture vieFuture1= new VieFuture();
    	Main main1 = new Main();
    	JoueurReel joueur1 = new JoueurReel("pouna",OptionDeJeu.POUR_LA_VIE_FUTURE,main1, oeuvre1, vieFuture1, pile1);
    	System.out.println(joueur1);
    	joueur1.piocher();
    	System.out.println(joueur1);
    	
    	
    }

	}
    
    
   


	


