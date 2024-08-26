package MentorDay24.Spotify;

public class Rap implements Music {
    private String title;
    private String artist;
    private int duration;

    public Rap(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return "Rap: " + title + " by " + artist + " (" + duration + "s)";
    }
}
