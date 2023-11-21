package Model.ReservesDeCartes;

import Model.Cards.Card;
import Model.Cards.CardsSpecifiques23.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author giovannizangue
 * <br>
 * La fosse est l'endroit où seront jetées le cartes déja utilisée.
 * <br>
 * Etant donnée qu'il n'existe qu'une seule Soucre on va utiliser le <b>SINGLETON PATTERN</b>
 */
public class Source extends ReserveDeCartes {

    private static Source source = new Source();
    // =============================================== LES ATTRIBUTS ============================================ //
    List<Card> reserve = new LinkedList<Card>();

    // =========================================== LE CONSTRUCTEUR ========================================= //

    /**
     * On initialise la source avec l'ensemble des 64 cartes du jeu
     * <br>
     */
    private Source() {
        reserve.add(Bassesse.getBassesse1());
        reserve.add(Bassesse.getBassesse2());
        reserve.add(CoupDOeil.getCoupDOeil1());
        reserve.add(CoupDOeil.getCoupDOeil2());
        reserve.add(CoupDOeil.getCoupDOeil3());
        reserve.add(Crise.getCrise1());
        reserve.add(Crise.getCrise2());
        reserve.add(Crise.getCrise3());
        reserve.add(Deni.getDeni1());
        reserve.add(Deni.getDeni2());
        reserve.add(Deni.getDeni3());
        reserve.add(DernierSouffle.getDernierSouffle1());
        reserve.add(DernierSouffle.getDernierSouffle2());
        reserve.add(DernierSouffle.getDernierSouffle3());
        reserve.add(Destinee.getDestinee1());
        reserve.add(Destinee.getDestinee2());
        reserve.add(Destinee.getDestinee3());
        reserve.add(Duperie.getDuperie1());
        reserve.add(Duperie.getDuperie2());
        reserve.add(Fournaise.getFournaise1());
        reserve.add(Fournaise.getFournaise2());
        reserve.add(Fournaise.getFournaise3());
        reserve.add(Incarnation.getIncarnation1());
        reserve.add(Incarnation.getIncarnation2());
        reserve.add(Incarnation.getIncarnation3());
        reserve.add(Incarnation.getIncarnation4());
        reserve.add(Incarnation.getIncarnation5());
        reserve.add(Jubile.getJubile1());
        reserve.add(Jubile.getJubile2());
        reserve.add(Lendemain.getLendemain1());
        reserve.add(Lendemain.getLendemain2());
        reserve.add(Lendemain.getLendemain3());
        reserve.add(Longevite.getLongevite1());
        reserve.add(Longevite.getLongevite2());
        reserve.add(Longevite.getLongevite3());
        reserve.add(Mimetisme.getMimetisme1());
        reserve.add(Mimetisme.getMimetisme2());
        reserve.add(Panique.getPanique1());
        reserve.add(Panique.getPanique2());
        reserve.add(Panique.getPanique3());
        reserve.add(Recyclage.getRecyclage1());
        reserve.add(Recyclage.getRecyclage2());
        reserve.add(Recyclage.getRecyclage3());
        reserve.add(RevesBrises.getRevesBrises1());
        reserve.add(RevesBrises.getRevesBrises2());
        reserve.add(RevesBrises.getRevesBrises3());
        reserve.add(Roulette.getRoulette1());
        reserve.add(Roulette.getRoulette2());
        reserve.add(Roulette.getRoulette3());
        reserve.add(Sauvetage.getSauvetage1());
        reserve.add(Sauvetage.getSauvetage2());
        reserve.add(Sauvetage.getSauvetage3());
        reserve.add(Semis.getSemis1());
        reserve.add(Semis.getSemis2());
        reserve.add(Semis.getSemis3());
        reserve.add(Transmigration.getTransmigration1());
        reserve.add(Transmigration.getTransmigration2());
        reserve.add(Transmigration.getTransmigration3());
        reserve.add(Vengeance.getVengeance1());
        reserve.add(Vengeance.getVengeance2());
        reserve.add(Vol.getVol1());
        reserve.add(Vol.getVol2());
        reserve.add(Voyage.getVoyage1());
        reserve.add(Voyage.getVoyage2());

        this.reserve = reserve;
    }

    public static Source Source() {
        if (source == null) {
            source = new Source();
            return source;
        } else {
            return source;
        }
    }

    // =========================================== LES GETTERS ========================================= //

    // =========================================== GET_SIZE ========================================= //
    public int getSize() {
        return reserve.size();
    }

    // =========================================== TO_STRING ========================================= //

    @Override
    public String toString() {
        return "" + reserve + "";
    }

    // =========================================== LES METHODES ========================================= //
    // =========================================== MELANGER LES CARTES ========================================= //
    public void melanger() {
        Random random = new Random();
        for (int i=0; i<reserve.size(); i++) {
            Collections.swap(reserve, i, random.nextInt(reserve.size()));
        }
    }

    // =========================================== DISTRIBUER ========================================= //
    public Card distribuer() {
        return reserve.remove(0);
    }
}
