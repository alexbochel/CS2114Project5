package prj5;

public class Input {
    public static void main(String[] args)
    {
        SongCreator songCreator = new SongCreator(args[1], args[0]);
        songCreator.addSurveys();
        songCreator.calculate();
    }
}
