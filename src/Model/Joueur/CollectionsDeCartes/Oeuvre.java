package Model.Joueur.CollectionsDeCartes;

import Model.Cards.Card;
import Model.Cards.CardsSpecifiques23.Bassesse;
import Model.Cards.CardsSpecifiques23.CoupDOeil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author giovannizangue
 * Cette classe correspond à l'oeuvre du Model.Joueur
 */
public class Oeuvre extends CollectionDeCartes{

    // ============================================= LE CONSTRUCTEUR ========================================= //
    public Oeuvre() {
        super();
    }

    // ========================================= LES METHODES ============================================ //

    // ========================================= ADD & REMOVE ============================================ //
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
    
    //Cette methode retourne le nombre de points de l'oeuvre 
    // ================================= CALCULER NOMBRE DE POINTS ======================================= //
    public void CalculerNombreDePoints() {
    	
    }
    
    
    //================================================Methode main de la classe oeuvre =========================
    public static void main(String[] args) {
    	Oeuvre main1 = new Oeuvre();
    	main1.addCard(new Bassesse());
    	main1.addCard(new CoupDOeil() );
    	System.out.println(main1);
    	main1.removeCard();
    	System.out.println(main1);
    }



}
