package w18comp1008s3apr18;

/**
 *
 * @author JWright
 */
public class Song implements EntertainmentInterface
{
    private String title, artist;
    private int length;

    public Song(String title, String artist, int length)
    {
        setTitle(title);
        setArtist(artist);
        setLength(length);
    }

    public String getArtist()
    {
        return artist;
    }

    public void setArtist(String artist)
    {
        if (!artist.isEmpty())
            this.artist = artist;
        else
            throw new IllegalArgumentException("Artist cannot be empty");
    }

    public void setTitle(String title)
    {
        if (!title.isEmpty())
            this.title = title;
        else
            throw new IllegalArgumentException("Title cannot be empty");
    }

    public void setLength(int length)
    {
        if (length > 0 && length <= 700)
            this.length = length;
        else
            throw new IllegalArgumentException("Length must be 1 to 600");
    }
    
    @Override
    public String getTitle()
    {
        return this.title;
    }
    
    public int getLength()
    {
        return this.length;
    }
}
