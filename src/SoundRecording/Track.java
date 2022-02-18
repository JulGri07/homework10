package SoundRecording;

import java.util.Formatter;

public class Track {
    private String name;
    private Duration duration;
    private MusicStyles style;

    public Track(String name, double duration, MusicStyles style) {
        this.name = name;
        this.duration = new Duration(duration);
        this.style = style;
    }
    public Track(String name, Duration duration, MusicStyles style) {
        this.name = name;
        this.duration = duration;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public MusicStyles getStyle() {
        return style;
    }

    public void setStyle(MusicStyles style) {
        this.style = style;
    }

    public String toString() {
        return "Name: " + getName() +
                ", Duration: " + duration.toString() +
                ", Style: " + getStyle();
    }
}
