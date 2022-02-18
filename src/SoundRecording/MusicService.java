package SoundRecording;

import java.util.List;

public class MusicService {

    public void getTracklist(List<Track> tracklist) {
        for (Track track : tracklist) {
            System.out.println(track.toString());
        }
        System.out.println();
    }

    public void getTotalDuration(List<Track> tracklist) {
        Duration duration = new Duration(0.0);

        for (Track track : tracklist) {
            duration.addDuration(track.getDuration());
        }
        System.out.println("Total duration: " + duration.toString());
        System.out.println();
    }

    public void sortingByStyle(List<Track> tracklist, MusicStyles style) {
        for (Track track : tracklist) {
            if (track.getStyle() == style) {
                System.out.println(track.toString());
            }
        }
        for (Track track : tracklist) {
            if (track.getStyle() != style) {
                System.out.println(track.toString());
            }
        }
        System.out.println();
    }

    public void findByRange(Duration from, Duration to, List<Track> tracklist) {
        System.out.println("Tracks in " + from + " - " + to);
        for (Track track : tracklist) {
            if (track.getDuration().inDuration(from, to)) {
                System.out.println(track.toString());
            }
        }
    }
}
