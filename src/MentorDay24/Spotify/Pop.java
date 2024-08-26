package MentorDay24.Spotify;

public class Pop implements Music {
    private String title;
    private String artist;
    private int duration;

    public Pop(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return "Pop: " + title + " by " + artist + " (" + duration + "s)";
    }
}
