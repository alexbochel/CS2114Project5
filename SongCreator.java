package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SongCreator {
    private SongList songList;
    private SurveyList surveyList;
    private Scanner dataKey;
    private String song;
    private String surveyData;

    /**
     *
     * @param fileName
     * @param dataFile
     */
    public SongCreator(String songFile, String surveyFile)
    {
        surveyList = new SurveyList();
        song = songFile;
        surveyData = surveyFile;
        songList = new SongList(songFile);
    }

    /**
     *
     * @param dataList
     */
    public void addSurveys() {

        try {
            dataKey = new Scanner(new File(surveyData));
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                e.printStackTrace();
                System.exit(0);
            }
        }

        dataKey.nextLine();
        int i = 0;
        while (dataKey.hasNextLine()) {

            String[] dataSplit = dataKey.nextLine().split(",");
            surveyList.add(new Survey(dataSplit[2], dataSplit[3], dataSplit[4],
                    new SongList(song)));

            int k = 0;

            for (int j = 5; j < dataSplit.length; j++) {

                if (j % 2 == 0) {
                    if (dataSplit[j].equals("Yes")) {
                        surveyList.get(i).getList().get(k).setLikes();
                    }
                }
                else {
                    if (dataSplit[j].equals("Yes")) {
                        surveyList.get(i).getList().get(k).setHeard();

                    }

                    k--;

                }

                k++;
            }
            i++;
        }

        dataKey.close();
    }

    /**
     *
     */
    public void calculate() {


        for (int i = 0; i < songList.size(); i++) {

            int sport = 0;
            int sportLikes = 0;
            int sportHeard = 0;
            int music = 0;
            int musicLikes = 0;
            int musicHeard = 0;
            int reading = 0;
            int readingLikes = 0;
            int readingHeard = 0;
            int art = 0;
            int artLikes = 0;
            int artHeard = 0;




            for (int j = 0; j < surveyList.size(); j++) {

                String hobby = surveyList.get(j).getHobby();

                switch (hobby) {
                case "sports":
                    sport++;
                    break;
                case "reading":
                    reading++;
                    break;
                case "music":
                    music++;
                    break;
                case "art":
                    art++;
                    break;
                default:
                    break;
                }

                if (surveyList.get(j).getList().get(i).getHeard()) {
                    switch (hobby) {
                    case "sports":
                        sportHeard++;
                        break;
                    case "reading":
                        readingHeard++;
                        break;
                    case "music":
                        musicHeard++;
                        break;
                    case "art":
                        artHeard++;
                        break;
                    default:
                        break;
                    }
                }
                if (surveyList.get(j).getList().get(i).getHeard()) {
                    switch (hobby) {
                    case "sports":
                        sportLikes += 1;
                        break;
                    case "reading":
                        readingLikes += 1;
                        break;
                    case "music":
                        musicLikes += 1;
                        break;
                    case "art":
                        artLikes += 1;
                        break;
                    default:
                        break;
                    }
                }
            }
            System.out.println(surveyList.get(0).getList().get(i).toString());
            System.out.println("heard");
            System.out.println("reading" + percent(readingHeard, reading)
                    + " art" + percent(artHeard, art) + " sports"
                    + percent(sportHeard, sport) + " music"
                    + percent(musicHeard, music));
            System.out.println("likes");
            System.out.println("reading" + percent(readingLikes, reading)
                    + " art" + percent(artLikes, art) + " sports"
                    + percent(sportLikes, sport) + " music"
                    + percent(musicLikes, music));
        }

        /**
        if (sport == 0) {
            sportLikes = 0;
            sportHeard = 0;
        }
        else {
            sportLikes = (int) ((double) sportLikes / sport * 100);
            sportHeard = (int) ((double) sportHeard / sport * 100);
        }
        if (reading == 0) {
            readingLikes = 0;
            readingHeard = 0;
        }
        else {
            readingLikes = (int) ((double) readingLikes / reading * 100);
            readingHeard = (int) ((double) readingHeard / reading * 100);
        }
        if (music == 0) {
            musicLikes = 0;
            musicHeard = 0;
        }
        else {
            musicLikes = (int) ((double) musicLikes / music * 100);
            musicHeard = (int) ((double) musicHeard / music * 100);
        }
        if (art == 0) {
            artLikes = 0;
            artHeard = 0;
        }
        else {
            artLikes = (int) ((double) artLikes / art * 100);
            artHeard = (int) ((double) artHeard / art * 100);
        }

        for (int i = 0; i < surveyList.get(0).getList().size(); i++) {
            System.out.println(surveyList.get(0).getList().get(i).toString());
            System.out.println("heard");
            System.out.println("reading" + percent(readingHeard, reading)
                    + " art" + percent(artHeard, art) + " sports"
                    + percent(sportHeard, sport) + " music"
                    + percent(musicHeard, music));
            System.out.println("likes");
            System.out.println("reading" + percent(readingLikes, reading)
                    + " art" + percent(artLikes, art) + " sports"
                    + percent(sportLikes, sport) + " music"
                    + percent(musicLikes, music));
        }
        **/
    }

    /**
     *
     * @return
     */
    public SurveyList getSurveyList() {
        return surveyList;
    }

    /**
     *
     */
    private int percent(int i1, int i2)
    {
        if (i2 == 0)
        {
            return 0;
        }
        else
        {
            return (i1 * 100) / i2;
        }
    }
}
