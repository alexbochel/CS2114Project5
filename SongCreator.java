package prj5;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SongCreator {
    
    private DoublyLinkedList<Song> songList;
    private SurveyList surveyList;
    private Scanner key;
    private Scanner dataKey;
    
    public SongCreator()
    {
        songList = new DoublyLinkedList<Song>();
        surveyList = new SurveyList();
    }
    
    public void addSongs(String songL, String dataList)
    {
        try
        {
            key = new Scanner(songL);
            dataKey = new Scanner(dataList);
        }
        catch (Exception e)
        {
            if (e instanceof FileNotFoundException)
            {
                e.printStackTrace();
                System.exit(0);
            }
        }
        
        key.nextLine();
        while (key.hasNextLine())
        {
            String[] songSplit = key.nextLine().split("* ,*");
            songList.add(new Song(songSplit[0], songSplit[1], 
                    Integer.valueOf(songSplit[2]), songSplit[3]));
        }
        key.close();
        
        while (dataKey.hasNextLine())
        {
            key.nextLine();
            String[] dataSplit = key.nextLine().split("* ,*");
            
            surveyList.add(new Survey(dataSplit[2], dataSplit[3], dataSplit[4], songList));
            
            for (int i = 0; i < surveyList.size(); i++)
            {
                for (int j = 5; j < dataSplit.length - 1; j++)
                {
                    if (j % 2 == 0)
                    {
                        if (dataSplit[j].equals("Yes"))
                        {
                            surveyList.get(i).list.get(j).setLikes();
                        }
                    }
                    else
                    {
                        if (dataSplit[j].equals("Yes"))
                        {
                            surveyList.get(i).list.get(j).setHeard();
                        }
                    }
                }
            }
        }
        
    }
}
