import java.util.ArrayList;
import java.util.List;

// Represents a song
class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Artist: " + artist;
    }
}

// Represents a playlist
class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void displayPlaylist() {
        System.out.println("Playlist: " + name);
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}

// Represents a music streaming service
class MusicStreamingService {
    private List<Playlist> playlists;

    public MusicStreamingService() {
        playlists = new ArrayList<>();
    }

    public void createPlaylist(String name) {
        Playlist playlist = new Playlist(name);
        playlists.add(playlist);
        System.out.println("Playlist '" + name + "' created successfully.");
    }

    public void addSongToPlaylist(String playlistName, Song song) {
        Playlist playlist = findPlaylist(playlistName);
        if (playlist != null) {
            playlist.addSong(song);
            System.out.println("Song added to playlist '" + playlistName + "'.");
        } else {
            System.out.println("Playlist '" + playlistName + "' not found.");
        }
    }

    public void displayAllPlaylists() {
        if (playlists.isEmpty()) {
            System.out.println("No playlists found.");
            return;
        }
        System.out.println("All Playlists:");
        for (Playlist playlist : playlists) {
            playlist.displayPlaylist();
            System.out.println();
        }
    }

    private Playlist findPlaylist(String name) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(name)) {
                return playlist;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        MusicStreamingService service = new MusicStreamingService();

        // Creating playlists
        service.createPlaylist("Favorites");
        service.createPlaylist("Workout");

        // Adding songs to playlists
        service.addSongToPlaylist("Favorites", new Song("Shape of You", "Ed Sheeran"));
        service.addSongToPlaylist("Favorites", new Song("Dance Monkey", "Tones and I"));
        service.addSongToPlaylist("Workout", new Song("Eye of the Tiger", "Survivor"));
        service.addSongToPlaylist("Workout", new Song("Stronger", "Kanye West"));

        // Displaying all playlists
        service.displayAllPlaylists();
    }
}
