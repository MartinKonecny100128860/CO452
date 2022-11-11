import java.util.ArrayList;

public class Mixtape
{

  private ArrayList<Song> mixTape;
  
  public Mixtape(String nameOfSong, String nameOfSong2, Object object)
  {
    mixTape = new ArrayList<>();
  }


  public int sizeOfMixtape()
  {
    return mixTape.size();
  }

  public void addSong(Song song)
  {
    mixTape.add(song);
  }

  public void deleteSong(int id)
  {
    mixTape.remove(id);
  }


  public void printAllSongs()
  {
    for (int index = 0; index < mixTape.size(); index++)
    {
      for (int i = 0; i < Song.size(); i++) {
        System.out.println(Song.get(i));
    }
    }
  }
  
  public void printHeader()
  {
    System.out.println("This is Martin's Playlist!");
    System.out.println("Song Name     Artist        Streams");
    System.out.println("***********************************");
  }

  public void printSelectSongs(int Streams)
  {
    for (int index = 0; index < mixTape.size(); index++)
      {        
        Song s = mixTape.get(index);
        if (s.getStreams() > Streams)
        {
            System.out.print("["+(index+1)+"]");
            s.printSong();
        } 
      }
  }


  public static void add(Song song1) {
  }

}