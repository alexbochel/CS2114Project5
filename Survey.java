package prj5;

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
     * Instantiates major, hobby, region and the list of songs. 
     * 
     * @param major Student's major
     * @param hobby Student's hobby
     * @param region Students region
     * @param temp List of songs
     */
    public Survey(String major, String region, String hobby, DoublyLinkedList<Song> temp) {
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
    
    public String toString()
    {
        return studentMajor + ", " + studentRegion + ", " + studentHobby;
        
    }
}