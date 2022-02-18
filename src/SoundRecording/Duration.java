package SoundRecording;

import java.util.Formatter;

public class Duration {
    private double duration;

    public Duration(double duration) {
        this.duration = duration;
    }

    public Duration(double min, double sec) {
        this.duration = min*60+sec;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void addDuration(double duration) {
        this.duration += duration;
    }

    public void addDuration(Duration duration) {
        this.duration += duration.getDuration();
    }

    public boolean inDuration(double from, double to) {
        return (this.getDuration() >= from) && (this.getDuration() <= to);
    }

    public boolean inDuration(Duration from, Duration to) {
        return (this.getDuration() >= from.getDuration()) && (this.getDuration() <= to.getDuration());
    }

    @Override
    public String toString() {
        return new Formatter().format("%02d:%02d",
                (int)Math.floor(duration/60) ,
                (int)(duration%60)
        ).toString();
    }

}
