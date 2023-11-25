package View;

import Controller.GameController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author giovannizangue
 * Cette classe impletment le <b>PATTERN COMPOSITE</b>.
 * <br>
 * Il nous permettra de run le jeu sur plusieurs vues en meme temps (CommandLineView et GUIview)
 */
public class GameViewables implements GameViewable{

    // =================================== LES ATTRIBUTS ========================================== //
    List<GameViewable> views;

    // =================================== LE CONSTRUCTEUR ========================================== //
    public GameViewables() {
        views = new ArrayList<GameViewable>();
    }


    // =================================== LES METHODES ========================================== //

    // ======================================== ADD_VIEWS =============================================== //
    public void addViewable(GameViewable view) {
        views.add(view);
    }


    // =================================== LES AUTRES METHODES ========================================== //
    @Override
    public void setController(GameController gameController) {

    }
    @Override
    public void doSomething() {

    }

    @Override
    public void promptForNouvellePartie() {

    }

    @Override
    public void promptForNomDuJoueur() {

    }

    @Override
    public void afficherNomDuJoueur() {

    }

    @Override
    public void afficherLesCartesDeLaMain() {

    }

    @Override
    public void afficherLesCartesDeLaPile() {

    }

    @Override
    public void afficherLeNomDuGagnant() {

    }

    @Override
    public void promptForTerminerLaPartie() {

    }
}
