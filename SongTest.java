package prj5;

import student.TestCase;
/**
 *
 * @author omar
 * @version
 */
public class SongTest extends TestCase {

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
     * Test
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
        assertTrue(song.getLikes());
        assertFalse(song.getHeard());
    }
}
