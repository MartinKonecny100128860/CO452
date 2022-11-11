class Main {
    public static void main(String[] args) 
    {
      createSongs();
    }
  
    public static void createSongs()
    {   
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
          
      String theArtist = InputReader.getString("Who is the Artist of the Song?: ");
      String nameOfSong = InputReader.getString("What is the Song Called?: ");
      int playCount = InputReader.getInt("How many Streams Does The Song Have?: ");  
      Song song = new Song(theArtist,nameOfSong, playCount);
     
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
        
      Playlist myPlaylist = new Playlist();
      myPlaylist.addSong(song1);
      myPlaylist.addSong(song2);
      myPlaylist.addSong(song3);
      myPlaylist.addSong(song4);
      myPlaylist.addSong(song5);
      myPlaylist.addSong(song6);
      myPlaylist.addSong(song7);
      myPlaylist.addSong(song8);
      myPlaylist.addSong(song9);
      myPlaylist.addSong(song10);
  
      System.out.println(myPlaylist.sizeOfPlaylist());
  
      myPlaylist.printHeader();
      myPlaylist.printAllSongs();
      
      myPlaylist.deleteSong(5);
      myPlaylist.printAllSongs();
      System.out.println("*******************************");
      myPlaylist.printSelectSongs(6);
    }
    
  }
  