package Listenify;
import java.util.*;

public class Album {

    private String albumName;
    private String artistName;
    private List<Song> songList; //[obj1, obj2, obj3,......] //obj is an object of Song class

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        songList = new ArrayList<>();
    }

    public boolean findSong(String title){
        for(Song song: songList){
            if(song.getSongTitle().equals(title)==true){
                return true;
            }
        }
        return false;
    }

    //addNewSongToPlayList ---> here it is implementing polymorphism in OOPs (same functionName with diff parameters)
    public String addNewSongToPlayList(String title, double duration){

        //check if song is already present : return
        if(findSong(title) == false){
            Song newSong = new Song(title, duration);
            songList.add(newSong);
            return "Song has been added to the playList";
        }
        else{
            return "Song is already Present";
        }

        //Create a new String with the given parameters

        //Add it to the playList
    }

    public void addSongToPlayList(int songNo, List<Song> playList){
        int idx = songNo - 1;
        if(idx <= songList.size()-1){
            Song song = songList.get(idx);
            playList.add(song);
        }
    }

    public void addSongToPlayList(String title, List<Song>playList){

        //We will iterate the SongList : Album list and check if the title is matching
        for(Song song: songList){
            if(song.getSongTitle().equals(title) == true){
                playList.add(song);
                return;
            }
        }
    }


}
