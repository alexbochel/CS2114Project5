package prj5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class stores the survey results. 
 * 
 * @author Alexander James Bochel
 * @version 2016.11.12
 *
 */
public class SurveyList extends DoublyLinkedList<Survey> implements Iterable<Survey> {
    
    /**
     * This is the constructor for the SongList class. 
     */
    public SurveyList() {
        super();
    }
    
    /**
     * This method adds a song to the list. 
     * @param newSong Song to be added. 
     */
    public void addSong(Survey newSurvey) {
        if (newSurvey == null) {
            throw new IllegalArgumentException();
        }
        
        add(newSurvey);
    }
    
    @Override
    public Iterator<Survey> iterator() {
        return new SurveyIterator();
    }
    
    /**
     * This is the iterator class for the waiting party
     * @author Purnima Ghosh
     * @version 11.02.2016
     *
     */
    private class SurveyIterator implements Iterator<Survey>
    {
        private int index;
        private Survey survey;
        /**
         * This method initializes the index at -1
         */
        private SurveyIterator()
        {
            index = -1;
        }
        /**
         * This method finds out if there is a next line
         */
        @Override
        public boolean hasNext() 
        {
            return (index < (size() - 1));
        }
        /**
         * This method returns the next value
         */
        @Override
        public Survey next() 
        {
            if (hasNext())
            {
                survey = get(index + 1);
                index++;
                return survey;
            }
            else
            {
                throw new NoSuchElementException();
            }
        }
    } 
}
