package Model.Joueur;

import Model.Cards.AnneauKarmique;

import java.util.ArrayList;
import java.util.List;

public class ReserveDAnneauxKarmique {

    // =============================================== LES ATTRIBUTS ============================================ //
    List<AnneauKarmique> reserve = new ArrayList<AnneauKarmique>();

    // ============================================ LE CONSTRUCTEUR ============================================ //
    public ReserveDAnneauxKarmique() {
    }

    // =============================================== LES GETTERS ============================================ //
    public List<AnneauKarmique> getReserve() {
        return reserve;
    }

    public int getNombreDAnneaux() {
        return reserve.size();
    }

    // =============================================== LES METHODES ============================================ //


    // ========================================== ADD & REMOVE ========================================= //
    public void addAnneauKarmique(AnneauKarmique anneauKarmique) {
        reserve.add(anneauKarmique);
    }

    public void removeAnneauKarmique() {
        reserve.remove(0);
    }
}
