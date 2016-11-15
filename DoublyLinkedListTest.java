package prj5;
import student.TestCase;
/**
 * Test methods in DoublyLinkedList
 * @author Omar Jastaniah
 * @version 2016.11.15
 */
public class DoublyLinkedListTest extends TestCase {
    /**
     * isEmpty
     * contains
     * add (exceptions when null, or out of bounds too small and too big)
     * getNodeatIndex (exception when index is oob)
     * lastIndexOf(Whole thing)
     * remove at index (entire)
     * remove object //dont worry about this yet
     * toString (empty string)
     * 
     */
    private DoublyLinkedList<String> list;
    /**
     * Instantiates DoublyLinkedList for testing
     */
    public void setUp()
    {
        list = new DoublyLinkedList<>();
    }
    
    /**
     * Tests add method
     */
    public void testAdd()
    {
        assertTrue(list.isEmpty());
        list.add("Hello");
        assertFalse(list.isEmpty());
        
        assertTrue(list.contains("Hello"));
        assertFalse(list.contains("entry"));
        
        //Test when index is out of bounds
        try {
            list.add(-1, "Hello");
        }
        catch (Exception e) {
            assertNotNull(e);
            assertTrue(e instanceof IndexOutOfBoundsException);
        }
        
        try {
            list.add(100, "Hello");
        }
        catch (Exception e) {
            assertNotNull(e);
            assertTrue(e instanceof IndexOutOfBoundsException);
        }
        
        //Test when null object is added
        try {
            list.add(null);
        }
        catch (Exception e) {
            assertNotNull(e);
            assertTrue(e instanceof IllegalArgumentException);
        }
    }
    
    /**
     * Test get() method for exceptions
     */
    public void testGet()
    {
        try {
            list.get(-1);
        }
        catch (Exception e) {
            assertNotNull(e);
            assertTrue(e instanceof IndexOutOfBoundsException);
        }
        
        try {
            list.get(100);
        }
        catch (Exception e) {
            assertNotNull(e);
            assertTrue(e instanceof IndexOutOfBoundsException);
        }
    }
    
    /**
     * Test lastIndexOf
     */
    public void testLastIndexOf()
    {
        list.add("entry");
        list.add("entry2");
        list.add("entry");
        
        assertEquals(2, list.lastIndexOf("entry"));
        assertEquals(1, list.lastIndexOf("entry2"));
        
        assertEquals(-1, list.lastIndexOf("Hello"));
    }
    
    /**
     * Test remove at a specified index
     */
    public void testRemoveIndex()
    {
        list.add("entry");
        list.add("entry2");
        list.add("entry");
        assertTrue(list.remove(2));
        assertEquals("{entry, entry2}", list.toString());
        assertEquals(2, list.size());
        assertTrue(list.remove(0));
        assertEquals("{entry2}", list.toString());
        list.remove(0);
        assertEquals(0, list.size());
        assertEquals("{}", list.toString());
    }
    
    /**
     * Test remove a specific object
     */
    public void testRemove()
    {
        list.add("entry");
        list.add("entry2");
        list.add("entry");
        assertNull(list.remove("Hello"));
    }
}
