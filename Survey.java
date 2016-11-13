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
    public LinkedList<Song> list;

    /**
     * Instantiates major, hobby and region.
     *
     * @param major
     * @param hobby
     * @param region
     */
    public Survey
    (String major, String region, String hobby, LinkedList<Song> temp) {
        studentMajor = major;
        studentHobby = hobby;
        studentRegion = region;
        list = temp;
    }

    /**
     * @return the studentMajor
     */
    public String getMajor() {
        return studentMajor;
    }

    /**
     * @param studentMajor the studentMajor to set
     */
    public void setMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    /**
     * @return the studentHobby
     */
    public String getHobby() {
        return studentHobby;
    }

    /**
     * @param studentHobby the studentHobby to set
     */
    public void setHobby(String studentHobby) {
        this.studentHobby = studentHobby;
    }

    /**
     * @return the studentRegion
     */
    public String getRegion() {
        return studentRegion;
    }

    /**
     * @param studentRegion the studentRegion to set
     */
    public void setRegion(String studentRegion) {
        this.studentRegion = studentRegion;
    }

    /**
     *
     * @return string
     */
    public String toString()
    {
        return studentMajor + ", " + studentRegion + ", " + studentHobby;

    }
}
