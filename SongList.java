package prj5;

import java.util.LinkedList;

/**
 * This class stores the songs and their data. 
 * 
 * @author Alexander James Bochel
 * @version 2016.11.12
 *
 */
public class SongList {

    private LinkedList<Song> songList;
    
    /**
     * This is the constructor for the SongList class. 
     */
    public SongList() {
        songList = new LinkedList<Song>();
    }
    
    /**
     * This method adds a song to the list. 
     */
    public boolean add() {
        return true;
    }

}
