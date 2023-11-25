package Model.Partie;

public enum EtatDeLaPartie {

    CREATING, PLAYERS_ADDED,
    PLAYING, FINISHED;

    @Override
    public String toString() {
        if (this == CREATING) {
            return "CREATING...";
        }
        else if (this == PLAYERS_ADDED) {
            return "PLAYER_ADDED...";
        }
        else if (this == PLAYING) {
            return "PLAYING...";
        }
        else {
            return "FINISHED...";
        }
    }
}
