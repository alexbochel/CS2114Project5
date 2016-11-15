package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * This class scans in the information from the music survey
 */
public class SongCreator 
{
    private SongList songList;

    /**
     * This method scans in the survey information from the survey
     * @param fileName is the name of the file being imported
     * @param dataFile is the data from the file being imported
     */
    public SongCreator(String surveyFile, String songFile) 
    {
        this.createStudents(surveyFile);

        songList = new SongList(songFile);
        songList.sortGenre();
        print();
        songList.sortTitle();
        print();
    }

    public void createStudents(String file)
    {
        Scanner surveyScanner = null;
        Exception exception = new Exception();

        try
        {
            surveyScanner = new Scanner(new File(file));
        }
        catch (Exception e)
        {
            exception = e;
        }

        if (exception instanceof FileNotFoundException)
        {
            exception.printStackTrace();
            System.exit(1);
        }

        surveyScanner.nextLine();

        while (surveyScanner.hasNextLine())
        {
            String info = surveyScanner.nextLine();
            String[] infoArray = info.split("*, *");

            if (infoArray.length > 5)
            {
                String hobby = infoArray[4];
                int index = 0;
                for (int i = 5; i < infoArray.length; i += 2)
                {
                    if (hobby.equals(""))
                    {
                        i = infoArray.length;
                    }
                    else
                    {
                        if (infoArray[i].equals("Yes"))
                        {
                            songList.get(index).heard(hobby);
                        }
                        else if (infoArray[i].equals("No"))
                        {
                            songList.get(index).notHeard(hobby);
                        }
                        if (i + 1 < infoArray.length && 
                                infoArray[i + 1].equals("No"))
                        {
                            songList.get(index).notLiked(hobby);
                        }
                        else if (i + 1 < infoArray.length && 
                                infoArray[i + 1].equals("Yes"))
                        {
                            songList.get(index).liked(hobby);
                        }

                        index ++;
                    }
                }

            }
        }
        surveyScanner.close();
    }
    public void print()
    {
        for (int i = 0; i < songList.size(); i++)
        {
            System.out.println("song title " + songList.get(i).getTitle());
            System.out.println("song title " + songList.get(i).getArtist());
            System.out.println("song title " + songList.get(i).getGenre());
            System.out.println("song title " + songList.get(i).getYear());
            System.out.println("heard");
            
            System.out.print("reading");
            
            if (songList.get(i).getReadingTotalHeard() == 0) {
                System.out.print(0);
            }
            else 
            {
                System.out.print(songList.get(i).getReadingHeard() * 100 
                        / songList.get(i).getReadingTotalHeard());
            }
            
            System.out.print(" art");
           
            if (songList.get(i).getArtTotalHeard() == 0) {
                System.out.print(0);
            }
            else 
            {
                System.out.print(songList.get(i).getArtHeard() * 100 
                        / songList.get(i).getArtTotalHeard());
            }
            
            System.out.print(" sports");
           
            if (songList.get(i).getSportsTotalHeard() == 0) {
                System.out.print(0);
            }
            else 
            {
                System.out.print(songList.get(i).getSportsHeard() * 100 
                        / songList.get(i).getSportsTotalHeard());
            }
            
            System.out.print(" music");
            
            if (songList.get(i).getMusicTotalHeard() == 0) {
                System.out.println(0);
            }
            else 
            {
                System.out.print(songList.get(i).getMusicHeard() * 100 
                        / songList.get(i).getMusicTotalHeard());
            }
            
            System.out.println("likes");
            
            System.out.print("reading");
            
            if (songList.get(i).getReadingTotalLiked() == 0) {
                System.out.print(0);
            }
            else 
            {
                System.out.print(songList.get(i).getReadingLiked() * 100 
                        / songList.get(i).getReadingTotalLiked());
            }
            
            System.out.print(" art");
           
            if (songList.get(i).getArtTotalLiked() == 0) {
                System.out.print(0);
            }
            else 
            {
                System.out.print(songList.get(i).getArtLiked() * 100 
                        / songList.get(i).getArtTotalLiked());
            }
            
            System.out.print(" sports");
           
            if (songList.get(i).getSportsTotalLiked() == 0) {
                System.out.print(0);
            }
            else 
            {
                System.out.print(songList.get(i).getSportsLiked() * 100 
                        / songList.get(i).getSportsTotalLiked());
            }
            
            System.out.print(" music");
            
            if (songList.get(i).getMusicTotalLiked() == 0) {
                System.out.print(0);
            }
            else 
            {
                System.out.print(songList.get(i).getMusicLiked() * 100 
                        / songList.get(i).getMusicTotalLiked());
            }
        }
    }
    /*
    public void addSurveys() 
    {

        try {
            dataKey = new Scanner(new File(songData));
        } 
        catch (Exception e) 
        {
            if (e instanceof FileNotFoundException) 
            {
                e.printStackTrace();
                System.exit(0);
            }
        }
        dataKey.nextLine();
        int i = 0;
        while (dataKey.hasNextLine()) 
        {

            String[] dataSplit = dataKey.nextLine().split(",");
            Survey surveyList.add(new Survey(dataSplit[2], dataSplit[3], 
                    dataSplit[4]);

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


     *//**
     * This method calculates the dislikes, likes, and 
     * heards for different hobbies
     *//*
    public void calculate() 
    {
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

        for (int i = 0; i < surveyList.size(); i++) 
        {

            Survey s = surveyList.get(i);

            String hobby = s.getHobby();

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

            for (int j = 0; j < s.getList().size(); j++) 
            {

                if (s.getList().get(j).getHeard()) {
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
                if (s.getList().get(j).getLikes()) 
                {
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
        }

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

        for (int i = 0; i < surveyList.get(0).getList().size() ; i++) {
            System.out.println(surveyList.get(0).getList().get(i).toString());
            System.out.println("heard");
            System.out.println("reading" + readingHeard + " art" + artHeard
                    + " sports" + sportHeard + " music" + musicHeard);
            System.out.println("likes");
            System.out.println("reading" + readingLikes + " art" + artLikes
                    + " sports" + sportLikes + " music" + musicLikes);
        }
    }

      *//**
      * This method returns the survey list
      * @return surveyList a doubly linked list with survey data
      *//*
    public SurveyList getSurveyList() 
    {
        return surveyList;
    }*/
}