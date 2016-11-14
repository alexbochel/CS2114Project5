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
}