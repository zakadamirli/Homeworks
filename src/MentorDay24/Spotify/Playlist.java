package MentorDay24.Spotify;

import java.util.ArrayList;
import java.util.List;

public class Playlist<T extends Playable> {
    private List<T> playableS;

    public Playlist() {
        this.playableS = new ArrayList<>();
    }

    public void addToList(T playable) {
        playableS.add(playable);
    }

    public void printDetails() {
        for (T playable : playableS) {
            System.out.println(playable.getDetails());
        }
    }

}
