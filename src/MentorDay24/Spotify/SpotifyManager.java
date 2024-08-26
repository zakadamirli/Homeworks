package MentorDay24.Spotify;

public class SpotifyManager {
    public static void main(String[] args) {
        Playlist<Music> musicPlaylist = new Playlist<>();
        Playlist<Podcast> podcastPlaylist = new Playlist<>();

        Music punkSong = new Punk("Anarchy in the UK", "Sex Pistols", 180);
        Music rockSong = new Rock("Stairway to Heaven", "Led Zeppelin", 482);
        Music popSong = new Pop("Thriller", "Michael Jackson", 357);
        Music rapSong = new Rap("Lose Yourself", "Eminem", 326);

        Podcast techPodcast = new Podcast("Tech Trends", 3600);
        Podcast historyPodcast = new Podcast("History Now", 5400);

        musicPlaylist.addToList(punkSong);
        musicPlaylist.addToList(rockSong);
        musicPlaylist.addToList(popSong);
        musicPlaylist.addToList(rapSong);

        podcastPlaylist.addToList(techPodcast);
        podcastPlaylist.addToList(historyPodcast);

        System.out.println("Music Playlist:");
        musicPlaylist.printDetails();

        System.out.println("\nPodcast Playlist:");
        podcastPlaylist.printDetails();
    }
}

