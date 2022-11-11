public class Song
{
  String songName;
  String artistName;
  int Streams;


  public Song(String songName, String artistName, int Streams)
  {
    this.songName = songName;
    this.artistName = artistName;
    this.Streams = Streams;
  }


  public String getSongName()
  {
    return songName;
  }
  public void setSongName(String songName)
  {
    this.songName = songName;
  }


  public String getArtistName()
  {
    return artistName;
  }
  public void setArtistName(String artistName)
  {
    this.artistName = artistName;
  }


  public int Streams()
  {
    return Streams;
  }
  public void setStreams(int Streams)
  {
    this.Streams = Streams;
  }
  public int getStreams() {
    return 0;
 }

  public void printSong()
  {
    System.out.println(songName + ","+ artistName + "," + Streams);    
  }


  public static char[] get(int i) {
    return null;
  }


public static int size() {
    return 0;
}
 
}
