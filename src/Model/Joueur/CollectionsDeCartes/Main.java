package Model.Joueur.CollectionsDeCartes;


import Model.ReservesDeCartes.Source;

/**
 * @author giovannizangue
 * Classe de la qui correspond à la main du Model.Joueur
 */
public class Main extends CollectionDeCartes{

    public Main() {
        Source.Source().distribuerMain();
    }
}
