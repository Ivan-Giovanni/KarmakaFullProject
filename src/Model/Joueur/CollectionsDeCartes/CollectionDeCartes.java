package Model.Joueur.CollectionsDeCartes;

import Model.Cards.Card;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author giovannizangue
 * <br>
 * Cette classe abstraite est la classe mere des collections de cartes que possede le jouer <b>Main,
 * Pile, Oeuvre, VieFuture</b>
 */
public abstract class CollectionDeCartes {

    //private static int nombreDeCartes;

    protected ArrayList<Card> listeDeCartes;
        
    // ====================================== LES GETTERS ET SETTERS ========================================== //
    /*protected void setNombreDeCartes(int nbre) {
        nombreDeCartes = nbre;
    }*/

    // ========================================= LE CONSTRUCTEUR ============================================ //
    public CollectionDeCartes() {
		this.listeDeCartes = new ArrayList<Card>();
	}
    

    @Override
	public String toString() {
		return "CollectionDeCartes [listeDeCartes=" + listeDeCartes + "]";
	}


	// ========================================= LES METHODES ============================================ //
    //permet d'ajouter une carte à la collection 
    public abstract void addCard(Card carte);

	//permet de retirer une carte à la collection
    public abstract Card removeCard();
    
    //permet de retirer une carte spécifique de la liste
    public abstract Card removeCard(int index);
    
   /* protected void decrementNombreDeCartes() {
        nombreDeCartes -= 1;
    }

    protected void incrementNombreDeCartes() {
        nombreDeCartes += 1;
    }*/


}
