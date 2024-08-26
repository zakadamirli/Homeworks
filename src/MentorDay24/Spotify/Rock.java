package MentorDay24.Spotify;

public class Rock implements Music {
    private String title;
    private String artist;
    private int duration;

    public Rock(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return "Rock: " + title + " by " + artist + " (" + duration + "s)";
    }
}
