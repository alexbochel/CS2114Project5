package prj5;

import java.io.File;
import student.TestCase;
/**
 *
 * @author omar
 *
 */
public class SongCreatorTest extends TestCase {

    private SongCreator sc;
    private Song song;
    private Survey survey;

    /**
     *
     */
    public void setUp() {
        sc = new SongCreator("SongListTest1.csv", "MusicSurveyDataTest1.csv");
        song = new Song("All These Things I've Done", "The Killers", 2005,
                "alternative");
        survey = new Survey("Math or CMDA", "Southeast", "sports", null);
    }

    /**
     *
     */
    public void testSomething() {
        sc.addSurveys();

        assertEquals(6, sc.getSurveyList().size());
        assertEquals(survey.getHobby(), sc.getSurveyList().get(0).getHobby());



        sc.calculate();

    }
}
