package prj5;

public class ProjectRunner {

    public static void main(String[] args) {
        Input songs = new Input("MusicSurveyData2016F.csv",
                "SongList2016F.csv");

        GUIWindow window = new GUIWindow(songs);
    }
}
