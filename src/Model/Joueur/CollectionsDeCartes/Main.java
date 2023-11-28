package Model.Joueur.CollectionsDeCartes;


import Model.Cards.Card;
import Model.Cards.CardsSpecifiques23.Bassesse;
import Model.Cards.CardsSpecifiques23.CoupDOeil;
import Model.Cards.CardsSpecifiques23.Fournaise;
import Model.ReservesDeCartes.Source;

import java.util.ArrayList;
import java.util.List;

/**
 * @author giovannizangue
 * Classe de qui correspond à la main du Model.Joueur
 */
public class Main extends CollectionDeCartes {

	public Main() {
		super();
	}
    // =============================================== LES GETTERS ============================================ //
 /*   public List<Card> getCartesDeLaMain() {
       setNombreDeCartes(5);
        return cartesDeLaMain;
    }*/

    // =============================================== LES METHODES ============================================ //


    
	// ========================================== ADD_CARD & REMOVE_CARD ========================================= //
    @Override
    public void addCard(Card carte) {
    	this.listeDeCartes.add(carte);
    }
    @Override
    public Card removeCard(int index) {
        return this.listeDeCartes.remove(index);
    }
    
    public Card removeCard() {
    	return this.listeDeCartes.remove(0);
    }
    
    
    //================================================Methode main de la classe main =========================
    public static void main(String[] args) {
    	Main main1 = new Main();
    	main1.addCard(new Bassesse());
    	main1.addCard(new CoupDOeil() );
    	System.out.println(main1);
    	main1.removeCard();
    	System.out.println(main1);
    }

}
