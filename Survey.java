package prj5;

import java.util.LinkedList;

/**
 * Survey class
 * @author omarjas5
 * @version 2016.11.13
 */
public class Survey {

    //Keeps track of student info.
    private String studentMajor;
    private String studentHobby;
    private String studentRegion;
    private DoublyLinkedList<Song> list;

    /**
     * Instantiates major, hobby and region.
     *
     * @param major
     * @param hobby
     * @param region
     * @param songList
     */
    public Survey
    (String major, String region, String hobby, DoublyLinkedList<Song> songList) {
        studentMajor = major;
        studentHobby = hobby;
        studentRegion = region;
        list = songList;
    }

    /**
     * This method returns the student's major
     * @return the studentMajor
     */
    public String getMajor() {
        return studentMajor;
    }

    /**
     * This method sets the student's major
     * @param studentMajor the studentMajor to set
     */
    public void setMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    /**
     * This method return the student's hobby
     * @return the studentHobby
     */
    public String getHobby() {
        return studentHobby;
    }

    /**
     * This method sets the student's hobby
     * @param studentHobby the studentHobby to set
     */
    public void setHobby(String studentHobby) {
        this.studentHobby = studentHobby;
    }

    /**
     * This method returns the student's region
     * @return the studentRegion
     */
    public String getRegion() {
        return studentRegion;
    }

    /**
     * This method set's the student's region
     * @param studentRegion the studentRegion to set
     */
    public void setRegion(String studentRegion) {
        this.studentRegion = studentRegion;
    }

    /**
     * This method creates a string version of the student
     * @return string of the student's major, region, and hobby
     */
    public String toString()
    {
        return studentMajor + ", " + studentRegion + ", " + studentHobby;

    }
    /**
     * This method returns the list
     * @return DoublyLinkedList<Song> a list of the songs
     */
    public DoublyLinkedList<Song> getList()
    {
        return list;
    }
}
