package Model.Joueur.CollectionsDeCartes;


import Model.Cards.Card;
import Model.Cards.CardsSpecifiques23.Fournaise;
import Model.ReservesDeCartes.Source;

import java.util.List;

/**
 * @author giovannizangue
 * Classe de la qui correspond à la main du Model.Joueur
 */
public class Main extends CollectionDeCartes {

    // =============================================== LES ATTRIBUTS ============================================ //
    private List<Card> main;

    // ============================================ LE CONSTRUCTEUR ============================================ //
    public Main() {
        main = Source.Source().distribuerMain();
    }

    // =============================================== LES GETTERS ============================================ //
    public List<Card> getMain() {
        setNombreDeCartes(5);
        return main;
    }

    // =============================================== LES METHODES ============================================ //


    // ========================================== ADD_CARD & REMOVE_CARD ========================================= //
    @Override
    public void addCard(Card carte) {
        incrementNombreDeCartes();
        main.add(carte);
    }
    @Override
    public Card removeCard() {
        decrementNombreDeCartes();
        return main.remove(0);
    }


}
