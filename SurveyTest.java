package prj5;

import java.util.LinkedList;

import student.TestCase;

/**
 * Survey test class
 * @author omarjas5
 * @version 2016.11.13
 */
public class SurveyTest extends TestCase{

    private Survey survey;
    
    /**
     * Set up
     */
    public void setUp() {
        survey = new Survey("Computer Science", "Southeast", "sports", 
                new DoublyLinkedList<Song>());
        
    }
    
    /**
     * Test
     */
    public void testSurvey()
    {
        
        assertEquals("Computer Science", survey.getMajor());
        assertEquals("Southeast", survey.getRegion());
        assertEquals("sports", survey.getHobby());
        
        survey.setHobby("music");
        assertEquals("music", survey.getHobby());
        
        assertEquals("Computer Science, Southeast, music", survey.toString());
    }
    
}
