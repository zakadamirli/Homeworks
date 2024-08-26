package MentorDay24.Spotify;

public class Punk implements Music {
    private String title;
    private String artist;
    private int duration;

    public Punk(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return "Punk: " + title + " by " + artist + " (" + duration + "s)";
    }
}