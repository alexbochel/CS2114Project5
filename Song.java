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

    //Hobby
    private int artTotalHeard;
    private int artTotalLiked;
    private int artHeard;
    private int artLiked;
    private int artHeardPercent;
    private int artLikedPercent;
    private int readingTotalHeard;
    private int readingTotalLiked;
    private int readingHeard;
    private int readingLiked;
    private int readingHeardPercent;
    private int readingLikedPercent;
    private int sportsTotalHeard;
    private int sportsTotalLiked;
    private int sportsHeard;
    private int sportsLiked;
    private int sportsHeardPercent;
    private int sportsLikedPercent;
    private int musicTotalHeard;
    private int musicTotalLiked;
    private int musicHeard;
    private int musicLiked;
    private int musicHeardPercent;
    private int musicLikedPercent;

    //Major
    private int mathTotalHeard;
    private int mathTotalLiked;
    private int mathHeard;
    private int mathLiked;
    private int mathHeardPercent;
    private int mathLikedPercent;
    private int csTotalHeard;
    private int csTotalLiked;
    private int csHeard;
    private int csLiked;
    private int csHeardPercent;
    private int csLikedPercent;
    private int engineeringTotalHeard;
    private int engineeringTotalLiked;
    private int engineeringHeard;
    private int engineeringLiked;
    private int engineeringHeardPercent;
    private int engineeringLikedPercent;
    private int otherTotalHeard;
    private int otherTotalLiked;
    private int otherHeard;
    private int otherLiked;
    private int otherHeardPercent;
    private int otherLikedPercent;

    //Region
    private int northeastTotalHeard;
    private int northeastTotalLiked;
    private int northeastHeard;
    private int northeastLiked;
    private int northeastHeardPercent;
    private int northeastLikedPercent;
    private int southeastTotalHeard;
    private int southeastTotalLiked;
    private int southeastHeard;
    private int southeastLiked;
    private int southeastHeardPercent;
    private int southeastLikedPercent;
    private int unitedstatesTotalHeard;
    private int unitedstatesTotalLiked;
    private int unitedstatesHeard;
    private int unitedstatesLiked;
    private int unitedstatesHeardPercent;
    private int unitedstatesLikedPercent;
    private int outsideTotalHeard;
    private int outsideTotalLiked;
    private int outsideHeard;
    private int outsideLiked;
    private int outsideHeardPercent;
    private int outsideLikedPercent;

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
     * This gets the total liked for art.
     *
     * @return the artTotalLiked
     */
    public int getArtTotalLiked() {
        return artTotalLiked;
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
     * This gets the liked for art.
     *
     * @return the artLiked
     */
    public int getArtLiked() {
        return artLiked;
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
     * This gets the total liked for reading.
     *
     * @return the readingTotalLiked
     */
    public int getReadingTotalLiked() {
        return readingTotalLiked;
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
     * This gets the likes for reading.
     *
     * @return the readingLike
     */
    public int getReadingLiked() {
        return readingLiked;
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
     * This gets the total liked for sports.
     *
     * @return the sportsTotalLiked
     */
    public int getSportsTotalLiked() {
        return sportsTotalLiked;
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
     * This gets the liked for sports.
     *
     * @return the sportsLiked
     */
    public int getSportsLiked() {
        return sportsLiked;
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
     * This gets the total liked for music.
     *
     * @return the musicTotalLiked
     */
    public int getMusicTotalLiked() {
        return musicTotalLiked;
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
     * This gets the liked for music.
     *
     * @return the musicLiked
     */
    public int getMusicLiked() {
        return musicLiked;
    }

    /**
     * This gets the total heard for math
     * @return the mathTotalHeard
     */
    public int getMathTotalHeard() {
        return mathTotalHeard;
    }

    /**
     * This gets the total liked for math
     * @return the mathTotalLiked
     */
    public int getMathTotalLiked() {
        return mathTotalLiked;
    }

    /**
     * This gets the heard for math
     * @return the mathHeard
     */
    public int getMathHeard() {
        return mathHeard;
    }

    /**
     * This gets liked for math
     * @return the mathLiked
     */
    public int getMathLiked() {
        return mathLiked;
    }

    /**
     * This gets total heard for CS
     * @return the csTotalHeard
     */
    public int getCsTotalHeard() {
        return csTotalHeard;
    }

    /**
     * This gets total liked for CS
     * @return the csTotalLiked
     */
    public int getCsTotalLiked() {
        return csTotalLiked;
    }

    /**
     * This gets heard for CS
     * @return the csHeard
     */
    public int getCsHeard() {
        return csHeard;
    }

    /**
     * This gets liked for CS
     * @return the csLiked
     */
    public int getCsLiked() {
        return csLiked;
    }

    /**
     * This gets total heard for Other Engineering
     * @return the engineeringTotalHeard
     */
    public int getEngineeringTotalHeard() {
        return engineeringTotalHeard;
    }

    /**
     * This gets total liked for Other Engineering
     * @return the engineeringTotalLiked
     */
    public int getEngineeringTotalLiked() {
        return engineeringTotalLiked;
    }

    /**
     * This gets heard for Other Engineering
     * @return the engineeringHeard
     */
    public int getEngineeringHeard() {
        return engineeringHeard;
    }

    /**
     * This gets liked for Other Engineering
     * @return the engineeringLiked
     */
    public int getEngineeringLiked() {
        return engineeringLiked;
    }

    /**
     * This gets total heard for Other
     * @return the otherTotalHeard
     */
    public int getOtherTotalHeard() {
        return otherTotalHeard;
    }

    /**
     * This gets total liked for Other Engineering
     * @return the otherTotalLiked
     */
    public int getOtherTotalLiked() {
        return otherTotalLiked;
    }

    /**
     * This gets heard for Other Engineering
     * @return the otherHeard
     */
    public int getOtherHeard() {
        return otherHeard;
    }

    /**
     * This gets liked for Other Engineering
     * @return the otherLiked
     */
    public int getOtherLiked() {
        return otherLiked;
    }

    /**
     * This gets total heard for Northeast
     * @return the northeastTotalHeard
     */
    public int getNortheastTotalHeard() {
        return northeastTotalHeard;
    }

    /**
     * This gets total liked for Northeast
     * @return the northeastTotalLiked
     */
    public int getNortheastTotalLiked() {
        return northeastTotalLiked;
    }

    /**
     * This gets heard for Northeast
     * @return the northeastHeard
     */
    public int getNortheastHeard() {
        return northeastHeard;
    }

    /**
     * This gets liked for Northeast
     * @return the northeastLiked
     */
    public int getNortheastLiked() {
        return northeastLiked;
    }

    /**
     * This gets total heard for Southeast
     * @return the southeastTotalHeard
     */
    public int getSoutheastTotalHeard() {
        return southeastTotalHeard;
    }

    /**
     * This gets total liked for Southeast
     * @return the southeastTotalLiked
     */
    public int getSoutheastTotalLiked() {
        return southeastTotalLiked;
    }

    /**
     * This gets heard for Southeast
     * @return the southeastHeard
     */
    public int getSoutheastHeard() {
        return southeastHeard;
    }

    /**
     * This gets liked for Southeast
     * @return the southeastLiked
     */
    public int getSoutheastLiked() {
        return southeastLiked;
    }

    /**
     * This gets total heard for United States
     * (Other than Northeast and Southeast)
     * @return the unitedstatesTotalHeard
     */
    public int getUnitedstatesTotalHeard() {
        return unitedstatesTotalHeard;
    }

    /**
     * This gets total liked for United States
     * (Other than Northeast and Southeast)
     * @return the unitedstatesTotalLiked
     */
    public int getUnitedstatesTotalLiked() {
        return unitedstatesTotalLiked;
    }

    /**
     * This gets heard for United States
     * (Other than Northeast and Southeast)
     * @return the unitedstatesHeard
     */
    public int getUnitedstatesHeard() {
        return unitedstatesHeard;
    }

    /**
     * This gets liked for United States
     * (Other than Northeast and Southeast)
     * @return the unitedstatesLiked
     */
    public int getUnitedstatesLiked() {
        return unitedstatesLiked;
    }

    /**
     * This gets total heard for outside the United States
     * @return the outsideTotalHeard
     */
    public int getOutsideTotalHeard() {
        return outsideTotalHeard;
    }

    /**
     * This gets total liked for outside the United States
     * @return the outsideTotalLiked
     */
    public int getOutsideTotalLiked() {
        return outsideTotalLiked;
    }

    /**
     * This gets heard for outside the United States
     * @return the outsideHeard
     */
    public int getOutsideHeard() {
        return outsideHeard;
    }

    /**
     * This gets liked for outside the United States
     * @return the outsideLiked
     */
    public int getOutsideLiked() {
        return outsideLiked;
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
     * This is the compareTo method for the song year
     * @param otherSong The song being compared to
     * @return an integer whether it is greater, less than or equal.
     */
    public int compareToYear(Song otherSong) {
        if (this.getYear().compareTo(otherSong.getYear()) < 0) {
            return -1;
        }
        if (this.getYear().compareTo(otherSong.getYear()) > 0) {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    /**
     * This is the compareTo method for the song artist
     * @param otherSong The song being compared to
     * @return an integer whether it is greater, less than or equal.
     */
    public int compareToArtist(Song otherSong) {
        if (this.getArtist().compareTo(otherSong.getArtist()) < 0) {
            return -1;
        }
        if (this.getArtist().compareTo(otherSong.getArtist()) > 0) {
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
    public void heard(String hobby, String major, String region) {
        if (hobby.equals("art")) {
            artHeard++;
            artTotalHeard++;
        }
        else if (hobby.equals("reading")) {
            readingHeard++;
            readingTotalHeard++;
        }
        else if (hobby.equals("sports")) {
            sportsHeard++;
            sportsTotalHeard++;
        }
        else if (hobby.equals("music")) {
            musicHeard++;
            musicTotalHeard++;
        }
        else {
            throw new IllegalStateException(
                    "Not one of the possible options");
        }

        if (major.equals("Math or CMDA")) {
            mathHeard++;
            mathTotalHeard++;
        }
        else if (major.equals("Computer Science")) {
            csHeard++;
            csTotalHeard++;
        }
        else if (major.equals("Other Engineering")) {
            engineeringHeard++;
            engineeringTotalHeard++;
        }
        else if (major.equals("Other")) {
            otherHeard++;
            otherTotalHeard++;
        }
        else {
            throw new IllegalStateException(
                    "Not one of the possible options");
        }

        if (region.equals("Northeast")) {
            northeastHeard++;
            northeastTotalHeard++;
        }
        else if (region.equals("Southeast")) {
            southeastHeard++;
            southeastTotalHeard++;
        }
        else if (region
                .equals("United States (other than Southeast or Northwest)")) {
            unitedstatesHeard++;
            unitedstatesTotalHeard++;
        }
        else if (region.equals("Outside of United States")) {
            outsideHeard++;
            outsideTotalHeard++;
        }
        else {
            throw new IllegalStateException("Not one of the possible options");
        }
    }

    /**
     * This method adds not heard to the song.
     *
     * @param hobby Specific hobby of the student.
     */
    public void notHeard(String hobby, String major, String region) {
        if (hobby.equals("art")) {

            artTotalHeard++;
        }
        else if (hobby.equals("reading")) {
            readingTotalHeard++;
        }
        else if (hobby.equals("sports")) {
            sportsTotalHeard++;
        }
        else if (hobby.equals("music")) {
            musicTotalHeard++;
        }
        else {
            throw new IllegalStateException(
                    "Not one of the possible options");
        }

        if (major.equals("Math or CMDA")) {

            mathTotalHeard++;
        }
        else if (major.equals("Computer Science")) {
            csTotalHeard++;
        }
        else if (major.equals("Other Engineering")) {
            engineeringTotalHeard++;
        }
        else if (major.equals("Other")) {
            otherTotalHeard++;
        }
        else {
            throw new IllegalStateException(
                    "Not one of the possible options");
        }

        if (region.equals("Northeast")) {
            northeastTotalHeard++;
        }
        else if (region.equals("Southeast")) {
            southeastTotalHeard++;
        }
        else if (region
                .equals("United States (other than Southeast or Northwest)")) {
            unitedstatesTotalHeard++;
        }
        else if (region.equals("Outside of United States")) {
            outsideTotalHeard++;
        }
        else {
            throw new IllegalStateException("Not one of the possible options");
        }
    }

    /**
     * This method adds likes to the song.
     *
     * @param hobby Specific hobby of the student.
     */
    public void liked(String hobby, String major, String region) {
        if (hobby.equals("art")) {
            artLiked++;
            artTotalLiked++;
        }
        else if (hobby.equals("reading")) {
            readingLiked++;
            readingTotalLiked++;
        }
        else if (hobby.equals("sports")) {
            sportsLiked++;
            sportsTotalLiked++;
        }
        else if (hobby.equals("music")) {
            musicLiked++;
            musicTotalLiked++;
        }
        else {
            throw new IllegalStateException(
                    "Not one of the " + "possible options");
        }

        if (major.equals("Math or CMDA")) {
            mathLiked++;
            mathTotalLiked++;
        }
        else if (major.equals("Computer Science")) {
            csLiked++;
            csTotalLiked++;
        }
        else if (major.equals("Other Engineering")) {
            engineeringLiked++;
            engineeringTotalLiked++;
        }
        else if (major.equals("Other")) {
            otherLiked++;
            otherTotalLiked++;
        }
        else {
            throw new IllegalStateException(
                    "Not one of the possible options");
        }

        if (region.equals("Northeast")) {
            northeastLiked++;
            northeastTotalLiked++;
        }
        else if (region.equals("Southeast")) {
            southeastLiked++;
            southeastTotalLiked++;
        }
        else if (region
                .equals("United States (other than Southeast or Northwest)")) {
            unitedstatesLiked++;
            unitedstatesTotalLiked++;
        }
        else if (region.equals("Outside of United States")) {
            outsideLiked++;
            outsideTotalLiked++;
        }
        else {
            throw new IllegalStateException("Not one of the possible options");
        }
    }


    /**
     * This method adds notLike to the song.
     *
     * @param hobby Specific hobby of the student.
     */
    public void notLiked(String hobby, String major, String region) {
        if (hobby.equals("art")) {

            artTotalLiked++;
        }
        else if (hobby.equals("reading")) {
            readingTotalLiked++;
        }
        else if (hobby.equals("sports")) {
            sportsTotalLiked++;
        }
        else if (hobby.equals("music")) {
            musicTotalLiked++;
        }
        else {
            throw new IllegalStateException(
                    "Not one of the " + "possible options");
        }

        if (major.equals("Math or CMDA")) {
            mathTotalLiked++;
        }
        else if (major.equals("Computer Science")) {
            csTotalLiked++;
        }
        else if (major.equals("Other Engineering")) {
            engineeringTotalLiked++;
        }
        else if (major.equals("Other")) {
            otherTotalLiked++;
        }
        else {
            throw new IllegalStateException(
                    "Not one of the possible options");
        }

        if (region.equals("Northeast")) {
            northeastTotalLiked++;
        }
        else if (region.equals("Southeast")) {
            southeastTotalLiked++;
        }
        else if (region
                .equals("United States (other than Southeast or Northwest)")) {
            unitedstatesTotalLiked++;
        }
        else if (region.equals("Outside of United States")) {
            outsideTotalLiked++;
        }
        else {
            throw new IllegalStateException("Not one of the possible options");
        }
    }

    /**
     * Gets the percentage of people that enjoy reading that have
     * heard the song
     * @return the readingPercent
     */
    public int getReadingHeardPercent() {
        return readingHeardPercent;
    }

    /**
     * Sets the percentage of people that enjoy reading that have
     * heard the song
     * @param readingPercent the readingPercent to set
     */
    public void setReadingHeardPercent(int readingHeardPercent) {
        this.readingHeardPercent = readingHeardPercent;
    }

    /**
     * Gets the percentage of people that enjoy reading
     * that like the song
     * @return the readingLikedPercent
     */
    public int getReadingLikedPercent() {
        return readingLikedPercent;
    }

    /**
     * Sets the percentage of people that enjoy reading that have
     * heard the song
     * @param readingLikedPercent the readingLikedPercent to set
     */
    public void setReadingLikedPercent(int readingLikedPercent) {
        this.readingLikedPercent = readingLikedPercent;
    }

    /**
     * Gets the percentage of people that enjoy art that have
     * heard the song
     * @return the artHeardPercent
     */
    public int getArtHeardPercent() {
        return artHeardPercent;
    }

    /**
     * Sets the percentage of people that enjoy art that have
     * heard the song
     * @param artHeardPercent the artHeardPercent to set
     */
    public void setArtHeardPercent(int artHeardPercent) {
        this.artHeardPercent = artHeardPercent;
    }

    /**
     * Gets the percentage of people that enjoy art that
     * like the song
     * @return the artLikedPercent
     */
    public int getArtLikedPercent() {
        return artLikedPercent;
    }

    /**
     * Sets the percentage of people that enjoy reading
     * that like the song
     * @param artLikedPercent the artLikedPercent to set
     */
    public void setArtLikedPercent(int artLikedPercent) {
        this.artLikedPercent = artLikedPercent;
    }

    /**
     * Gets the percentage of people that enjoy sports that have
     * heard the song
     * @return the sportsHeardPercent
     */
    public int getSportsHeardPercent() {
        return sportsHeardPercent;
    }

    /**
     * Sets the percentage of people that enjoy sports that have
     * heard the song
     * @param sportsHeardPercent the sportsHeardPercent to set
     */
    public void setSportsHeardPercent(int sportsHeardPercent) {
        this.sportsHeardPercent = sportsHeardPercent;
    }

    /**
     * Sets the percentage of people that enjoy sports that
     * like the song
     * @return the sportsLikedPercent
     */
    public int getSportsLikedPercent() {
        return sportsLikedPercent;
    }

    /**
     * Sets the percentage of people that enjoy sports that like
     * the song
     * @param sportsLikedPercent the sportsLikedPercent to set
     */
    public void setSportsLikedPercent(int sportsLikedPercent) {
        this.sportsLikedPercent = sportsLikedPercent;
    }

    /**
     * Gets the percentage of people that enjoy music that
     * have heard the song
     * @return the musicHeardPercent
     */
    public int getMusicHeardPercent() {
        return musicHeardPercent;
    }

    /**
     * Sets the percentage of people that enjoy sports that have
     * heard the song
     * @param musicHeardPercent the musicHeardPercent to set
     */
    public void setMusicHeardPercent(int musicHeardPercent) {
        this.musicHeardPercent = musicHeardPercent;
    }

    /**
     * Gets the percentage of people that enjoy sports that
     * like the song
     * @return the musicLikedPercent
     */
    public int getMusicLikedPercent() {
        return musicLikedPercent;
    }

    /**
     * Sets the percentage of people that enjoy sports that
     * like the song
     * @param musicLikedPercent the musicLikedPercent to set
     */
    public void setMusicLikedPercent(int musicLikedPercent) {
        this.musicLikedPercent = musicLikedPercent;
    }

    /**
     * Gets the percentage of people that study Math or CMDA
     * that have heard the song
     * @return the mathHeardPercent
     */
    public int getMathHeardPercent() {
        return mathHeardPercent;
    }

    /**
     * Sets the percentage of people that study Math or CMDA
     * that have heard the song
     * @param mathHeardPercent the mathHeardPercent to set
     */
    public void setMathHeardPercent(int mathHeardPercent) {
        this.mathHeardPercent = mathHeardPercent;
    }

    /**
     * Gets the percentage of people that study Math or CMDA
     * that like the song
     * @return the mathLikedPercent
     */
    public int getMathLikedPercent() {
        return mathLikedPercent;
    }

    /**
     * Sets the percentage of people that study Math or CMDA
     * that like the song
     * @param mathLikedPercent the mathLikedPercent to set
     */
    public void setMathLikedPercent(int mathLikedPercent) {
        this.mathLikedPercent = mathLikedPercent;
    }

    /**
     * Gets the percentage of people that study Computer Science
     * that have heard the song
     * @return the csHeardPercent
     */
    public int getCsHeardPercent() {
        return csHeardPercent;
    }

    /**
     * Sets the percentage of people that study Computer Science
     * that have heard the song
     * @param csHeardPercent the csHeardPercent to set
     */
    public void setCsHeardPercent(int csHeardPercent) {
        this.csHeardPercent = csHeardPercent;
    }

    /**
     * Gets the percentage of people that study Computer Science
     * that like the song
     * @return the csLikedPercent
     */
    public int getCsLikedPercent() {
        return csLikedPercent;
    }

    /**
     * Sets the percentage of people that study Computer Science
     * that like the song
     * @param csLikedPercent the csLikedPercent to set
     */
    public void setCsLikedPercent(int csLikedPercent) {
        this.csLikedPercent = csLikedPercent;
    }

    /**
     * Gets the percentage of people that study Other Engineering
     * that have heard the song
     * @return the engineeringHeardPercent
     */
    public int getEngineeringHeardPercent() {
        return engineeringHeardPercent;
    }

    /**
     * Sets the percentage of people that study Other Engineering
     * that have heard the song
     * @param engineeringHeardPercent the engineeringHeardPercent to set
     */
    public void setEngineeringHeardPercent(int engineeringHeardPercent) {
        this.engineeringHeardPercent = engineeringHeardPercent;
    }

    /**
     * Gets the percentage of people that study Other Engineering
     * that like the song
     * @return the engineeringLikedPercent
     */
    public int getEngineeringLikedPercent() {
        return engineeringLikedPercent;
    }

    /**
     * Sets the percentage of people that study Other Engineering
     * that like the song
     * @param engineeringLikedPercent the engineeringLikedPercent to set
     */
    public void setEngineeringLikedPercent(int engineeringLikedPercent) {
        this.engineeringLikedPercent = engineeringLikedPercent;
    }

    /**
     * Gets the percentage of people that study Other
     * that have heard the song
     * @return the otherHeardPercent
     */
    public int getOtherHeardPercent() {
        return otherHeardPercent;
    }

    /**
     * Sets the percentage of people that study Other
     * that have heard the song
     * @param otherHeardPercent the otherHeardPercent to set
     */
    public void setOtherHeardPercent(int otherHeardPercent) {
        this.otherHeardPercent = otherHeardPercent;
    }

    /**
     * Gets the percentage of people that study Other
     * that like the song
     * @return the otherLikedPercent
     */
    public int getOtherLikedPercent() {
        return otherLikedPercent;
    }

    /**
     * Sets the percentage of people that study Other
     * that like the song
     * @param otherLikedPercent the otherLikedPercent to set
     */
    public void setOtherLikedPercent(int otherLikedPercent) {
        this.otherLikedPercent = otherLikedPercent;
    }

    /**
     * Gets the percentage of people that live in the Northeast
     * that have heard the song
     * @return the northeastHeardPercent
     */
    public int getNortheastHeardPercent() {
        return northeastHeardPercent;
    }

    /**
     * Sets the percentage of people that live in the Northeast
     * that have heard the song
     * @param northeastHeardPercent the northeastHeardPercent to set
     */
    public void setNortheastHeardPercent(int northeastHeardPercent) {
        this.northeastHeardPercent = northeastHeardPercent;
    }

    /**
     * Gets the percentage of people that live in the Northeast
     * that like the song
     * @return the northeastLikedPercent
     */
    public int getNortheastLikedPercent() {
        return northeastLikedPercent;
    }

    /**
     * Sets the percentage of people that live in the Northeast
     * that like the song
     * @param northeastLikedPercent the northeastLikedPercent to set
     */
    public void setNortheastLikedPercent(int northeastLikedPercent) {
        this.northeastLikedPercent = northeastLikedPercent;
    }

    /**
     * Gets the percentage of people that live in the Northeast
     * that have heard the song
     * @return the southeastHeardPercent
     */
    public int getSoutheastHeardPercent() {
        return southeastHeardPercent;
    }

    /**
     * Sets the percentage of people that live in the Southeast
     * that have heard the song
     * @param southeastHeardPercent the southeastHeardPercent to set
     */
    public void setSoutheastHeardPercent(int southeastHeardPercent) {
        this.southeastHeardPercent = southeastHeardPercent;
    }

    /**
     * Gets the percentage of people that live in the Southeast
     * that like the song
     * @return the southeastLikedPercent
     */
    public int getSoutheastLikedPercent() {
        return southeastLikedPercent;
    }

    /**
     * Sets the percentage of people that live in the Southeast
     * that like the song
     * @param southeastLikedPercent the southeastLikedPercent to set
     */
    public void setSoutheastLikedPercent(int southeastLikedPercent) {
        this.southeastLikedPercent = southeastLikedPercent;
    }

    /**
     * Gets the percentage of people that live in the
     * United States (Other than NE and SE) that
     * have heard the song.
     * @return the unitedstatesHeardPercent
     */
    public int getUnitedstatesHeardPercent() {
        return unitedstatesHeardPercent;
    }

    /**
     * Sets the percentage of people that live in the
     * United States (Other than NE and SE) that
     * have heard the song.
     * @param unitedstatesHeardPercent the unitedstatesHeardPercent to set
     */
    public void setUnitedstatesHeardPercent(int unitedstatesHeardPercent) {
        this.unitedstatesHeardPercent = unitedstatesHeardPercent;
    }

    /**
     * Gets the percentage of people that live in the
     * United States (Other than NE and SE) that
     * like the song.
     * @return the unitedstatesLikedPercent
     */
    public int getUnitedstatesLikedPercent() {
        return unitedstatesLikedPercent;
    }

    /**
     * Sets the percentage of people that live in the
     * United States (Other than NE and SE) that
     * like the song.
     * @param unitedstatesLikedPercent the unitedstatesLikedPercent to set
     */
    public void setUnitedstatesLikedPercent(int unitedstatesLikedPercent) {
        this.unitedstatesLikedPercent = unitedstatesLikedPercent;
    }

    /**
     * Gets the percentage of people that live outside the United States
     * that have heard the song.
     * @return the outsideHeardPercent
     */
    public int getOutsideHeardPercent() {
        return outsideHeardPercent;
    }

    /**
     * Sets the percentage of people that live outside the United States
     * that have heard the song.
     * @param outsideHeardPercent the outsideHeardPercent to set
     */
    public void setOutsideHeardPercent(int outsideHeardPercent) {
        this.outsideHeardPercent = outsideHeardPercent;
    }

    /**
     * Gets the percentage of people that live outside the United States
     * that like the song.
     * @return the outsideLikedPercent
     */
    public int getOutsideLikedPercent() {
        return outsideLikedPercent;
    }

    /**
     * Sets the percentage of people that live outside the United States
     * that like the song.
     * @param outsideLikedPercent the outsideLikedPercent to set
     */
    public void setOutsideLikedPercent(int outsideLikedPercent) {
        this.outsideLikedPercent = outsideLikedPercent;
    }

}
