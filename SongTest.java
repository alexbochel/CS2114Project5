package prj5;

import student.TestCase;
/**
 *
 * @author Omar, Alex, Purnima
 * @version 2016.11.14
 */
public class SongTest extends TestCase {

    private Song song;
    private Song song2;

    /**
     * This is the setup method for the test class.
     */
    public void setUp()
    {
        song = new Song("All You Need Is Love",
                "The Beatles", "1967", "pop rock");
        song2 = new Song("Fat Lip",
                "Sum 41", "1967", "alternative");
    }

    /**
     * This method tests the set likes method for each hobby.
     */
    public void testGetMethods() {
        // Liked
        assertEquals(0, song.getArtTotalLiked());
        assertEquals(0, song.getArtLiked());

        assertEquals(0, song.getReadingTotalLiked());
        assertEquals(0, song.getReadingLiked());

        assertEquals(0, song.getMusicTotalLiked());
        assertEquals(0, song.getMusicLiked());

        assertEquals(0, song.getSportsTotalLiked());
        assertEquals(0, song.getSportsLiked());

        // Heard
        assertEquals(0, song.getArtTotalHeard());
        assertEquals(0, song.getArtHeard());

        assertEquals(0, song.getReadingTotalHeard());
        assertEquals(0, song.getReadingHeard());

        assertEquals(0, song.getMusicTotalHeard());
        assertEquals(0, song.getMusicHeard());

        assertEquals(0, song.getSportsTotalHeard());
        assertEquals(0, song.getSportsHeard());

        // Song Information

        assertEquals("All You Need Is Love", song.getTitle());
        assertEquals("The Beatles", song.getArtist());
        assertEquals("1967", song.getYear());
        assertEquals("pop rock", song.getGenre());

        // toString
        String str = "song title all you need is love\nsong artist "
                + "the beatles\nsong genre pop rock\nsong year 1967";
        assertEquals(str, song.toString());

    }

    /**
     * This method tests the compareToTitle methods for the song class.
     */
    public void testCompareToTitle() {
        assertEquals(-1, song.compareToTitle(song2));
        assertEquals(1, song2.compareToTitle(song));
        assertEquals(0, song.compareToTitle(song));
    }

    /**
     * This method tests the compareToGenre method.
     */
    public void testCompareToGenre() {
        assertEquals(1, song.compareToGenre(song2));
        assertEquals(-1, song2.compareToGenre(song));
        assertEquals(0, song.compareToGenre(song));
    }

    /**
     * Test heard and not heard methods
     */
    public void testHeard()
    {
        // Art
        song.notHeard("art");
        assertEquals(1, song.getArtTotalHeard());
        song.heard("art");
        assertEquals(2, song.getArtTotalHeard());
        assertEquals(1, song.getArtHeard());

        song.notLiked("art");
        assertEquals(1, song.getArtTotalLiked());
        song.liked("art");
        assertEquals(2, song.getArtTotalLiked());
        assertEquals(1, song.getArtLiked());

        // Reading
        song.notHeard("reading");
        assertEquals(1, song.getReadingTotalHeard());
        song.heard("reading");
        assertEquals(2, song.getReadingTotalHeard());
        assertEquals(1, song.getReadingHeard());

        song.notLiked("reading");
        assertEquals(1, song.getReadingTotalLiked());
        song.liked("reading");
        assertEquals(2, song.getReadingTotalLiked());
        assertEquals(1, song.getReadingLiked());

        // Sports
        song.notHeard("sports");
        assertEquals(1, song.getSportsTotalHeard());
        song.heard("sports");
        assertEquals(2, song.getSportsTotalHeard());
        assertEquals(1, song.getSportsHeard());

        song.notLiked("sports");
        assertEquals(1, song.getSportsTotalLiked());
        song.liked("sports");
        assertEquals(2, song.getSportsTotalLiked());
        assertEquals(1, song.getSportsLiked());

        // Music
        song.notHeard("music");
        assertEquals(1, song.getMusicTotalHeard());
        song.heard("music");
        assertEquals(2, song.getMusicTotalHeard());
        assertEquals(1, song.getMusicHeard());

        song.notLiked("music");
        assertEquals(1, song.getMusicTotalLiked());
        song.liked("music");
        assertEquals(2, song.getMusicTotalLiked());
        assertEquals(1, song.getMusicLiked());

        // Default
        try {
           song.heard("fishing");
        }
        catch (Exception e)
        {
            assertNotNull(e);
            assertTrue(e instanceof IllegalStateException);
        }

        try {
           song.notHeard("fishing");
        }
        catch (Exception e)
        {
            assertNotNull(e);
            assertTrue(e instanceof IllegalStateException);
        }

        try {
            song.liked("fishing");
         }
         catch (Exception e)
         {
             assertNotNull(e);
             assertTrue(e instanceof IllegalStateException);
         }

         try {
            song.notLiked("fishing");
         }
         catch (Exception e)
         {
             assertNotNull(e);
             assertTrue(e instanceof IllegalStateException);
         }
    }
}
