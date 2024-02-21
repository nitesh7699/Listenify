package Listenify;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Diljit's album
        Album diljitAlbum = new Album("Moon Child Eye", "Diljit dosanjh");
        diljitAlbum.addNewSongToPlayList("Vibe", 2.36);
        diljitAlbum.addNewSongToPlayList("Lover", 3.10);
        diljitAlbum.addNewSongToPlayList("Luna", 2.45);

        //Arijit's Album
        Album arijitAlbum = new Album("Hindi Hit Song", "Arijit Singh");
        arijitAlbum.addNewSongToPlayList("Kesariya", 4.10);
        arijitAlbum.addNewSongToPlayList("Shayad", 3.15);
        arijitAlbum.addNewSongToPlayList("Tum hi ho", 4.5);
        arijitAlbum.addNewSongToPlayList("Agar tum sath ho", 3.56);
        arijitAlbum.addNewSongToPlayList("Muskurane ki wajah tum ho", 5.50);

        List<Song> playList = new ArrayList<>(); //this is a custom List of songs

        diljitAlbum.addSongToPlayList(1, playList);
        diljitAlbum.addSongToPlayList("Luna", playList);

        arijitAlbum.addSongToPlayList(3, playList);
        arijitAlbum.addSongToPlayList("Shayad", playList);

        System.out.println(diljitAlbum.songList);

        System.out.println("Welcome to Listenify Application");

        int currSongIdx = 0;
        System.out.println("Now Playing "+ playList.get(currSongIdx).toString());

        printMenu();
        startPlayList(playList);

    }

    public static void startPlayList(List<Song> playList){
        Scanner sc = new Scanner(System.in);
        int currSongIdx = 0;
        boolean quitAppl = false;

        while(quitAppl==false){
            System.out.println("Enter the choice!! ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    currSongIdx+=1;
                    if(currSongIdx == playList.size()){
                        currSongIdx=0;
                    }
                    System.out.println("Now playing "+playList.get(currSongIdx).toString());
                    break;
                case 2:
                    currSongIdx-=1;
                    if(currSongIdx == -1){
                        currSongIdx=0;
                    }
                    System.out.println("Now playing "+playList.get(currSongIdx).toString());
                    break;
                case 3:
                    System.out.println("Now playing "+playList.get(currSongIdx).toString());
                    break;
                case 4:
                    Collections.shuffle(playList);
                    break;
                case 5:
                    playList.remove(currSongIdx);
                    break;
                case 6:
                    printMenu();
                case 7:
                    printPlaylist(playList);
                    break;
                case 8:
                    quitAppl=true;
                    break;
            }
        }

    }

    public static  void printMenu() {

        System.out.println("1. Play Next Song");
        System.out.println("2. Play Previous Song");
        System.out.println("3. Repeat the Song");
        System.out.println("4. Shuffle the Playlist");
        System.out.println("5. Delete the current Song");
        System.out.println("6. Print the menu");
        System.out.println("7. Print playList");
        System.out.println("8 Exit application");
    }

    public static void printPlaylist(List<Song> playList){
        for(Song song: playList){
            System.out.println(song.toString());
        }
    }

}