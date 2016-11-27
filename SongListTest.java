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
     * Test heard and not heard methods in Song class. 
     */
    public void testHeard()
    {
        // Art
        song.notHeard("art", "Computer Science", "Northeast");
        assertEquals(1, song.getArtTotalHeard());
        assertEquals(1, song.getCsTotalHeard());
        assertEquals(1, song.getNortheastTotalHeard());
        song.heard("art", "Computer Science", "Northeast");
        assertEquals(2, song.getArtTotalHeard());
        assertEquals(1, song.getArtHeard());
        assertEquals(2, song.getCsTotalHeard());
        assertEquals(1, song.getCsHeard());
        assertEquals(2, song.getNortheastTotalHeard());
        assertEquals(1, song.getNortheastHeard());
        
        song.notLiked("art", "Computer Science", "Northeast");
        assertEquals(1, song.getArtTotalLiked());
        assertEquals(1, song.getCsTotalLiked());
        assertEquals(1, song.getNortheastTotalLiked());
        song.liked("art", "Computer Science", "Northeast");
        assertEquals(2, song.getArtTotalLiked());
        assertEquals(1, song.getArtLiked());
        assertEquals(2, song.getCsTotalLiked());
        assertEquals(1, song.getCsLiked());
        assertEquals(2, song.getNortheastTotalLiked());
        assertEquals(1, song.getNortheastLiked());

        // Reading
        song.notHeard("reading", "Math or CMDA", "Southeast");
        assertEquals(1, song.getMathTotalHeard());
        assertEquals(1, song.getReadingTotalHeard());
        assertEquals(1, song.getSoutheastTotalHeard());
        song.heard("reading", "Math or CMDA", "Southeast");
        assertEquals(2, song.getReadingTotalHeard());
        assertEquals(1, song.getReadingHeard());
        assertEquals(2, song.getMathTotalHeard());
        assertEquals(1, song.getMathHeard());
        assertEquals(2, song.getSoutheastTotalHeard());
        assertEquals(1, song.getSoutheastHeard());

        song.notLiked("reading", "Math or CMDA", "Southeast");
        assertEquals(1, song.getMathTotalLiked());
        assertEquals(1, song.getReadingTotalLiked());
        assertEquals(1, song.getSoutheastTotalLiked());
        song.liked("reading", "Math or CMDA", "Southeast");
        assertEquals(2, song.getReadingTotalLiked());
        assertEquals(1, song.getReadingLiked());
        assertEquals(2, song.getMathTotalLiked());
        assertEquals(1, song.getMathLiked());
        assertEquals(2, song.getSoutheastTotalLiked());
        assertEquals(1, song.getSoutheastLiked());

        // Sports
        song.notHeard("sports", "Other Engineering",
                "United States (other than Southeast or Northwest)");
        assertEquals(1, song.getSportsTotalHeard());
        assertEquals(1, song.getEngineeringTotalHeard());
        assertEquals(1, song.getUnitedstatesTotalHeard());
        song.heard("sports", "Other Engineering",
                "United States (other than Southeast or Northwest)");
        assertEquals(2, song.getSportsTotalHeard());
        assertEquals(1, song.getSportsHeard());
        assertEquals(2, song.getEngineeringTotalHeard());
        assertEquals(1, song.getEngineeringHeard());
        assertEquals(2, song.getUnitedstatesTotalHeard());
        assertEquals(1, song.getUnitedstatesHeard());

        song.notLiked("sports", "Other Engineering",
                "United States (other than Southeast or Northwest)");
        assertEquals(1, song.getSportsTotalLiked());
        assertEquals(1, song.getEngineeringTotalLiked());
        assertEquals(1, song.getUnitedstatesTotalLiked());
        song.liked("sports", "Other Engineering",
                "United States (other than Southeast or Northwest)");
        assertEquals(2, song.getSportsTotalLiked());
        assertEquals(1, song.getSportsLiked());
        assertEquals(2, song.getEngineeringTotalLiked());
        assertEquals(1, song.getEngineeringLiked());
        assertEquals(2, song.getUnitedstatesTotalLiked());
        assertEquals(1, song.getUnitedstatesLiked());

        
        // Music
        song.notHeard("music", "Other", "Outside of United States");
        assertEquals(1, song.getMusicTotalHeard());
        assertEquals(1, song.getOtherTotalHeard());
        assertEquals(1, song.getOutsideTotalHeard());
        song.heard("music", "Other", "Outside of United States");
        assertEquals(2, song.getMusicTotalHeard());
        assertEquals(1, song.getMusicHeard());
        assertEquals(2, song.getOtherTotalHeard());
        assertEquals(1, song.getOtherHeard());
        assertEquals(2, song.getOutsideTotalHeard());
        assertEquals(1, song.getOutsideHeard());

        song.notLiked("music", "Other", "Outside of United States");
        assertEquals(1, song.getMusicTotalLiked());
        assertEquals(1, song.getOtherTotalLiked());
        assertEquals(1, song.getOutsideTotalLiked());
        song.liked("music", "Other", "Outside of United States");
        assertEquals(2, song.getMusicTotalLiked());
        assertEquals(1, song.getMusicLiked());
        assertEquals(2, song.getOtherTotalLiked());
        assertEquals(1, song.getOtherLiked());
        assertEquals(2, song.getOutsideTotalLiked());
        assertEquals(1, song.getOutsideLiked());

        // Default
        try {
            song.heard("fishing", "swimming", "running");
        }
        catch (Exception e)
        {
            assertNotNull(e);
            assertTrue(e instanceof IllegalStateException);
        }

        try {
            song.notHeard("fishing", "swimming", "running");
        }
        catch (Exception e)
        {
            assertNotNull(e);
            assertTrue(e instanceof IllegalStateException);
        }

        try {
            song.liked("fishing", "swimming", "running");
        }
        catch (Exception e)
        {
            assertNotNull(e);
            assertTrue(e instanceof IllegalStateException);
        }

        try {
            song.notLiked("fishing", "swimming", "running");
        }
        catch (Exception e)
        {
            assertNotNull(e);
            assertTrue(e instanceof IllegalStateException);
        }
        
    }
}
