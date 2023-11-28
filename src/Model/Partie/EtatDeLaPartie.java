package Model.Partie;

public enum EtatDeLaPartie {

    CREATING, PLAYERS_ADDED,
    JOUEUR_REEL_PLAYING, CPU_PLAYING, FINISHED;

    @Override
    public String toString() {
        if (this == CREATING) {
            return "CREATING...";
        }
        else if (this == PLAYERS_ADDED) {
            return "PLAYER_ADDED...";
        }
        else if (this == JOUEUR_REEL_PLAYING) {
            return "JOUEUR_REEL_PLAYING...";
        }
        else if (this == CPU_PLAYING) {
            return "CPU_PLAYING";
        }
        else {
            return "FINISHED...";
        }
    }
}
