public class Song
{
  String songName;
  String artistName;
  int playCount;


  public Song(String songName, String artistName, int playCount)
  {
    this.songName = songName;
    this.artistName = artistName;
    this.playCount = playCount;
  }


  public String getSongName()
  {
    return songName;
  }

  public String getArtistName()
  {
    return artistName;
  }


  public int getPlayCount()
  {
    return playCount;
  }

  public void setSongName(String songName)
  {
    this.songName = songName;
  }

  public void setArtistName(String artistName)
  {
    this.artistName = artistName;
  }

  public void setplayCount(int playCount)
  {
    this.playCount = playCount;
  }

  public void printSong()
  {
    System.out.println(songName + ","+ artistName + "," + playCount);    
  } 
}
