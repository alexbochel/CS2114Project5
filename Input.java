package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This is the input class that will allow the rest of the project to run.
 */
public class Input {

    private static SongList songList;

    /**
     * This is the main class that allows the program to run.
     *
     * @param args
     *            The parameter for the main class.
     */
    public Input(String music, String data) {

        try {
            songList = new SongList(music);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        this.createStudents(data);

        //songList.sortGenre();
        print();
        //songList.sortTitle();
        //print();

    }

    /**
     * This method creates the students whose information will be stored in the
     * song objects.
     *
     * @param file
     *            containing student information.
     */
    public void createStudents(String file) {
        Scanner surveyScanner = null;
        Exception exception = new Exception();

        try {
            surveyScanner = new Scanner(new File(file));
        } catch (Exception e) {
            exception = e;
        }

        if (exception instanceof FileNotFoundException) {
            exception.printStackTrace();
            System.exit(1);
        }

        surveyScanner.nextLine();

        while (surveyScanner.hasNextLine()) {
            String info = surveyScanner.nextLine();
            String[] infoArray = info.split(",");

            if (infoArray.length > 5) {
                
                String major = infoArray[2];
                String region = infoArray[3];
                String hobby = infoArray[4];
                
                int index = 0;
                for (int i = 5; i < infoArray.length; i += 2) {
                    if (hobby.equals("")) {
                        i = infoArray.length;
                    } else {
                        if (infoArray[i].equals("Yes")) {
                            songList.get(index).heard(hobby, major, region);
                        } else if (infoArray[i].equals("No")) {
                            songList.get(index).notHeard(hobby, major, region);
                        }
                        if (i + 1 < infoArray.length
                                && infoArray[i + 1].equals("No")) {
                            songList.get(index).notLiked(hobby, major, region);
                        } else if (i + 1 < infoArray.length
                                && infoArray[i + 1].equals("Yes")) {
                            songList.get(index).liked(hobby, major, region);
                        }

                        index++;
                    }
                }

            }
        }
        surveyScanner.close();
    }

    /**
     * This method contains the print calls in order to be able to sort the list
     * first and then print. This will be done twice.
     */
    public void print() {
        // This will loop through all of the data and print it out.
        for (int i = 0; i < songList.size(); i++) {
            // Print the main info about the song.
            // printSong(songList.get(i));
            // Print info pertaining to how many people heard
            // or liked a song.
            details(songList.get(i));

        }
    }

    /**
     * Prints the title, artist, genre and year of a given song.
     * 
     * @param song
     *            is the song being printed to the console.
     */
    private void printSong(Song song) {
        System.out.println("song title " + song.getTitle());
        System.out.println("song artist " + song.getArtist());
        System.out.println("song genre " + song.getGenre());
        System.out.println("song year " + song.getYear());
    }

    /**
     * Prints the statistics of a song
     * 
     * @param song
     *            is the song being examined
     */
    private void details(Song song) {

        // --Hobby--//
        // Reading
        song.setReadingHeardPercent(
                percent(song.getReadingHeard(), song.getReadingTotalHeard()));
        song.setReadingLikedPercent(
                percent(song.getReadingLiked(), song.getReadingTotalLiked()));

        // Art
        song.setArtHeardPercent(
                percent(song.getArtHeard(), song.getArtTotalHeard()));
        song.setArtLikedPercent(
                percent(song.getArtLiked(), song.getArtTotalLiked()));

        // Sports
        song.setSportsHeardPercent(
                percent(song.getSportsHeard(), song.getSportsTotalHeard()));
        song.setSportsLikedPercent(
                percent(song.getSportsLiked(), song.getSportsTotalLiked()));

        // Music
        song.setMusicHeardPercent(
                percent(song.getMusicHeard(), song.getMusicTotalHeard()));
        song.setMusicLikedPercent(
                percent(song.getMusicLiked(), song.getMusicTotalLiked()));

        // --Major--//
        // Math
        song.setMathHeardPercent(
                percent(song.getMathHeard(), song.getMathTotalHeard()));
        song.setMathLikedPercent(
                percent(song.getMathLiked(), song.getMathTotalLiked()));

        // Computer Science
        song.setCsHeardPercent(
                percent(song.getCsHeard(), song.getCsTotalHeard()));
        song.setCsLikedPercent(
                percent(song.getCsLiked(), song.getCsTotalLiked()));

        // Engineering
        song.setEngineeringHeardPercent(percent(song.getEngineeringHeard(),
                song.getEngineeringTotalHeard()));
        song.setEngineeringLikedPercent(percent(song.getEngineeringLiked(),
                song.getEngineeringTotalLiked()));

        // Other
        song.setOtherHeardPercent(
                percent(song.getOtherHeard(), song.getOtherTotalHeard()));
        song.setOtherLikedPercent(
                percent(song.getOtherLiked(), song.getOtherTotalLiked()));
        
        // --Region-- //
        
        // Northeast
        song.setNortheastHeardPercent(
                percent(song.getNortheastHeard(), song.getNortheastTotalHeard()));
        song.setNortheastLikedPercent(
                percent(song.getNortheastLiked(), song.getNortheastTotalLiked()));

        // Computer Science
        song.setSoutheastHeardPercent(
                percent(song.getSoutheastHeard(), song.getSoutheastTotalHeard()));
        song.setSoutheastLikedPercent(
                percent(song.getSoutheastLiked(), song.getSoutheastTotalLiked()));

        // United States
        song.setUnitedstatesHeardPercent(percent(song.getUnitedstatesHeard(),
                song.getUnitedstatesTotalHeard()));
        song.setUnitedstatesLikedPercent(percent(song.getUnitedstatesLiked(),
                song.getUnitedstatesTotalLiked()));

        // Outside
        song.setOutsideHeardPercent(
                percent(song.getOutsideHeard(), song.getOutsideTotalHeard()));
        song.setOutsideLikedPercent(
                percent(song.getOutsideLiked(), song.getOutsideTotalLiked()));

    }

    /**
     * Calculates the percent of something
     * 
     * @param i1
     *            is the first number passed through
     * @param i2
     *            is the second number passed through
     * @return the percent
     */
    private int percent(int i1, int i2) {
        if (i2 == 0) {
            return 0;
        } else {
            return i1 * 100 / i2;
        }
    }

    /**
     * Return songList.
     * 
     * @return
     */
    public SongList getSongList() {
        return songList;
    }
}
