/**
 * The package 
 */
package prj5;

/**
 * @author Purnima Ghosh
 * @version 11.13.2016
 * This class creates a doubly linked list that can be used to create a 
 * list for either songs or people
 * @param <T>   is the generic type
 */
public class DoublyLinkedList<T> 
{
    private class Node<E> 
    {
        private Node<E> next;
        private Node<E> previous;
        private E data;
        /**
         * This constructor sets the data for a node
         * as the data in the paramater
         * @param datum is the data contained in the node
         */
        public Node(E datum) 
        {
            data = datum;
        }
        /**
         * This method sets the next Node to the node taken as the
         * parameter
         * @param n is a node that is being set to the next node
         */
        public void setNext(Node<E> n) 
        {
            next = n;
        }
        /**
         * This method sets the previous Node to the node taken as the
         * parameter
         * @param n is a node that is being set to the previous node
         */
        public void setPrevious(Node<E> n) 
        {
            previous = n;
        }
        /**
         * This method returns the next node in the linked list
         * @return a Node that is the next Node
         */
        public Node<E> next() 
        {
            return next;
        }
        /**
         * This method returns the previous node in the linked list
         * @return a Node previous in the list
         */
        public Node<E> previous() 
        {
            return previous;
        }
        /**
         * This method gets the data from the node
         * @return E the data contained in the node
         */
        public E getData() 
        {
            return data;
        }
    }
    
    private int size;
    private Node<T> head;
    private Node<T> tail;
    /**
     * This constructor initializes a head and tail for the
     * doubly linked list and sets the heads next node as
     * the tail and tail's previous node as the head. It also
     * set size to 0
     */
    public DoublyLinkedList() 
    {
        head = new Node<T>(null);
        tail = new Node<T>(null);
        head.setNext(tail);
        tail.setPrevious(head);
        size = 0;
    }
    /**
     * This method asks if size is equals to zero
     * @return true if the size is equal to 0 and false
     * when size is not 0
     */
    public boolean isEmpty() 
    {
        return size == 0;
    }
    /**
     * The size method returns the size of the list
     * @return size an integer variable that represents
     * the size of the list
     */
    public int size() 
    {
        return size;
    }
    /**
     * This method tells when the given object is in the list
     * @param obj the object is being searched for
     * @return true if the list contains the object
     */
    public boolean contains(T obj) 
    {
        return lastIndexOf(obj) != -1;
    }
    /**
     * This method gets and returns the node at the given index
     * @param index the index number you want to get
     * @return T the data from the node being recieved
     */
    public T get(int index) 
    {
        return getNodeAtIndex(index).getData();
    }
    /**
     * This method adds a new entry to the end of the list
     * @param newEntry is the entry that is being added to the list
     */
    public void add(T newEntry) 
    {
        add(size(), newEntry);
    }
    /**
     * This method adds an object to the list at a specified index
     * @param index the place in the list that an entry is being added to
     * @param obj the item that is being added to the list
     */
    public void add(int index, T obj) 
    {
        if (index < 0 || size < index) {
            throw new IndexOutOfBoundsException();
        }
        if (obj == null) {
            throw new IllegalArgumentException("Cannot add null "
                    + "objects to a list");
        }

        Node<T> nodeAfter;
        if (index == size) {
            nodeAfter = tail;
        } 
        else {
            nodeAfter = getNodeAtIndex(index);
        }

        Node<T> addition = new Node<T>(obj);
        addition.setPrevious(nodeAfter.previous());
        addition.setNext(nodeAfter);
        nodeAfter.previous().setNext(addition);
        nodeAfter.setPrevious(addition);
        size++;

    }
    /**
     * This method returns the node at a given index
     * @param index the place where the node we want is located
     * @return Node<T> the node at the given index
     */
    private Node<T> getNodeAtIndex(int index) 
    {
        if (index < 0 || size() <= index) {
            throw new IndexOutOfBoundsException("No element exists at " 
                    + index);
        }
        Node<T> current = head.next(); // as we have a sentinel node
        for (int i = 0; i < index; i++) {
            current = current.next();
        }
        return current;
    }
    /**
     * This method finds the last appearance of an object
     * @param obj is the object being searched for
     * @return int of either the index of the object or -1 if the object wasn't found
     */
    public int lastIndexOf(T obj) 
    {
        Node<T> current = tail.previous();
        for (int i = size() - 1; i >= 0; i--) {
            if (current.getData().equals(obj)) {
                return i;
            }
            current = current.previous();
        }
        return -1;  //if we do not find it
    }
    /**
     * This method converts the list into a string
     * @return String of the list
     */
    @Override
    public String toString() 
    {
        StringBuilder builder = new StringBuilder("{");
        if (!isEmpty()) {
            Node<T> currNode = head.next();
            while (currNode != tail) {
                T element = currNode.getData();
                builder.append(element.toString());
                if (currNode.next != tail) {
                    builder.append(", ");
                }  
                currNode = currNode.next();
            }
        }

        builder.append("}");
        return builder.toString();
    }
}
