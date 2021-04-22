import java.util.ArrayList;
import java.util.List;

public class Playlist {
    String name;
    List<Song> songList = new ArrayList<>();
    public Playlist(String name) {
        this.name = name;

    }

    public boolean isEmpty() {
        return songList.isEmpty();
    }

    public void addSong(Song song) {
        songList.add(song);
    }

    public String[] songNames() {
        String[] result = new String[songList.size()];
        for(int i = 0; i < songList.size(); i++) {
            result[i] = songList.get(i).title;
        }
        return result;
    }

    public int totalDuration() {
        int result = 0;
        for(int i = 0; i < songList.size(); i++) {
            result += songList.get(i).durationInSeconds;
        }
        return result;
    }

    public void swap(Song a, Song b) {
        int tempA = songList.indexOf(a);
        int tempB = songList.indexOf(b);
        songList.set(tempA, b);
        songList.set(tempB, a);
    }

    public void removeSong(Song a) {
        songList.remove(a);
    }
}

