/**
 *
 */
package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author Purnima Ghosh
 * @version 11.13.2016
 *
 */
public class SongList extends DoublyLinkedList<Song> implements Iterable<Song> {

    private Scanner key;
    /**
     * This is the constructor for the SongList class.
     */
    public SongList(String file) {
        super();

        try {

            key = new Scanner(new File(file));
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                e.printStackTrace();
                System.exit(0);
            }
        }

        key.nextLine();
        while (key.hasNextLine()) {
            String[] songSplit = key.nextLine().split(",");
            super.add(new Song(songSplit[0], songSplit[1],
                    Integer.valueOf(songSplit[2]), songSplit[3]));
        }
        key.close();
    }

    /**
     * This method adds a song to the list.
     */
    public void add(Song newSong) {
        if (newSong == null) {
            throw new IllegalArgumentException();
        }
        super.add(newSong);
    }

    @Override
    public Iterator<Song> iterator() {
        return new SongIterator();
    }

    /**
     * This is the iterator class for the waiting party
     *
     * @author Purnima Ghosh
     * @version 11.02.2016
     *
     */
    private class SongIterator implements Iterator<Song> {
        private int index;
        private Song song;

        /**
         * This method initializes the index at -1
         */
        private SongIterator() {
            index = -1;
        }

        /**
         * This method finds out if there is a next line
         */
        @Override
        public boolean hasNext() {
            return (index < (size() - 1));
        }

        /**
         * This method returns the next value
         */
        @Override
        public Song next() {
            if (hasNext()) {
                song = get(index + 1);
                index++;
                return song;
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
