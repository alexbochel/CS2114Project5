package prj5;

/**
 * This class stores the information for each song. 
 * 
 * @author Alexander James Bochel
 * @version 2016.11.12
 *
 */
public class Song {

    // The information about the songs. 
    private String songTitle;
    private String songArtist;
    private int songYear;
    private String songGenre;
    private boolean liked;
    private boolean heard;
    
    /**
     * This is the constructor for the song class. 
     * @param title The song title. 
     * @param artist The artist of the song. 
     * @param year The year the song was released. 
     * @param genre The genre of the song. 
     */
    public Song(String title, String artist, int year, String genre) {
        songTitle = title;
        songArtist = artist;
        songYear = year;
        songGenre = genre;
        
        liked = false;
        heard = false;
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
    public int getYear() {
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
     * This method gets whether or not the song was liked. 
     * @return boolean Liked for not. 
     */
    public boolean getLiked() {
        return liked;
    }
    
    /**
     * This method gets whether or not the song was heard. 
     */
    public boolean getHeard() {
        return heard;
    }
    
    /**
     * This method sets the number of likes for the song. 
     */
    public void setLikes() {
        liked = true;
    }
    
    /**
     * This method sets whether or not the song was heard. 
     */
    public void setHeard() {
        heard = true;
    }
    
    /**
     * This method returns the song information as a string.
     * @return String Of information for the song.  
     */
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append(songTitle);
        build.append(":");
        build.append(" ");
        build.append(songArtist + ",");
        build.append(" " + songGenre + ",");
        build.append(" " + songYear);
        
        return build.toString();
    }
}