# Music Streaming Service

This project implements a simple Music Streaming Service in Java. It allows users to create playlists, add songs to playlists, and display all playlists.

## Implementation Details

### Song Class

- Represents a song with attributes `title` and `artist`.
- Provides getter methods to retrieve the song title and artist.

### Playlist Class

- Represents a playlist containing a list of songs.
- Allows users to add songs to the playlist and display all songs in the playlist.

### MusicStreamingService Class

- Main class that simulates the music streaming service.
- Allows users to create playlists, add songs to playlists, and display all playlists.

## How to Run

1. Compile the Java files.
2. Run the `MusicStreamingService` class.

## Example Usage

```java
MusicStreamingService service = new MusicStreamingService();

// Create a playlist
Playlist myPlaylist = new Playlist("My Playlist");

// Add songs to the playlist
myPlaylist.addSong(new Song("Song 1", "Artist 1"));
myPlaylist.addSong(new Song("Song 2", "Artist 2"));
myPlaylist.addSong(new Song("Song 3", "Artist 3"));

// Display all playlists
service.displayAllPlaylists();

```

## Future Enhancements

- Implement user authentication and authorization.
- Add support for searching and filtering songs.
- Implement a graphical user interface for better user interaction.

## Contributors

- Jeel patel
