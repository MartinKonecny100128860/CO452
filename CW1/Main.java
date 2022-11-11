/* Scanner function which was imported for different lines of code within main class */
import java.util.Scanner;

/* Main class which operates this application */
class Main {
  public static void main(String[] args) 
  {
    createSongs();
  }

/*
* Method to setup sample songs and test they are stored
* @return - Void which means no return values. */
  public static void createSongs()
  {   

/* All of the songs within the album, there are 10 songs in total. When it comes to Spotify streams
* the streams are official however I have added underscore to make each number readable. Undersocre
* has no effect whatsoever on the output, it is simply for clearnes of the code. */
    Music song1 = new Music("No Guidance","Chris Brown" ,835_793_174);
    Music song2 = new Music("Under The Influence","Chris Brown",415_006_032);
    Music song3 = new Music("Questions","Chris Brown",483_048_524);
    Music song4 = new Music("Go Crazy","Chris Brown",558_871_349);
    Music song5 = new Music("Bad and Boujee","Migos",830_782_252);
    Music song6 = new Music("Invincible","Pop Smoke",348_286_348);
    Music song7 = new Music("You Right Remix","Doja Cat",514_547_028);
    Music song8 = new Music("First Class","Jack Harlow",534_882_148);
    Music song9 = new Music("Stronger","Kanye West",1_084_408_761);
    Music song10 = new Music("Ric Flair Drip","Offset",1_080_591_205);

/*User input to get details of a song */
    String nameOfSong = InputReader.getString("In order to see the album name your favourite song: ");
    String theArtist = InputReader.getString("Who sang the song? : ");
    int plyCount = InputReader.getInt("How many Spotify streams does it have?: "); 
    System.out.println("You have a great Music Taste!");
    
    Music music = new Music(nameOfSong,theArtist,plyCount);


    System.out.format("==========================================%n");
    System.out.println("Martin's Ultimate Album");
    System.out.format("__________________________________________%n");
    song1.printSong();
    System.out.format("__________________________________________%n");
    song2.printSong();
    System.out.format("__________________________________________%n");
    song3.printSong();
    System.out.format("__________________________________________%n");
    song4.printSong();
    System.out.format("__________________________________________%n");
    song5.printSong();
    System.out.format("__________________________________________%n");
    song6.printSong();
    System.out.format("__________________________________________%n");
    song7.printSong();
    System.out.format("__________________________________________%n");
    song8.printSong();
    System.out.format("__________________________________________%n");
    song9.printSong();
    System.out.format("__________________________________________%n");
    song10.printSong();
    System.out.format("__________________________________________%n");
    System.out.format("==========================================%n");
      
/*This chunk of code will create an album and add all 10 songs to it */
    Album martinsAlbum = new Album();
    martinsAlbum.addSong(song1);
    martinsAlbum.addSong(song2);
    martinsAlbum.addSong(song3);
    martinsAlbum.addSong(song4);
    martinsAlbum.addSong(song5);
    martinsAlbum.addSong(song6);
    martinsAlbum.addSong(song7);
    martinsAlbum.addSong(song8);
    martinsAlbum.addSong(song9);
    martinsAlbum.addSong(song10);

/*The next couple of lines of code is for the console menu, this specific code will print out
 * the size of the playlist as well as command for the user. */
    if (martinsAlbum.sizeOfPlaylist()!=0){
      System.out.println("Select one of the following options!");
    }

    else{ }
      boolean quit;
      printMenu();
    while(plyCount!=0){
      Scanner sc = new Scanner(System.in);
      int action = sc.nextInt();
      sc.nextLine();

    switch (action){

/* Option 0 which will exit from the application if selected */       
    case 0:
      printMenu();
      System.out.println("Exit");
      quit = true;
      break;
/*Option 1 which prints the album by streams */
    case 1:
      Scanner ipps = new Scanner(System.in);
      martinsAlbum.printSelectSongs(ipps.nextInt());
      System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");          
    break;
 
/* This function will print the list of songs within the playlist, I also use it to 
 * update the playlist if song is added or removed.*/
case 2: 
    System.out.println("The current size of the playlist is " + martinsAlbum.sizeOfPlaylist());
    martinsAlbum.printHeader();
    martinsAlbum.printAllSongs();
    printMenu();
break;

/**Scanner function which will ask the user to add a song to the playlist*/
case 3: 
    System.out.println("What is the title of the song?");
    System.out.println("Who is the artist?");
    System.out.println("How many spotify streams does it have?");
    Scanner ts = new Scanner(System.in);
    Scanner as = new Scanner(System.in);
    Scanner ps = new Scanner(System.in);
    Music songadd = new Music(ts.nextLine(), as.nextLine(), ps.nextInt());
    martinsAlbum.addSong(songadd);
    System.out.println("Song "+ ts.nextLine()+ "has been added to the playlist!");
    printMenu();
break;

/*Scanner function which will delete a song from a playlist numbers start from 0!*/
case 4: 
    System.out.println("Enter the number of song within the playlist you want to delete");
    Scanner is = new Scanner(System.in);
    martinsAlbum.deleteSong(is.nextInt());
    martinsAlbum.printAllSongs();
    System.out.println("Song "+ is.nextLine()+ "has been deleted from the playlist!");
    printMenu();
    }

    }

    }

/** Menu function, the user will be able to interact with this menu by pressing keys 0-4 */ 
  private static void printMenu(){
    System.out.format("............................................%n");
    System.out.println(". Select one of the following options      .");
    System.out.println
           (".                                          .\n"+
            ". 0 - To Exit the Application              .\n"+
           ".                                          .\n"+
            ". 1 - Print by Streams                     .\n"+
            ".                                          .\n"+
            ". 2 - Print the Playlist                   .\n"+
            ".                                          .\n"+
            ". 3 - Add a Song to Playlist               .\n"+
            ".                                          .\n"+
            ". 4 - Remove a Song from the Playlist      . \n"+
            "............................................");
    }

    }

