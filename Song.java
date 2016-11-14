package prj5;

/**
 * This class stores the information for each song.
 *
 * @author Alexander James Bochel
 * @version 2016.11.12
 *
 */
public class Song 
{

    private String songTitle;
    private String songArtist;
    private String songYear;
    private String songGenre;
    private int artTotalHeard;
    private int artTotalLiked;
    private int artHeard;
    private int artLiked;
    private int readingTotalHeard;
    private int readingTotalLiked;
    private int readingHeard;
    private int readingLike;
    private int sportsTotalHeard;
    private int sportsTotalLiked;
    private int sportsHeard;
    private int sportsLiked;
    private int musicTotalHeard;
    private int musicTotalLiked;
    private int musicHeard;
    private int musicLiked;




    /**
     * This is the constructor for the song class.
     */
    public Song() 
    {
        songTitle = new String();
        songArtist = new String();
        songYear = new String();
        songGenre = new String();

        artTotalHeard = 0;
        artTotalLiked = 0;
        artHeard = 0;
        artLiked = 0;
        readingTotalHeard = 0;
        readingTotalLiked = 0;
        readingHeard = 0;
        readingLike = 0;
        sportsTotalHeard = 0;
        sportsTotalLiked = 0;
        sportsHeard = 0;
        sportsLiked = 0;
        musicTotalHeard = 0;
        musicTotalLiked = 0;
        musicHeard = 0;
        musicLiked = 0;
    }

    /**
     * This method gets the name of the song.
     * @return String The name of the song.
     */
    public String getTitle() 
    {
        return songTitle;
    }

    /**
     * This method gets the name of the artist.
     * @return String The name of the artist.
     */
    public String getArtist() 
    {
        return songArtist;
    }

    /**
     * This method gets the year the song came out.
     * @return String The year of the song.
     */
    public int getYear() 
    {
        return songYear;
    }

    /**
     * This method gets the genre of the song.
     * @return String The genre of the song.
     */
    public String getGenre() 
    {
        return songGenre;
    }

    /**
     * This method gets the number of likes on the song.
     * @return int The number of likes.
     */
    public boolean getLikes() 
    {
        return likes;
    }

    /**
     * This method gets the number of dislikes on a song.
     * @return int The number of dislikes.
     */
    public boolean getHeard() 
    {
        return heard;
    }

    /**
     * This method sets the number of likes for the song.
     */
    public void setLikes() 
    {
        likes = true;
    }

    /**
     * This method sets the number of dislikes for the song.
     */
    public void setHeard() 
    {
        heard = true;
    }

    /**
     * This method returns the song information as a string.
     * @return String Of information for the song.
     */
    public String toString() 
    {
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
    public void addHeard(String hobby)
    {
        switch (hobby)
        {
        case "art":
            artHeard++;
            artTotalHeard++;
            break;
        case "reading":
            readingHeard++;
            readingTotalHeard++;
            break;
        case "sports":
            sportsHeard++;
            sportsTotalHeard++;
            break;
        case "music":
            musicHeard++;
            musicTotalHeard++;
            break;
        default:
            throw new IllegalStateException("Not one of the possible options");
        }
    }
    public void addNotHeard(String hobby)
    {
        switch(hobby)
        {
        case "art":
            artTotalHeard++;
            break;
        case "reading":
            readingTotalHeard++;
            break;
        case "sports":
            sportsTotalHeard++;
            break;
        case "music":
            musicTotalHeard++;
            break;
        default:
            throw new IllegalStateException("Not one of the possible options");
        }
    }
    public void addLikes(String hobby)
    {
        switch(hobby)
        {
        case "art":
            artLiked++;
            artTotalLiked++;
            break;
        case "reading":
            readingLike++;
            readingTotalLiked++;
            break;
        case "sports":
            sportsLiked++;
            sportsTotalLiked++;
            break;
        case "music":
            musicLiked++;
            musicTotalLiked++;
            break;
        default:
            throw new IllegalStateException("Not one of the possible options");
        }
    }
    public void addNotLike(String hobby)
    {
        switch(hobby)
        {
        case "art":
            artTotalLiked++;
            break;
        case "reading":
            readingTotalLiked++;
            break;
        case "sports":
            sportsTotalLiked++;
            break;
        case "music":
            musicTotalLiked++;
            break;
        default:
            throw new IllegalStateException("Not one of the possible options");
        }
    }
}
