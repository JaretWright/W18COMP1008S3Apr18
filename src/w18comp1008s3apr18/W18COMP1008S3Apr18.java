package w18comp1008s3apr18;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class W18COMP1008S3Apr18
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Movie movie = new Movie();
        Song song = new Song("Java Rocks", "JavaFX'ers", 232);
        Song song2 = new Song("Shoulda thrown an Exception", "JDub", -1);
        
        ArrayList<EntertainmentInterface> list = new ArrayList<>();
        list.add(movie);
        list.add(song);
        
        for (EntertainmentInterface funObject:list)
        {
            System.out.println(funObject.getTitle());
        }
    }
    
}
