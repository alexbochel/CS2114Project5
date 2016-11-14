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
    private int songYear;
    private String songGenre;
    private boolean likes;
    private boolean heard;

    /**
     * This is the constructor for the song class.
     */
    public Song(String title, String artist, int year, String genre) {
        songTitle = title;
        songArtist = artist;
        songYear = year;
        songGenre = genre;

        likes = false;
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
     * This method gets the number of likes on the song.
     * @return int The number of likes.
     */
    public boolean getLikes() {
        return likes;
    }

    /**
     * This method gets the number of dislikes on a song.
     * @return int The number of dislikes.
     */
    public boolean getHeard() {
        return heard;
    }

    /**
     * This method sets the number of likes for the song.
     */
    public void setLikes() {
        likes = true;
    }

    /**
     * This method sets the number of dislikes for the song.
     */
    public void setHeard() {
        heard = true;
    }

    /**
     * This method returns the song information as a string.
     * @return String Of information for the song.
     */
    public String toString() {
        /**
        StringBuilder build = new StringBuilder();
        build.append(songTitle);
        build.append(":");
        build.append(" ");
        build.append(songArtist + ",");
        build.append(" " + songGenre + ",");
        build.append(" " + songYear);

        return build.toString();
        **/

        return "song title " + getTitle().toLowerCase() + "\n" +
            "song artist " + getArtist().toLowerCase() + "\n" + "song genre " +
            getGenre().toLowerCase() + "\n" + "song year " + getYear();
    }
















}
