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
    public static void main(String[] args) {
        
        try {
            songList = new SongList(args[1]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Input.createStudents(args[0]);

        songList.sortGenre();
        print();
        songList.sortTitle();
        print();
    }

    /**
     * This method creates the students whose information
     * will be stored in the song objects.
     *
     * @param file containing student information.
     */
    public static void createStudents(String file)
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
            String[] infoArray = info.split(",");

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

                        index++;
                    }
                }

            }
        }
        surveyScanner.close();
    }

    /**
     * This method contains the print calls in order to be able to sort
     * the list first and then print. This will be done twice.
     */
    public static void print()
    {
        // This will loop through all of the data and print it out. 
        for (int i = 0; i < songList.size(); i++)
        {
            // Print the main info about the song. 
            System.out.println("song title " + songList.get(i).getTitle());
            System.out.println("song artist " + songList.get(i).getArtist());
            System.out.println("song genre " + songList.get(i).getGenre());
            System.out.println("song year " + songList.get(i).getYear());
            System.out.println("heard");

            // prints the reading hobby.
            System.out.print("reading");

            if (songList.get(i).getReadingTotalHeard() == 0) {
                System.out.print(0);
            }
            else
            {
                System.out.print(songList.get(i).getReadingHeard() * 100
                        / songList.get(i).getReadingTotalHeard());
            }

            // Prints the art hobby
            System.out.print(" art");

            if (songList.get(i).getArtTotalHeard() == 0) {
                System.out.print(0);
            }
            else
            {
                System.out.print(songList.get(i).getArtHeard() * 100
                        / songList.get(i).getArtTotalHeard());
            }

            // Prints the sports hobby
            System.out.print(" sports");

            if (songList.get(i).getSportsTotalHeard() == 0) {
                System.out.print(0);
            }
            else
            {
                System.out.print(songList.get(i).getSportsHeard() * 100
                        / songList.get(i).getSportsTotalHeard());
            }

            // Prints the music hobby
            System.out.print(" music");

            if (songList.get(i).getMusicTotalHeard() == 0) {
                System.out.println(0);
            }
            else
            {
                System.out.println(songList.get(i).getMusicHeard() * 100
                        / songList.get(i).getMusicTotalHeard());
            }

            System.out.println("likes");

            // Prints the reading hobby
            System.out.print("reading");

            if (songList.get(i).getReadingTotalLiked() == 0) {
                System.out.print(0);
            }
            else
            {
                System.out.print(songList.get(i).getReadingLiked() * 100
                        / songList.get(i).getReadingTotalLiked());
            }

            // Prints the art hobby
            System.out.print(" art");

            if (songList.get(i).getArtTotalLiked() == 0) {
                System.out.print(0);
            }
            else
            {
                System.out.print(songList.get(i).getArtLiked() * 100
                        / songList.get(i).getArtTotalLiked());
            }
            
            // Prints the sports hobby
            System.out.print(" sports");

            if (songList.get(i).getSportsTotalLiked() == 0) {
                System.out.print(0);
            }
            else
            {
                System.out.print(songList.get(i).getSportsLiked() * 100
                        / songList.get(i).getSportsTotalLiked());
            }

            // Prints the music hobby
            System.out.print(" music");

            if (songList.get(i).getMusicTotalLiked() == 0) {
                System.out.println(0);
            }
            else
            {
                System.out.println(songList.get(i).getMusicLiked() * 100
                        / songList.get(i).getMusicTotalLiked());
            }

            System.out.println();
        }
    }
}