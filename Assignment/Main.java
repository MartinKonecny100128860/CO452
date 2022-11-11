import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) 
    {
      createSongs();
    }
  
    public static void createSongs()
    {   
    ArrayList<Mixtape> MixtapeArrayList= new ArrayList<>();
    
      
/** All of the songs within the playlist, there is 10 songs in total. When it comes to Spotify streams
 * the streams are official however I have added underscore to make each number readable. Undersocre
 * has no effect whatsoever on the output, it is simply for clearnes of the code.
 */
      Song song1 = new Song("No Guidance","Chris Brown" ,835_793_174);
      Song song2 = new Song("Under The Influence","Chris Brown",415_006_032);
      Song song3 = new Song("Questions","Chris Brown",483_048_524);
      Song song4 = new Song("Go Crazy","Chris Brown",558_871_349);
      Song song5 = new Song("Bad and Boujee","Migos",830_782_252);
      Song song6 = new Song("Invincible","Pop Smoke",348_286_348);
      Song song7 = new Song("You Right Remix","Doja Cat",514_547_028);
      Song song8 = new Song("First Class","Jack Harlow",534_882_148);
      Song song9 = new Song("Stronger","Kanye West",1_084_408_761);
      Song song10 = new Song("Ric Flair Drip","Offset",1_080_591_205);
    
      Mixtape.add(song1);
      Mixtape.add(song2);
      Mixtape.add(song3);
      Mixtape.add(song4);
      Mixtape.add(song5);
      Mixtape.add(song6);
      Mixtape.add(song7);
      Mixtape.add(song8);
      Mixtape.add(song9);
      Mixtape.add(song10);

Scanner bn= new Scanner(System.in);
      while(!quit){
        int title= bn.nextLine();
        bn.nextLine();
      }
      switch(title){
        
      
case 0:
quit = true;
break;

case 1:



      for (int i = 0; i < Song.size(); i++) {
          System.out.println(Song.get(i));
      }
    
/** This function will ask the user imput a song details so it can be added to mixtape */
case 2 :
System.out.println("Add a song title");
System.out.println("Add a song artist");
System.out.println("Add a song streams");

/** scanner, this function allows the user to imput a song into the mixtape */

Scanner ts = new Scanner(System.in);
Scanner as = new Scanner(System.in);
Scanner ps = new Scanner(System.in);
Song add = new Song(ts.nextLine(), as.nextLine(), ps.nextInt());
Mixtape.add(add);
MixtapeArrayList = new ArrayList<>();
printAllSongs(MixtapeArrayList);

}


      String theArtist = InputReader.getString("Who is the Artist of the Song?: ");
      String nameOfSong = InputReader.getString("What is the Song Called?: ");
      int Streams = InputReader.getInt("How many Streams Does The Song Have?: ");  
      new Song(theArtist,nameOfSong, Streams);
     
      /** Print all of the songs in a list */
      song1.printSong();

      song2.printSong();

      song3.printSong();

      song4.printSong();

      song5.printSong();

      song6.printSong();

      song7.printSong();

      song8.printSong();

      song9.printSong();

      song10.printSong();
        
      Mixtape myMixtape = new Mixtape(nameOfSong, nameOfSong, null);
      myMixtape.addSong(song1);
      myMixtape.addSong(song2);
      myMixtape.addSong(song3);
      myMixtape.addSong(song4);
      myMixtape.addSong(song5);
      myMixtape.addSong(song6);
      myMixtape.addSong(song7);
      myMixtape.addSong(song8);
      myMixtape.addSong(song9);
      myMixtape.addSong(song10);
  
      System.out.println(myMixtape.sizeOfMixtape());
  
      myMixtape.printHeader();
      myMixtape.printAllSongs();
      
      myMixtape.deleteSong(5);
      myMixtape.printAllSongs();
      System.out.println("*******************************");
      myMixtape.printSelectSongs(6);
    }

    private static void printAllSongs(ArrayList<Mixtape> mixtapeArrayList) {
    }
    
  }
  