package prj5;

import student.TestCase;

/**
 * This test class tests the Survey class. 
 * 
 * @author omarjas5
 * @version 2016.11.13
 */
public class SurveyTest extends TestCase{

    private Survey survey;
    
    /**
     * This is the setUp method for the test class.
     */
    public void setUp() {
        survey = new Survey("Computer Science", "Southeast", "sports",
                new DoublyLinkedList<Song>());
    }
    
    /**
     * This tests all of the survey class methods.  
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
