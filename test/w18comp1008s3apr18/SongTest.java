package w18comp1008s3apr18;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JWright
 */
public class SongTest
{
    Song song;
    
    public SongTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
        song = new Song("Java Rocks", "JavaFX'ers", 232);
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getArtist method, of class Song.
     */
    @Test
    public void testGetArtist()
    {
        String expResult = "JavaFX'ers";
        String result = song.getArtist();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArtist method, of class Song.
     */
    @Test
    public void testSetArtist()
    {
        song.setArtist("Oleh");
        assertEquals("Oleh", song.getArtist());
    }
    
    /**
     * Test of setArtist method, of class Song.
     */
    @Test
    public void testSetArtistInvalid()
    {
        try{
            song.setArtist("");
            fail("An empty artist should have triggered an exception");
        }catch(IllegalArgumentException e)
        {
            System.out.printf("Empty artist: %s%n", e.getMessage());
        }
        
    }

    /**
     * Test of setTitle method, of class Song.
     */
    @Test
    public void testSetTitle()
    {
        System.out.println("setTitle");
        String title = "";
        Song song = null;
        song.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLength method, of class Song.
     */
    @Test
    public void testSetLength()
    {
        System.out.println("setLength");
        int length = 0;
        Song song = null;
        song.setLength(length);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Song.
     */
    @Test
    public void testGetTitle()
    {
        System.out.println("getTitle");
        Song song = null;
        String expResult = "";
        String result = song.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLength method, of class Song.
     */
    @Test
    public void testGetLength()
    {
        System.out.println("getLength");
        Song song = null;
        int expResult = 0;
        int result = song.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
