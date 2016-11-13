package prj5;

/**
 * This test class tests the SongList class. \
 * 
 * @author Alexander James Bochel
 * @version 2016.11.13
 *
 */
public class SongListTest extends student.TestCase {

    private SongList songList; 
    private Song song;
    
    /**
     * This is the setUp method for this test class.  
     */
    public void setUp() {
        // Create the songList. 
        songList = new SongList();
        
        // Create songs to go into the songList. 
        song = new Song("All You Need Is Love", 
                "The Beatles", 1967, "pop rock");
    }
    
    /**
     * This tests the addSong method in the SongList class. 
     */
    public void testAddSong() {
        assertEquals(0, songList.size());
        songList.addSong(song);
        assertEquals(1, songList.size());
    }
    
    /**
     * This tests the isEmpty method in the songList class. 
     */
    public void testIsEmpty() {
        assertTrue(songList.isEmpty());
    }

}
