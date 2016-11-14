package prj5;

import student.TestCase;
/**
 * This is a test class for the song class
 * @author Omar Jastaniah - omarjas5
 * @version 2016.11.14
 */
public class SongTest extends TestCase 
{

    private Song song;

    /**
     * Instantiates new song object for testing.
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
