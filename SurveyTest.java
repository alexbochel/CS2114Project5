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
     * Instantiates new survey and DoublyLinkedList<Song>
     * for testing.
     */
    public void setUp() {
        DoublyLinkedList<Song> list = new DoublyLinkedList<>();
        survey = new Survey("Computer Science", "Southeast", "sports",
                list);

    }

    /**
     * Test methods in Survey class
     */
    public void testSurvey()
    {

        assertEquals("Computer Science", survey.getMajor());
        assertEquals("Southeast", survey.getRegion());
        assertEquals("sports", survey.getHobby());

        survey.setHobby("music");
        assertEquals("music", survey.getHobby());

        assertEquals("Computer Science, Southeast, music", survey.toString());

        assertEquals(new DoublyLinkedList<Song>().toString(),
                survey.getList().toString());
    }

}
