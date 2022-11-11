/* Public Music class which will define methods and data for the storing of 
musicTitle, musicianName and spotifyStreams for each song within the album */
public class Music
{
  String musicTitle;
  String musicianName;
  int spotifyStreams;

/* Constructor method which has no return value, this method is used to create an song object */
  public Music(String mTitle, String mName, int sStreams)
  {
    this.musicTitle = mTitle;
    this.musicianName = mName;
    this.spotifyStreams=sStreams;
  }

/* Method called get, which will get the title of the actual song, string is being used
 since string is sequence of characters */
  public String getMusicTitle()
  {
    return musicTitle;
  }

/* Method called get, which will get the musicians name, string is being used
 since string is sequence of characters */
  public String getMusicianName()
  {
    return musicianName;
  }

/* Method called get, which will get the streams of the song 
An integer is being used as integer is being used for numbers */
  public int getSpotifyStreams()
  {
    return spotifyStreams;
  }

/* Method called set, which will update the title of the song */
  public void setSongName(String mTitle)
  {
    this.musicTitle = mTitle;
  }

/* Method called set, which will update the musicians name of a song */
  public void setMusicianName(String mName)
  {
    this.musicianName = mName;
  }

/* Method called set, which will update the spotify streams of a song */
  public void setSpotifyStreams(int sStreams)
  {
    this.spotifyStreams = sStreams;
  }

/* Method - which will print the artist, title and streams of every song */
  public void printSong()
  {
    System.out.println(musicTitle + ","+ musicianName + "," + spotifyStreams);  
      
  } 

  
}
