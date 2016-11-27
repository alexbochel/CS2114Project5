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
                "Sum 41", "2001", "alternative");
    }

    /**
     * This method tests the set likes method for each hobby.
     */
    public void testGetMethods() {
        //<--Hobby-->//
        // Liked
        assertEquals(0, song.getArtTotalLiked());
        assertEquals(0, song.getArtLiked());
        assertEquals(0, song.getArtLikedPercent());

        assertEquals(0, song.getReadingTotalLiked());
        assertEquals(0, song.getReadingLiked());
        assertEquals(0, song.getReadingLikedPercent());
        
        assertEquals(0, song.getMusicTotalLiked());
        assertEquals(0, song.getMusicLiked());
        assertEquals(0, song.getMusicLikedPercent());

        assertEquals(0, song.getSportsTotalLiked());
        assertEquals(0, song.getSportsLiked());
        assertEquals(0, song.getSportsLikedPercent());
        
        // Heard
        assertEquals(0, song.getArtTotalHeard());
        assertEquals(0, song.getArtHeard());
        assertEquals(0, song.getArtHeardPercent());

        assertEquals(0, song.getReadingTotalHeard());
        assertEquals(0, song.getReadingHeard());
        assertEquals(0, song.getReadingHeardPercent());

        assertEquals(0, song.getMusicTotalHeard());
        assertEquals(0, song.getMusicHeard());
        assertEquals(0, song.getMusicHeardPercent());

        assertEquals(0, song.getSportsTotalHeard());
        assertEquals(0, song.getSportsHeard());
        assertEquals(0, song.getSportsHeardPercent());
        
        //<--Major-->//
        // Liked
        assertEquals(0, song.getCsTotalLiked());
        assertEquals(0, song.getCsLiked());
        assertEquals(0, song.getCsLikedPercent());

        assertEquals(0, song.getMathTotalLiked());
        assertEquals(0, song.getMathLiked());
        assertEquals(0, song.getMathLikedPercent());
        
        assertEquals(0, song.getEngineeringTotalLiked());
        assertEquals(0, song.getEngineeringLiked());
        assertEquals(0, song.getEngineeringLikedPercent());

        assertEquals(0, song.getOtherTotalLiked());
        assertEquals(0, song.getOtherLiked());
        assertEquals(0, song.getOtherLikedPercent());
        
        // Heard
        assertEquals(0, song.getCsTotalHeard());
        assertEquals(0, song.getCsHeard());
        assertEquals(0, song.getCsHeardPercent());

        assertEquals(0, song.getMathTotalHeard());
        assertEquals(0, song.getMathHeard());
        assertEquals(0, song.getMathHeardPercent());

        assertEquals(0, song.getEngineeringTotalHeard());
        assertEquals(0, song.getEngineeringHeard());
        assertEquals(0, song.getEngineeringHeardPercent());

        assertEquals(0, song.getOtherTotalHeard());
        assertEquals(0, song.getOtherHeard());
        assertEquals(0, song.getOtherHeardPercent());
        
        //<--Region-->//
        // Liked
        assertEquals(0, song.getNortheastTotalLiked());
        assertEquals(0, song.getNortheastLiked());
        assertEquals(0, song.getNortheastLikedPercent());

        assertEquals(0, song.getSoutheastTotalLiked());
        assertEquals(0, song.getSoutheastLiked());
        assertEquals(0, song.getSoutheastLikedPercent());
        
        assertEquals(0, song.getUnitedstatesTotalLiked());
        assertEquals(0, song.getUnitedstatesLiked());
        assertEquals(0, song.getUnitedstatesLikedPercent());

        assertEquals(0, song.getOutsideTotalLiked());
        assertEquals(0, song.getOutsideLiked());
        assertEquals(0, song.getOutsideLikedPercent());
        
        // Heard
        assertEquals(0, song.getNortheastTotalHeard());
        assertEquals(0, song.getNortheastHeard());
        assertEquals(0, song.getNortheastHeardPercent());

        assertEquals(0, song.getSoutheastTotalHeard());
        assertEquals(0, song.getSoutheastHeard());
        assertEquals(0, song.getSoutheastHeardPercent());

        assertEquals(0, song.getUnitedstatesTotalHeard());
        assertEquals(0, song.getUnitedstatesHeard());
        assertEquals(0, song.getUnitedstatesHeardPercent());

        assertEquals(0, song.getOutsideTotalHeard());
        assertEquals(0, song.getOutsideHeard());
        assertEquals(0, song.getOutsideHeardPercent());

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
     * This method tests the compareToTitle methods for the song class. 
     */
    public void testCompareToYear() {
        assertEquals(-1, song.compareToYear(song2));
        assertEquals(1, song2.compareToYear(song));
        assertEquals(0, song.compareToYear(song));
    }

    /**
     * This method tests the compareToGenre method. 
     */
    public void testCompareToArtist() {
        assertEquals(1, song.compareToArtist(song2));
        assertEquals(-1, song2.compareToArtist(song));
        assertEquals(0, song.compareToArtist(song));
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
