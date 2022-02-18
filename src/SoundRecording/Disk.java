package SoundRecording;

import java.util.ArrayList;
import java.util.List;
import static SoundRecording.MusicStyles.*;


public class Disk {
    private List<Track> tracklist = new ArrayList<>();
    private MusicService service = new MusicService();

    public Disk() {
        tracklist.add(new Track("AC/DC — Highway to Hell ", new Duration(3,29), ROCK));
        tracklist.add(new Track("LP - Lost on You", new Duration(4,28), POP));
        tracklist.add(new Track("Black Sabbath — Paranoid ", new Duration(2,48), ROCK));
        tracklist.add(new Track("Ice Cube - It Was A Good Day ", new Duration(4,21), HIPHOP ));
        tracklist.add(new Track("Hippie Sabotage – Trust Nobody ", new Duration(3,46), HIPHOP));
        tracklist.add(new Track("Mozart - Requiem", new Duration(4, 35), CLASSIC));
        tracklist.add(new Track("The Doors — Light My Fire ", new Duration(5,6), ROCK));
        tracklist.add(new Track("Doja Cat, The Weeknd - Planet Her ", new Duration(4,7), POP));

        service.getTracklist(tracklist);
        service.getTotalDuration(tracklist);
        service.sortingByStyle(tracklist, ROCK);
        service.findByRange(new Duration(2,47),new Duration(3,3), tracklist);

    }
}
