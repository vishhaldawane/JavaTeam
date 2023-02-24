import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        Song song1 = new Song("Jhoome Jo Pathhan","Arijit Singh","Pathan",2022);
        Song song2 = new Song("Zhingat","Ajay Atul","Sairat",2014);
        Song song3 = new Song("Jane Kyo Log Pyar Karte Hai","Udit Narayan","Dil Chahta Hai",1999);
        Song song4 = new Song("Aaj Ki party","Mika Singh","Bajrangi Bhai Jan",2018);
        Song song5 = new Song("Baby Doll","Sunny Leone","Ragini MMS",2019);

        //its growable array...size would keep on increasing as per the add functions
        ArrayList myPlayList = new ArrayList(); // no [] management here....wow
        //stack of a plate

       //LinkedList myPlayList = new LinkedList();

        //bank transactions, logs, account creation, number of deposits...infinite...

        System.out.println("adding songs....");
        myPlayList.add(song1); //add is a ready made function to append object at the end of the list....
        myPlayList.add(song2);
        myPlayList.add(song3);
        myPlayList.add(song4);
        myPlayList.add(song5);
        System.out.println("songs are added....");

        for(int i=0;i<myPlayList.size();i++) {
            System.out.println("song is : "+myPlayList.get(i)); //read made get() to access the element of the specified index
        }

        System.out.println("keep on adding now...");

        myPlayList.add( new Song("Jagga","Daler Mehandi","URI Surgical Strike",2015));
        myPlayList.add( new Song("Pehli Pehli Bar","Lata Mangeshkar","Dil Chahta Hai",1999));

        System.out.println("----- added two more songs...--------");
        System.out.println("-----PRINTING AGAIN-------");

        for(int i=0;i<myPlayList.size();i++) {
            System.out.println("song is : "+myPlayList.get(i));
        }

        int choice=0;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter song title : ");
            String songTitle = scan.nextLine(); //accept from keyboard

            Scanner scan2 = new Scanner(System.in);
            System.out.println("Enter song artist : ");
            String songArtist = scan.nextLine(); //accept from keyboard


            Scanner scan3 = new Scanner(System.in);
            System.out.println("Enter song album : ");
            String songAlbum = scan.nextLine(); //accept from keyboard


            Scanner scan4 = new Scanner(System.in);
            System.out.println("Enter song year : ");
            int songYear = scan.nextInt(); //accept from keyboard

            Song songObj = new Song(songTitle,songArtist,songAlbum,songYear); // store this title in the song object

                System.out.println("Adding this song into the play list....");
                myPlayList.add(songObj); //add this song into the play list

            Scanner scan5 = new Scanner(System.in);
            System.out.println("Press 0 to add more or 1 to exit : ");
            choice = scan5.nextInt();

        } while(choice!=1);


        System.out.println("--------- now lets see all the songs ------");

        for(int i=0;i<myPlayList.size();i++) {
            System.out.println("song is : "+myPlayList.get(i));
        }

    }
}

class Song
{
    String title;
    String artist;
    String album;
    int year;


    public Song(String title) {
        this.title = title;

    }

    public Song(String title, String artist, String album, int year) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", year=" + year +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
/*

 Song myJukeBox[] = new Song[5];

        myJukeBox[0] = song1;
        myJukeBox[1] = song2;
        myJukeBox[2] = song3;
        myJukeBox[3] = song4;
        myJukeBox[4] = song5;

        for (int i=0;i<myJukeBox.length;i++) {
            System.out.println("Song : "+myJukeBox[i]);
        }
 */