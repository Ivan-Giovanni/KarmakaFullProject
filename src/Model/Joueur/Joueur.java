package Model.Joueur;

import Model.Cards.Card;
import Model.Joueur.CollectionsDeCartes.Main;
import Model.Joueur.CollectionsDeCartes.Oeuvre;
import Model.Joueur.CollectionsDeCartes.Pile;
import Model.Joueur.CollectionsDeCartes.VieFuture;
import Model.Partie.Partie;

import java.util.Random;
import java.util.Scanner;

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
    private Niveau niveau;
    private String pseudo;
    private OptionDeJeu optionDeJeu;

    private Main main = new Main();
    private Oeuvre oeuvre = new Oeuvre();
    private VieFuture vieFuture = new VieFuture();
    private Pile pile = new Pile();
    private ReserveDAnneauxKarmique reserveDAnneauxKarmique = new ReserveDAnneauxKarmique();

    // ====================================== LES GETTERS ET SETTERS ============================================ //

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
    public void piocher(Card carte) {
        main.addCard(carte);
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
                jouerPourSonPouvoir(carte, Partie.getPartie());
                break;
            case POUR_LA_VIE_FUTURE:
                jouerPourLaVieFuture(carte);
                break;
        }
    }

    private void jouerPourSesPoints(Card carte) {
        System.out.println("\nLA CARTE EST EN TRAIN D'ETRE JOUEE POUR SES POINTS...\n");
        carte.utiliserPourSesPoints(Partie.getPartie());
    }


    private void jouerPourSonPouvoir(Card carte, Partie partie) {
        System.out.println("\nLA CARTE EST EN TRAIN D'ETRE JOUEE POUR SON POUVOIR...\n");

        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);

        try {

            if (partie.getActivePlayer() instanceof JoueurVirtuel) {

                if (partie.getOpponentPlayer() instanceof JoueurVirtuel) {

                    int myRandom = Math.abs(random.nextInt());

                    if (myRandom % 2 == 0) {
                        partie.getOpponentPlayer().getVieFuture().addCard(carte);
                        carte.executerCapaciteCPU(Partie.getPartie(), ((JoueurVirtuel) partie.getActivePlayer()).getStrategie());
                        partie.getFosse().getCartes().remove(carte);
                    } else {
                        carte.executerCapaciteCPU(Partie.getPartie(), ((JoueurVirtuel) partie.getActivePlayer()).getStrategie());
                    }


                    System.out.println("""
                                                
                            ACCEPTEZ VOUS QUE JE VOUS OFFRE CETTE CARTE?
                            •0 = Oui
                            •1 = Non
                            """);

                    if (myRandom % 2 == 0) {
                        System.out.println(0);
                        System.out.println("\nAJOUT DE LA CARTE A OPPONENT'S VIE FUTURE...\n");
                        Thread.sleep(1000);
                    } else
                        System.out.println(1);

                } else if (partie.getOpponentPlayer() instanceof JoueurReel) {
                    carte.executerCapaciteCPU(Partie.getPartie(), ((JoueurVirtuel) partie.getActivePlayer()).getStrategie());

                    System.out.println("""
                                                
                            ACCEPTEZ VOUS QUE JE VOUS OFFRE CETTE CARTE?
                            •0 = Oui
                            •1 = Non
                            """);
                    int reponse = keyboard.nextInt();

                    if (reponse == 0) {
                        System.out.println("\nAJOUT DE LA CARTE A OPPONENT'S VIE FUTURE...\n");
                        Thread.sleep(1000);

                        partie.getOpponentPlayer().getVieFuture().addCard(carte);
                        partie.getFosse().getCartes().remove(carte);
                    }

                }

            } else {

                int myRandom = Math.abs(random.nextInt());

                if (myRandom % 2 == 0) {
                    partie.getOpponentPlayer().getVieFuture().addCard(carte);
                    carte.executerCapacite(Partie.getPartie());
                    partie.getFosse().getCartes().remove(carte);
                } else {
                    carte.executerCapacite(Partie.getPartie());
                }


                System.out.println("""
                                            
                        ACCEPTEZ VOUS QUE JE VOUS OFFRE CETTE CARTE?
                        •0 = Oui
                        •1 = Non
                        """);

                if (myRandom % 2 == 0) {
                    System.out.println(0);
                    System.out.println("\nAJOUT DE LA CARTE A OPPONENT PLAYER'S VIE FUTURE...\n");
                    Thread.sleep(1000);
                } else
                    System.out.println(1);

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private void jouerPourLaVieFuture(Card carte) {
        System.out.println("\nLA CARTE EST EN TRAIN D'ETRE JOUEE POUR LA VIE FUTURE...\n");
        carte.utiliserPourLaVieFuture(Partie.getPartie());
    }


}
