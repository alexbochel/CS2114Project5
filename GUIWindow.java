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

/**
 * @author Purnima Ghosh
 * @version 11.13.2016
 * This class displays the data for the Music Survey
 */
public class GUIWindow 
{
    private Shape towerOne;
    private Window window;

    /**
     * Constructor that initializes all of the buttons and some of the 
     * static shapes for the window
     */
    public GUIWindow()
    {

        //Creates a new Window
        window = new Window("Class Music Data");

        //System.out.println(window.getHeight());
        //System.out.println(window.getWidth());

        //These variables will be made fields for the final project.
        Button sortArtist;
        Button prevButton;
        Button sortTitle;
        Button sortReleaseYear;
        Button sortGenre;
        Button next;
        Button representHobby;
        Button representMajor;
        Button representRegion;
        Button quit;

        //Initializes all of the buttons and adds them to the window
        prevButton = new Button("Previous");
        window.addButton(prevButton, WindowSide.NORTH);

        sortArtist = new Button("Sort By Artist");
        window.addButton(sortArtist, WindowSide.NORTH);

        sortTitle = new Button("Sort by Song Title");
        window.addButton(sortTitle, WindowSide.NORTH);

        sortReleaseYear = new Button("Sort by Release Year");
        window.addButton(sortReleaseYear, WindowSide.NORTH);

        sortGenre = new Button("Sort by Genre");
        window.addButton(sortGenre, WindowSide.NORTH);

        next = new Button("Next");
        window.addButton(next, WindowSide.NORTH);

        representHobby = new Button("Represent Hobby");
        window.addButton(representHobby, WindowSide.SOUTH);

        representMajor = new Button("Represent Major");
        window.addButton(representMajor, WindowSide.SOUTH);

        representRegion = new Button("Represent Region");
        window.addButton(representRegion, WindowSide.SOUTH);

        quit = new Button("Quit");
        window.addButton(quit, WindowSide.SOUTH);

        // Adds all the static bars
        // These local variables will be made fields in the final
        // project
        Shape towerTwo;
        Shape towerThree;
        Shape towerFour;
        Shape towerFive;
        Shape towerSix;
        Shape towerSeven;
        Shape towerEight;
        Shape towerNine;

        towerOne = new Shape(window.getWidth() / 3, 
                window.getHeight() / 3, 5, 50, Color.black);
        window.addShape(towerOne);

        towerTwo = new Shape(window.getWidth() * 2 / 3, 
                window.getHeight() / 3, 5, 50, Color.black);
        window.addShape(towerTwo);

        towerThree = new Shape(window.getWidth() * 3 / 3, 
                window.getHeight() / 3, 5, 50, Color.black);
        window.addShape(towerThree);

        towerFour = new Shape(window.getWidth() / 3, 
                window.getHeight() * 2 / 3, 5, 50, Color.black);
        window.addShape(towerFour);

        towerFive = new Shape(window.getWidth() * 2 / 3, 
                window.getHeight() * 2 / 3, 5, 50, Color.black);
        window.addShape(towerFive);

        towerSix = new Shape(window.getWidth() * 3 / 3, 
                window.getHeight() * 2 / 3, 5, 50, Color.black);
        window.addShape(towerSix);

        towerSeven = new Shape(window.getWidth() / 3, 
                window.getHeight() * 3 / 3, 5, 50, Color.black);
        window.addShape(towerSeven);

        towerEight = new Shape(window.getWidth() * 2 / 3, 
                window.getHeight() * 3 / 3, 5, 50, Color.black);
        window.addShape(towerEight);

        towerNine = new Shape(window.getWidth() * 3 / 3, 
                window.getHeight() * 3 / 3, 5, 50, Color.black);
        window.addShape(towerNine);

        //Add glyphs
        shapeCreator();

        //Add Legend
        legendMaker();
    }
    /**
     * This method creates all of the bars that represent data from the survey
     */
    public void shapeCreator()
    {
        Shape readBar = new Shape(window.getWidth() / 3 - 50,
                window.getHeight() / 3, 100, 12, Color.MAGENTA);
        window.addShape(readBar);
        Shape sportsBar = new Shape(window.getWidth() / 3 - 50, 
                window.getHeight() / 3 + 12, 100, 12, Color.blue);
        window.addShape(sportsBar);
        Shape artBar = new Shape(window.getWidth() / 3 - 50, 
                window.getHeight() / 3 + 24, 100, 12, Color.orange);
        window.addShape(artBar);
        Shape musicBar = new Shape(window.getWidth() / 3 - 50, 
                window.getHeight() / 3 + 36, 100, 12, Color.green);
        window.addShape(musicBar);
        window.moveToFront(towerOne);
    }
    /**
     * This method creates a legend based on which criteria is being looked at
     */
    public void legendMaker()
    {
        Shape legend = new Shape(window.getWidth() + 100, 
                window.getHeight() - 200, 200, 200, Color.black);
        window.addShape(legend);
        Shape legendInterior = new Shape(window.getWidth() + 101, 
                window.getHeight() - 199, 198, 198, Color.white);
        window.addShape(legendInterior);
        window.moveToFront(legendInterior);
        //Legend Title
        TextShape title = new TextShape(window.getWidth() + 175,
                window.getHeight() - 198, "Legend");
        title.setBackgroundColor(Color.white);
        window.addShape(title);
        window.moveToFront(title);
        //Read
        TextShape reading = new TextShape(window.getWidth() + 105,
                window.getHeight() - 178, "Read", Color.MAGENTA);
        reading.setBackgroundColor(Color.white);
        window.addShape(reading);
        window.moveToFront(reading);
        //Art
        TextShape art = new TextShape(window.getWidth() + 105,
                window.getHeight() - 158, "Art", Color.blue);
        art.setBackgroundColor(Color.white);
        window.addShape(art);
        window.moveToFront(art);
        //Sports
        TextShape sports = new TextShape(window.getWidth() + 105,
                window.getHeight() - 138, "Sports", Color.orange);
        sports.setBackgroundColor(Color.white);
        window.addShape(sports);
        window.moveToFront(sports);
        //Music
        TextShape music = new TextShape(window.getWidth() + 105,
                window.getHeight() - 118, "Music", Color.green);
        music.setBackgroundColor(Color.white);
        window.addShape(music);
        window.moveToFront(music);

        Shape bar = new Shape(window.getWidth() + 200,
                window.getHeight() - 70, 5, 50, Color.black);
        window.addShape(bar);
        window.moveToFront(bar);
        //Song Title Text
        TextShape songTitle = new TextShape(window.getWidth() + 165,
                window.getHeight() - 75, "Song Title", Color.black);
        songTitle.setBackgroundColor(Color.white);
        window.addShape(songTitle);
        window.moveToFront(songTitle);
        //Heard Text
        TextShape heard = new TextShape(window.getWidth() + 140,
                window.getHeight() - 50, "Heard", Color.black);
        heard.setBackgroundColor(Color.white);
        window.addShape(heard);
        window.moveToFront(heard);
        //Likes Text
        TextShape likes = new TextShape(window.getWidth() + 220,
                window.getHeight() - 50, "Likes", Color.black);
        likes.setBackgroundColor(Color.white);
        window.addShape(likes);
        window.moveToFront(likes);
    }
}