/**
 * 
 */
package prj5;

import java.awt.Color;

import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;
import java.math.*;

/**
 * @author Purnima Ghosh
 * @version 11.13.2016 This class displays the data for the Music Survey
 */
public class GUIWindow {
    private Window window;
    private Input songs;
    
    private Button prevButton;
    private Button next;
    private Button sortArtist;
    private Button sortTitle;
    private Button sortReleaseYear;
    private Button sortGenre;
    private Button representHobby;
    private Button representMajor;
    private Button representRegion;
    private Button quit;
    
    /**
     * Keeps track of what represent button is pressed
     */
    public String representation;
    /**
     * Keeps track of page number
     */
    public int PAGE = 1;

    /**
     * List of songs
     */
    public SongList songList;
    
    /**
     * Constructor that initializes all of the buttons and some of the static
     * shapes for the window
     */
    public GUIWindow(Input i) {
        songs = i;
        songList = songs.getSongList();
        // Creates a new Window
        window = new Window("balex96 purnima omarjas5");

        // These variables will be made fields for the final project.
        

        // Initializes all of the buttons and adds them to the window
        prevButton = new Button("\u2190 Previous");
        window.addButton(prevButton, WindowSide.NORTH);
        prevButton.onClick(this, "clickedPrevious");
        prevButton.disable();
        
        sortArtist = new Button("Sort By Artist");
        window.addButton(sortArtist, WindowSide.NORTH);
        sortArtist.onClick(this, "clickedSortArtist");
        
        sortTitle = new Button("Sort by Song Title");
        window.addButton(sortTitle, WindowSide.NORTH);
        sortTitle.onClick(this, "clickedSortTitle");

        sortReleaseYear = new Button("Sort by Release Year");
        window.addButton(sortReleaseYear, WindowSide.NORTH);
        sortReleaseYear.onClick(this, "clickedSortYear");

        sortGenre = new Button("Sort by Genre");
        window.addButton(sortGenre, WindowSide.NORTH);
        sortGenre.onClick(this, "clickedSortGenre");

        next = new Button("Next \u2192");
        window.addButton(next, WindowSide.NORTH);
        next.onClick(this, "clickedNext");
        next.disable();
        
        representHobby = new Button("Represent Hobby");
        window.addButton(representHobby, WindowSide.SOUTH);
        representHobby.onClick(this, "clickedHobby");
        
        representMajor = new Button("Represent Major");
        window.addButton(representMajor, WindowSide.SOUTH);
        representMajor.onClick(this, "clickedMajor");

        representRegion = new Button("Represent Region");
        window.addButton(representRegion, WindowSide.SOUTH);
        representRegion.onClick(this, "clickedRegion");

        quit = new Button("Quit");
        window.addButton(quit, WindowSide.SOUTH);
        quit.onClick(this, "clickedQuit");

        sortArtist.disable();
        sortReleaseYear.disable();
        sortTitle.disable();
        sortGenre.disable();
        
        window.setSize(1000, 600);

        // Add Legend
        
    }

    /**
     * Adds the black bars and glyphs to window.
     * @param page is the page number
     * @param str is a string determining what is being represented
     */
    public void addGlyphs(int page, String str, SongList songs) {
        Shape[] towerList = new Shape[songs.size()];

        int r = 1;
        int q = 1;
        int s = 1;
        for (int z = 9 * (page - 1); z < 9 * page; z++) {
            try {
                towerList[z] = new Shape(10, 10, 5, 48, Color.BLACK);
                if (s <= 3) {
                    towerList[z].moveTo(window.getWidth() * s / 5 - 100,
                            window.getHeight() / 3 - 100);
                    window.addShape(towerList[z]);
                    s++;
                } else if (r <= 3) {
                    towerList[z].moveTo(window.getWidth() * r / 5 - 100,
                            window.getHeight() / 2 - 75);
                    window.addShape(towerList[z]);
                    r++;
                } else {
                    towerList[z].moveTo(window.getWidth() * q / 5 - 100,
                            window.getHeight() - 250);
                    window.addShape(towerList[z]);
                    q++;
                }
            } 
            catch (Exception Ex) {
            }
        }
        for (int i = 9 * (page - 1); i < 9 * page; i++) {
            try {
                TextShape title = new TextShape(10, 10,
                        songs.get(i).getTitle());
                TextShape artist = new TextShape(10, 10,
                        "by " + songs.get(i).getArtist());
                title.setBackgroundColor(Color.WHITE);
                title.moveTo(towerList[i].getX() - title.getWidth() / 2,
                        towerList[i].getY() - title.getHeight() * 3);
                artist.setBackgroundColor(Color.WHITE);
                artist.moveTo(towerList[i].getX() - artist.getWidth() / 2,
                        title.getY() + artist.getHeight());
                window.addShape(title);
                window.addShape(artist);
                if (str.equals("Hobby"))
                {
                    hobbyCreator(towerList[i], i, songs);
                }
                else if (str.equals("Major"))
                {
                    majorCreator(towerList[i], i, songs);
                }
                else
                {
                    regionCreator(towerList[i], i, songs);
                }
            } 
            catch (Exception ex) {
            }
        }

    }

    /**
     * This method creates all of the bars that represent 
     * data from the survey with regards to the hobby
     */
    public void hobbyCreator(Shape towerOne, int i, SongList songs) {
        Shape readingHears = new Shape(
                towerOne.getX() + towerOne.getWidth() / 2, towerOne.getY(),
                songs.get(i).getReadingHeardPercent(), 12,
                Color.MAGENTA);
        Shape readingLikes = new Shape(
                towerOne.getX() + towerOne.getWidth() / 2, towerOne.getY(),
                songs.get(i).getReadingLikedPercent(), 12,
                Color.MAGENTA);
        window.addShape(readingHears);
        readingLikes.move(-readingLikes.getWidth(), 0);
        window.addShape(readingLikes);

        Shape sportsHears = new Shape(towerOne.getX() + towerOne.getWidth() / 2,
                towerOne.getY() + 12,
                songs.get(i).getSportsHeardPercent(), 12,
                Color.blue);
        Shape sportsLikes = new Shape(towerOne.getX() + towerOne.getWidth() / 2,
                towerOne.getY() + 12,
                songs.get(i).getSportsLikedPercent(), 12,
                Color.blue);
        window.addShape(sportsHears);
        sportsLikes.move(-sportsLikes.getWidth(), 0);
        window.addShape(sportsLikes);

        Shape artHears = new Shape(towerOne.getX() + towerOne.getWidth() / 2,
                towerOne.getY() + 24,
                songs.get(i).getArtHeardPercent(), 12,
                Color.orange);
        Shape artLikes = new Shape(towerOne.getX() + towerOne.getWidth() / 2,
                towerOne.getY() + 24,
                songs.get(i).getArtLikedPercent(), 12,
                Color.orange);
        window.addShape(artHears);
        artLikes.move(-artLikes.getWidth(), 0);
        window.addShape(artLikes);

        Shape musicHears = new Shape(towerOne.getX() + towerOne.getWidth() / 2,
                towerOne.getY() + 36,
                songs.get(i).getMusicHeardPercent(), 12,
                Color.green);
        Shape musicLikes = new Shape(towerOne.getX() + towerOne.getWidth() / 2,
                towerOne.getY() + 36,
                songs.get(i).getMusicLikedPercent(), 12,
                Color.green);
        window.addShape(musicHears);
        musicLikes.move(-musicLikes.getWidth(), 0);
        window.addShape(musicLikes);

        window.moveToFront(towerOne);

    }
    
    /**
     * This method creates all of the bars that represent
     * data from the survey with regards to the major
     */
    public void majorCreator(Shape towerOne, int i, SongList songs) {
        Shape csHears = new Shape(
                towerOne.getX() + towerOne.getWidth() / 2, towerOne.getY(),
                songs.get(i).getCsHeardPercent(), 12,
                Color.MAGENTA);
        Shape csLikes = new Shape(
                towerOne.getX() + towerOne.getWidth() / 2, towerOne.getY(),
                songs.get(i).getCsLikedPercent(), 12,
                Color.MAGENTA);
        window.addShape(csHears);
        csLikes.move(-csLikes.getWidth(), 0);
        window.addShape(csLikes);

        Shape mathHears = new Shape(towerOne.getX() + towerOne.getWidth() / 2,
                towerOne.getY() + 12,
                songs.get(i).getMathHeardPercent(), 12,
                Color.blue);
        Shape mathLikes = new Shape(towerOne.getX() + towerOne.getWidth() / 2,
                towerOne.getY() + 12,
                songs.get(i).getMathLikedPercent(), 12,
                Color.blue);
        window.addShape(mathHears);
        mathLikes.move(-mathLikes.getWidth(), 0);
        window.addShape(mathLikes);

        Shape engineeringHears = new Shape(towerOne.getX() + towerOne.getWidth() / 2,
                towerOne.getY() + 24,
                songs.get(i).getEngineeringHeardPercent(), 12,
                Color.orange);
        Shape engineeringLikes = new Shape(towerOne.getX() + towerOne.getWidth() / 2,
                towerOne.getY() + 24,
                songs.get(i).getEngineeringLikedPercent(), 12,
                Color.orange);
        window.addShape(engineeringHears);
        engineeringLikes.move(-engineeringLikes.getWidth(), 0);
        window.addShape(engineeringLikes);

        Shape otherHears = new Shape(towerOne.getX() + towerOne.getWidth() / 2,
                towerOne.getY() + 36,
                songs.get(i).getOtherHeardPercent(), 12,
                Color.green);
        Shape otherLikes = new Shape(towerOne.getX() + towerOne.getWidth() / 2,
                towerOne.getY() + 36,
                songs.get(i).getOtherLikedPercent(), 12,
                Color.green);
        window.addShape(otherHears);
        otherLikes.move(-otherLikes.getWidth(), 0);
        window.addShape(otherLikes);
    }
    
    /**
     * This method creates all of the bars that represent
     * data from the survey with regards to the region
     */
    public void regionCreator(Shape towerOne, int i, SongList songs)
    {
        Shape northeastHears = new Shape(
                towerOne.getX() + towerOne.getWidth() / 2, towerOne.getY(),
                songs.get(i).getNortheastHeardPercent(), 12,
                Color.MAGENTA);
        Shape northeastLikes = new Shape(
                towerOne.getX() + towerOne.getWidth() / 2, towerOne.getY(),
                songs.get(i).getNortheastLikedPercent(), 12,
                Color.MAGENTA);
        window.addShape(northeastHears);
        northeastLikes.move(- northeastLikes.getWidth(), 0);
        window.addShape(northeastLikes);

        Shape southeastHears = new Shape(
                towerOne.getX() + towerOne.getWidth() / 2, towerOne.getY() + 12,
                songs.get(i).getSoutheastHeardPercent(), 12,
                Color.blue);
        Shape southeastLikes = new Shape(
                towerOne.getX() + towerOne.getWidth() / 2, towerOne.getY() + 12,
                songs.get(i).getSoutheastLikedPercent(), 12,
                Color.blue);
        window.addShape(southeastHears);
        southeastLikes.move(-southeastLikes.getWidth(), 0);
        window.addShape(southeastLikes);

        Shape unitedstatesHears = new Shape(
                towerOne.getX() + towerOne.getWidth() / 2, towerOne.getY() + 24,
                songs.get(i).getUnitedstatesHeardPercent(), 12,
                Color.orange);
        Shape unitedstatesLikes = new Shape(
                towerOne.getX() + towerOne.getWidth() / 2, towerOne.getY() + 24,
                songs.get(i).getUnitedstatesLikedPercent(), 12,
                Color.orange);
        window.addShape(unitedstatesHears);
        unitedstatesLikes.move(-unitedstatesLikes.getWidth(), 0);
        window.addShape(unitedstatesLikes);

        Shape outsideHears = new Shape(
                towerOne.getX() + towerOne.getWidth() / 2, towerOne.getY() + 36,
                songs.get(i).getOutsideHeardPercent(), 12,
                Color.green);
        Shape outsideLikes = new Shape(
                towerOne.getX() + towerOne.getWidth() / 2, towerOne.getY() + 36,
                songs.get(i).getOutsideLikedPercent(), 12,
                Color.green);
        window.addShape(outsideHears);
        outsideLikes.move(-outsideLikes.getWidth(), 0);
        window.addShape(outsideLikes);
        
    }
    
    
    /**
     * This method creates a legend based on which criteria is being looked at
     */
    public void legendMaker() {
        Shape legend = new Shape(window.getWidth() - 300,
                window.getHeight() - 450, 198, 198, Color.white);
        legend.setForegroundColor(Color.BLACK);
        window.addShape(legend);
        window.moveToFront(legend);
        // Legend Title
        TextShape title = new TextShape(legend.getX(),
                legend.getY(), representation + " Legend");
        title.setBackgroundColor(Color.white);
        title.move(legend.getWidth() / 2 - title.getWidth() / 2, title.getHeight() / 2);
        window.addShape(title);
        window.moveToFront(title);
        // Read
        TextShape reading = new TextShape(legend.getX() + 5,
                legend.getY() + 3*title.getHeight(), "Read", Color.MAGENTA);
        reading.setBackgroundColor(Color.white);
        window.addShape(reading);
        window.moveToFront(reading);
        // Art
        TextShape art = new TextShape(legend.getX() + 5,
                legend.getY() + 4*title.getHeight(), "Art", Color.blue);
        art.setBackgroundColor(Color.white);
        window.addShape(art);
        window.moveToFront(art);
        // Sports
        TextShape sports = new TextShape(legend.getX() + 5,
                legend.getY() + 5*title.getHeight(), "Sports", Color.orange);
        sports.setBackgroundColor(Color.white);
        window.addShape(sports);
        window.moveToFront(sports);
        // Music
        TextShape music = new TextShape(legend.getX() + 5,
                legend.getY() + 6*title.getHeight(), "Music", Color.green);
        music.setBackgroundColor(Color.white);
        window.addShape(music);
        window.moveToFront(music);
        
        if (representation.equals("Region"))
        {
            reading.setText("Northeast");
            art.setText("Southeast");
            sports.setText("United States (other)");
            music.setText("Outside US");
        }
        if (representation.equals("Major"))
        {
            reading.setText("Computer Science");
            art.setText("Math or CMDA");
            sports.setText("Other Engineering");
            music.setText("Other");
        } 
        
        Shape bar = new Shape(title.getX() + title.getWidth() / 2,
                title.getY() + title.getHeight(), 5, 40, Color.black);
        bar.move(0, 3 * bar.getHeight());
        window.addShape(bar);
        window.moveToFront(bar);
        
        // Song Title Text
        TextShape songTitle = new TextShape(bar.getX(),
                bar.getY(), "Song Title", Color.black);
        songTitle.setBackgroundColor(Color.white);
        songTitle.move(-songTitle.getWidth() / 2, -songTitle.getHeight() - 10);
        window.addShape(songTitle);
        window.moveToFront(songTitle);
        
        // Heard Text
        TextShape heard = new TextShape(bar.getX(),
                bar.getY() + bar.getHeight() / 2, "Heard", Color.black);
        heard.setBackgroundColor(Color.white);
        heard.move(-heard.getWidth() - 10, -heard.getHeight()/2);
        window.addShape(heard);
        window.moveToFront(heard);
        
        // Likes Text
        TextShape likes = new TextShape(bar.getX(),
                bar.getY() + bar.getHeight() / 2, "Likes", Color.black);
        likes.setBackgroundColor(Color.white);
        likes.move(likes.getWidth()/2 - 9, -likes.getHeight()/2);
        window.addShape(likes);
        window.moveToFront(likes);
    }

    /**
     * Quit button
     * @param btn is the quit button
     */
    public void clickedQuit(Button btn) {
        System.exit(0);
    }

    /**
     * Next page button
     * @param btn is the next button
     */
    public void clickedNext(Button btn) {
        PAGE++;
        if (PAGE == Math.ceil((int) songList.size() / 9.0) + 1) {
            btn.disable();

        } else {
            window.removeAllShapes();
            legendMaker();
            addGlyphs(PAGE, representation, songList);
            prevButton.enable();
        }
    }
    
    /**
     * Previous page button
     * @param btn is the previous page
     */
    public void clickedPrevious(Button btn) {
        PAGE--;
        if (PAGE < 1) {
            btn.disable();
        } else {
            window.removeAllShapes();
            legendMaker();
            addGlyphs(PAGE, representation, songList);
            next.enable();
        }
    }
    
    /**
     * Recreates window with hobby representation
     * @param btn is the representHobby button
     */
    public void clickedHobby(Button btn) {
        representation = "Hobby";
        window.removeAllShapes();
        legendMaker();
        next.enable();
        sortArtist.enable();
        sortReleaseYear.enable();
        sortTitle.enable();
        sortGenre.enable();
        addGlyphs(PAGE, representation, songList);
    }
    
    /**
     * Recreates window with major representation
     * @param btn is the representMajor button
     */
    public void clickedMajor(Button btn) {
        representation = "Major";
        window.removeAllShapes();
        legendMaker();
        next.enable();
        sortArtist.enable();
        sortReleaseYear.enable();
        sortTitle.enable();
        sortGenre.enable();
        addGlyphs(PAGE, representation, songList);
    }
    
    /**
     * Recreates window with major representation
     * @param btn is the representRegion button
     */
    public void clickedRegion(Button btn) {
        representation = "Region";
        window.removeAllShapes();
        legendMaker();
        next.enable();
        sortArtist.enable();
        sortReleaseYear.enable();
        sortTitle.enable();
        sortGenre.enable();
        addGlyphs(PAGE, representation, songList);
    }
    
    /**
     * Sorts the list by genre
     * @param btn is the sortGenre button
     */
    public void clickedSortGenre(Button btn) {
        PAGE = 1;
        songList.sortGenre();
        window.removeAllShapes();
        legendMaker();
        next.enable();
        prevButton.disable();
        addGlyphs(1, representation, songList);
    }
    
    /**
     * Sorts the list by title
     * @param btn is the sortTitle button
     */
    public void clickedSortTitle(Button btn) {
        PAGE = 1;
        songList.sortTitle();
        window.removeAllShapes();
        legendMaker();
        next.enable();
        prevButton.disable();
        addGlyphs(1, representation, songList);
    }
    
    /**
     * Sorts the list by artist
     * @param btn is the sortArtist button
     */
    public void clickedSortArtist(Button btn) {
        PAGE = 1;
        songList.sortArtist();
        window.removeAllShapes();
        legendMaker();
        next.enable();
        prevButton.disable();
        addGlyphs(1, representation, songList);
    }
    
    /**
     * Sorts the list by release year
     * @param btn is the sortReleaseYear button
     */
    public void clickedSortYear(Button btn) {
        PAGE = 1;
        songList.sortYear();
        window.removeAllShapes();
        legendMaker();
        next.enable();
        prevButton.disable();
        addGlyphs(1, representation, songList);
    }
    
    
    
}
