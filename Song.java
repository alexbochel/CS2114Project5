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
    private int artTotalHeard;
    private int artTotalLiked;
    private int artHeard;
    private int artLiked;
    private int readingTotalHeard;
    private int readingTotalLiked;
    private int readingHeard;
    private int readingLiked;
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
     * @param title of the song. 
     * @param artist of the song
     * @param year the song was released
     * @param genre of the song. 
     */
    public Song(String title, String artist, String year, String genre) {
        songTitle = title;
        songArtist = artist;
        songYear = year;
        songGenre = genre;

        artTotalHeard = 0;
        artTotalLiked = 0;
        artHeard = 0;
        artLiked = 0;
        readingTotalHeard = 0;
        readingTotalLiked = 0;
        readingHeard = 0;
        readingLiked = 0;
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
     * This gets the total heard for art.
     * 
     * @return the artTotalHeard
     */
    public int getArtTotalHeard() {
        return artTotalHeard;
    }

    /**
     * This sets the total heard for art.
     * 
     * @param artTotalHeard
     *            the artTotalHeard to set
     */
    public void setArtTotalHeard(int artTotalHeard) {
        this.artTotalHeard = artTotalHeard;
    }

    /**
     * This gets the total liked for art.
     * 
     * @return the artTotalLiked
     */
    public int getArtTotalLiked() {
        return artTotalLiked;
    }

    /**
     * This sets the total liked for art.
     * 
     * @param artTotalLiked
     *            the artTotalLiked to set
     */
    public void setArtTotalLiked(int artTotalLiked) {
        this.artTotalLiked = artTotalLiked;
    }

    /**
     * This gets the heard for art.
     * 
     * @return the artHeard
     */
    public int getArtHeard() {
        return artHeard;
    }

    /**
     * This sets the heard for art.
     * 
     * @param artHeard
     *            the artHeard to set
     */
    public void setArtHeard(int artHeard) {
        this.artHeard = artHeard;
    }

    /**
     * This gets the liked for art.
     * 
     * @return the artLiked
     */
    public int getArtLiked() {
        return artLiked;
    }

    /**
     * This sets the liked for art.
     * 
     * @param artLiked
     *            the artLiked to set
     */
    public void setArtLiked(int artLiked) {
        this.artLiked = artLiked;
    }

    /**
     * This gets the reading total heard.
     * 
     * @return the readingTotalHeard
     */
    public int getReadingTotalHeard() {
        return readingTotalHeard;
    }

    /**
     * This sets the total heard for reading.
     * 
     * @param readingTotalHeard
     *            the readingTotalHeard to set
     */
    public void setReadingTotalHeard(int readingTotalHeard) {
        this.readingTotalHeard = readingTotalHeard;
    }

    /**
     * This gets the total liked for reading.
     * 
     * @return the readingTotalLiked
     */
    public int getReadingTotalLiked() {
        return readingTotalLiked;
    }

    /**
     * This sets the total liked for reading.
     * 
     * @param readingTotalLiked
     *            the readingTotalLiked to set
     */
    public void setReadingTotalLiked(int readingTotalLiked) {
        this.readingTotalLiked = readingTotalLiked;
    }

    /**
     * This gets the heard for reading.
     * 
     * @return the readingHeard
     */
    public int getReadingHeard() {
        return readingHeard;
    }

    /**
     * This sets the heard for reading.
     * 
     * @param readingHeard
     *            the readingHeard to set
     */
    public void setReadingHeard(int readingHeard) {
        this.readingHeard = readingHeard;
    }

    /**
     * This gets the likes for reading.
     * 
     * @return the readingLike
     */
    public int getReadingLiked() {
        return readingLiked;
    }

    /**
     * This sets the likes for reading.
     * 
     * @param readingLike
     *            the readingLike to set
     */
    public void setReadingLike(int readingLike) {
        this.readingLiked = readingLike;
    }

    /**
     * This gets the total heard for sports.
     * 
     * @return the sportsTotalHeard
     */
    public int getSportsTotalHeard() {
        return sportsTotalHeard;
    }

    /**
     * This sets the total heard for sports.
     * 
     * @param sportsTotalHeard
     *            the sportsTotalHeard to set
     */
    public void setSportsTotalHeard(int sportsTotalHeard) {
        this.sportsTotalHeard = sportsTotalHeard;
    }

    /**
     * This gets the total liked for sports.
     * 
     * @return the sportsTotalLiked
     */
    public int getSportsTotalLiked() {
        return sportsTotalLiked;
    }

    /**
     * This sets the total liked for sports.
     * 
     * @param sportsTotalLiked
     *            the sportsTotalLiked to set
     */
    public void setSportsTotalLiked(int sportsTotalLiked) {
        this.sportsTotalLiked = sportsTotalLiked;
    }

    /**
     * This gets the heard for sports.
     * 
     * @return the sportsHeard
     */
    public int getSportsHeard() {
        return sportsHeard;
    }

    /**
     * This sets the heard for sports.
     * 
     * @param sportsHeard
     *            the sportsHeard to set
     */
    public void setSportsHeard(int sportsHeard) {
        this.sportsHeard = sportsHeard;
    }

    /**
     * This gets the liked for sports.
     * 
     * @return the sportsLiked
     */
    public int getSportsLiked() {
        return sportsLiked;
    }

    /**
     * This sets the liked for sports.
     * 
     * @param sportsLiked
     *            the sportsLiked to set
     */
    public void setSportsLiked(int sportsLiked) {
        this.sportsLiked = sportsLiked;
    }

    /**
     * This gets the total heard for music.
     * 
     * @return the musicTotalHeard
     */
    public int getMusicTotalHeard() {
        return musicTotalHeard;
    }

    /**
     * This sets the total heard for music
     * 
     * @param musicTotalHeard
     *            the musicTotalHeard to set
     */
    public void setMusicTotalHeard(int musicTotalHeard) {
        this.musicTotalHeard = musicTotalHeard;
    }

    /**
     * This gets the total liked for music.
     * 
     * @return the musicTotalLiked
     */
    public int getMusicTotalLiked() {
        return musicTotalLiked;
    }

    /**
     * This sets the total liked for music
     * 
     * @param musicTotalLiked
     *            the musicTotalLiked to set
     */
    public void setMusicTotalLiked(int musicTotalLiked) {
        this.musicTotalLiked = musicTotalLiked;
    }

    /**
     * This gets the heard for music.
     * 
     * @return the musicHeard
     */
    public int getMusicHeard() {
        return musicHeard;
    }

    /**
     * This sets the heard for music.
     * 
     * @param musicHeard
     *            the musicHeard to set
     */
    public void setMusicHeard(int musicHeard) {
        this.musicHeard = musicHeard;
    }

    /**
     * This gets the liked for music.
     * 
     * @return the musicLiked
     */
    public int getMusicLiked() {
        return musicLiked;
    }

    /**
     * This sets the liked for music.
     * 
     * @param musicLiked
     *            the musicLiked to set
     */
    public void setMusicLiked(int musicLiked) {
        this.musicLiked = musicLiked;
    }

    /**
     * This method gets the name of the song.
     * 
     * @return String The name of the song.
     */
    public String getTitle() {
        return songTitle;
    }

    /**
     * This method gets the name of the artist.
     * 
     * @return String The name of the artist.
     */
    public String getArtist() {
        return songArtist;
    }

    /**
     * This method gets the year the song came out.
     * 
     * @return String The year of the song.
     */
    public String getYear() {
        return songYear;
    }

    /**
     * This method gets the genre of the song.
     * 
     * @return String The genre of the song.
     */
    public String getGenre() {
        return songGenre;
    }

    /**
     * This method returns the song information as a string.
     * 
     * @return String Of information for the song.
     */
    public String toString() {
        return "song title " + getTitle().toLowerCase() +
                "\n" + "song artist " + getArtist().toLowerCase() + "\n"
                + "song genre " + getGenre().toLowerCase() + "\n" + 
                "song year " + getYear();
    }

    /**
     * This is the compareTo method for the song title.
     * 
     * @param otherSong The other song being compared to.
     * @return int Whether it is greater, less than, or equal. 
     */
    public int compareToTitle(Song otherSong) {
        if (this.getTitle().compareTo(otherSong.getTitle()) < 0) {
            return -1;
        }
        if (this.getTitle().compareTo(otherSong.getTitle()) > 0) {
            return 1;
        } 
        else
        {
            return 0;
        }
    }

    /**
     * This is the compareTo method for the song genre.
     * 
     * @param otherSong The other song being compared to.
     * @return int Whether it is greater, less than, or equal. 
     */
    public int compareToGenre(Song otherSong) {
        if (this.getGenre().compareTo(otherSong.getGenre()) < 0) {
            return -1;
        }
        if (this.getGenre().compareTo(otherSong.getGenre()) > 0) {
            return 1;
        } 
        else 
        {
            return 0;
        }
    }

    /**
     * This method adds heards to the song.
     * 
     * @param hobby Specific hobby of the student. 
     */
    public void heard(String hobby) {
        switch (hobby) {
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
                throw new IllegalStateException("Not one of the "
                        + "possible options");
        }
    }

    /**
     * This method adds not heard to the song.
     * 
     * @param hobby Specific hobby of the student.
     */
    public void notHeard(String hobby) {
        switch (hobby) {
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
                throw new IllegalStateException("Not one of the "
                        + "possible options");
        }
    }

    /**
     * This method adds likes to the song.
     * 
     * @param hobby Specific hobby of the student.
     */
    public void liked(String hobby) {
        switch (hobby) {
            case "art":
                artLiked++;
                artTotalLiked++;
                break;
            case "reading":
                readingLiked++;
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
                throw new IllegalStateException("Not one of the "
                        + "possible options");
        }
    }

    /**
     * This method adds notLike to the song.
     * 
     * @param hobby Specific hobby of the student.
     */
    public void notLiked(String hobby) {
        switch (hobby) {
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
                throw new IllegalStateException("Not one of the "
                        + "possible options");
        }
    }
}