package prj5;

import student.TestCase;
/**
 * This test class tests the Song class. 
 * 
 * @author omar
 * @version 2016.11.13
 */
public class SongTest extends TestCase {
    
    private Song song;
    
    /**
     * This is the setup method for the SongTest. 
     */
    public void setUp()
    {
        song = new Song("All You Need Is Love", 
                "The Beatles", 1967, "pop rock");
    }
    
    /**
     * This tests all of the methods for song class. 
     */
    public void testSong()
    {
        assertEquals(1967, song.getYear());
        assertEquals("All You Need Is Love", song.getTitle());
        assertEquals("The Beatles", song.getArtist());
        assertEquals("pop rock", song.getGenre());

        String str = "All You Need Is Love: The Beatles, pop rock, 1967";
        assertEquals(str, song.toString());

        song.setLikes();
        assertTrue(song.getLiked());
        assertFalse(song.getHeard());
    }
}