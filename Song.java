package prj5;

/**
 * This class stores the information for each song. 
 * 
 * @author Alexander James Bochel
 * @version 2016.11.12
 *
 */
public class Song {

    private String songTitle;
    private String songArtist;
    private String songYear;
    private String songGenre;
    private int likes;
    private int dislikes;
    
    /**
     * This is the cosntructor for the song class. 
     */
    public Song() {
        
    }
    
    /**
     * This method gets the name of the song. 
     * @return String The name of the song. 
     */
    public String getTitle() {
        return songTitle;
    }
    
    /**
     * This method gets the name of the artist. 
     * @return String The name of the artist. 
     */
    public String getArtist() {
        return songArtist;
    }
    
    /**
     * This method gets the year the song came out. 
     * @return String The year of the song. 
     */
    public String getYear() {
        return songYear;
    }
    
    /**
     * This method gets the genre of the song. 
     * @return String The genre of the song. 
     */
    public String getGenre() {
        return songGenre;
    }
    
    /**
     * This method gets the number of likes on the song. 
     * @return int The number of likes. 
     */
    public int getLikes() {
        return likes;
    }
    
    /**
     * This method gets the number of dislikes on a song. 
     * @return int The number of dislikes. 
     */
    public int getDislikes() {
        return dislikes;
    }

}
