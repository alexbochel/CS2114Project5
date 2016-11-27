package prj5;

public class ProjectRunner {

    public static void main(String[] args)
    {
        Input songs = new Input("SongList.csv", "MusicSurveyData.csv");
        GUIWindow window = new GUIWindow(songs);
    }
}
