/* Array list function which was imported as this class features the actual array list function */
import java.util.ArrayList;

/* Class which manages album of songs*/
public class Album
{
  private ArrayList<Music> albumList;

/* Method Constructor - Create a playlist of songs */
  public Album()
  {
    albumList = new ArrayList<>();
  }

/* Method which will get the size of the actual album */
  public int sizeOfPlaylist()
  {
    return albumList.size();
  }
  
/* Method which adds a song to the album */
  public void addSong(Music song)
  {
    albumList.add(song);
  }

/* Method which will delete a song from the album*/
  public void deleteSong(int id)
  {
    albumList.remove(id);
  }

/* Method which will print all songs within the album */
  public void printAllSongs()
  {
    for (int index = 0; index < albumList.size(); index++)
    {
      Music s = albumList.get(index);
      System.out.print("["+(index+1)+"]");
      s.printSong();
    }
  }

/* a very simple and plain Header method*/
  
  public void printHeader()
  {
    System.out.println("Song                Musician           Streams");
    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
  }

/* Method that will print selected songs within the album, it is based on the amount of streams */
  public void printSelectSongs(int spotifyStreams)
  {
    for (int index = 0; index < albumList.size(); index++)
      {        
       Music s = albumList.get(index);
    if (s.getSpotifyStreams() > spotifyStreams)
    {
       System.out.print("["+(index+1)+"]");
       s.printSong();
    } 
      }
  }
}
