package Listenify;

public class Song {

    private String songTitle;
    private double duration; //private coz we dont want others to modify it

    public Song(String songTitle, double duration) {
        this.songTitle = songTitle;
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String toString() { //toString() --> printing the attributes of the object (inBuilt mthd)
        return "Song{" +
                "songTitle='" + songTitle + '\'' +
                ", duration=" + duration +
                '}';
    }
}
