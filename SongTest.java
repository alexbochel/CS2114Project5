package prj5;

import student.TestCase;
/**
 * This is a test class for the song class
 * @author omar
 * @version
 */
public class SongTest extends TestCase 
{

    private Song song;

    /**
     * Set up
     */
    public void setUp()
    {
        song = new Song("All You Need Is Love",
                "The Beatles", 1967, "pop rock");
    }

    /**
     * Test the song getter and setter methods
     */
    public void testSong()
    {
        assertEquals(1967, song.getYear());
        assertEquals("All You Need Is Love", song.getTitle());
        assertEquals("The Beatles", song.getArtist());
        assertEquals("pop rock", song.getGenre());

        song.setLikes();
        assertTrue(song.getLikes());
        assertFalse(song.getHeard());
    }
}
