package prj5;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This test class tests the SongList class.
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
        try {
            songList = new SongList("SongListTest1.csv");
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Create songs to go into the songList.
        song = new Song("All You Need Is Love", "The Beatles", 
                "1967", "pop rock");
    }
    
    /**
     * This tests the addSong method in the SongList class.
     */
    public void testAddSong() {

        
        songList.add(song);
        assertEquals(6, songList.size());
        
        try {
            songList.add(null);            
        }
        catch (Exception e)
        {
            assertNotNull(e);
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    /**
     * This tests the isEmpty method in the songList class.
     */
    public void testIsEmpty() {
        assertFalse(songList.isEmpty());
    }

    /**
     * This tests the sort methods for the SongList class. 
     */
    public void testSort() {
        Song temp = new Song("Another One Bites the Dust", "Queen", "1980",
                "disco");
        
        Song test = new Song("Anarchy in The UK", "The Sex Pistols", 
                "1976", "punk");
        
        songList.sortGenre();
        
        assertEquals(temp.toString(), songList.get(1).toString());
        assertEquals(song.toString(), songList.get(3).toString());
        assertEquals(test.toString(), songList.get(4).toString());
        
        songList.sortTitle();
        
        assertEquals(song.toString(), songList.get(1).toString());
        assertEquals(test.toString(), songList.get(3).toString());
        assertEquals(temp.toString(), songList.get(4).toString());
        
        songList.sortYear();
        
        assertEquals(song.toString(), songList.get(0).toString());
        assertEquals(test.toString(), songList.get(2).toString());
        assertEquals(temp.toString(), songList.get(3).toString());
        
        songList.sortArtist();
        assertEquals(song.toString(), songList.get(2).toString());
        assertEquals(test.toString(), songList.get(4).toString());
        assertEquals(temp.toString(), songList.get(1).toString());
    }
    
    /**
     * This tests the iterator methods in the nested class. 
     */
    public void testIterator()
    {
        songList.sortTitle();
        Iterator<Song> iter = songList.iterator();
        iter.next();
        
        // Check next and hasNext
        assertEquals(iter.next().toString(), song.toString());
        assertTrue(iter.hasNext());
        iter.next();
        iter.next();
        iter.next();
        assertFalse(iter.hasNext());
        
        // Check when text is called at the end of the list
        try {
            iter.next();
        }
        catch (Exception e)
        {
            assertNotNull(e);
            assertTrue(e instanceof NoSuchElementException);
        }
    }

}
