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

    public class SongList extends DoublyLinkedList<Song> implements Iterable<Song>
{
    private DoublyLinkedList<Song> songList;

    /**
     * This is the constructor for the SongList class. 
     */
    public SongList() 
    {
        songList = new DoublyLinkedList<Song>();
    }

    /**
     * This method adds a song to the list. 
     */
    public boolean add() 
    {
        return true;
    }

    @Override
    public Iterator<Song> iterator() 
    {
        return new SongIterator();
    }
    /**
     * This is the iterator class for the waiting party
     * @author Purnima Ghosh
     * @version 11.02.2016
     *
     */
    private class SongIterator implements Iterator<Song>
    {
        private int index;
        private Song song;
        /**
         * This method initializes the index at -1
         */
        private SongIterator()
        {
            index = -1;
        }
        /**
         * This method finds out if there is a next line
         */
        @Override
        public boolean hasNext() 
        {
            return (index < (songList.size() - 1));
        }
        /**
         * This method returns the next value
         */
        @Override
        public Song next() 
        {
            if (hasNext())
            {
                song = get(index + 1);
                index++;
                return song;
            }
            else
            {
                throw new NoSuchElementException();
            }
        }
    }
}

}
