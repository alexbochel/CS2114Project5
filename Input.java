package prj5;

/**
* This is the input class that will allow the rest of the project to run. 
*/
public class Input {
    
    /**
     * This is the main class that allows the program to run. 
     * 
     * @param args The parameter for the main class. 
     */
    public static void main(String[] args)
    {
        SongCreator songCreator = new SongCreator(args[0], args[1]);
    }
}