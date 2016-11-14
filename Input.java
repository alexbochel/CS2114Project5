package prj5;
/**
 * This class allows us to run the project
 */
public class Input 
{
    /**
     * This method creates a new songcreater to add surveys and calculat data
     */
    public static void main(String[] args)
    {
        SongCreator songCreator = new SongCreator(args[1], args[0]);
        songCreator.addSurveys();
        songCreator.calculate();
    }
}
