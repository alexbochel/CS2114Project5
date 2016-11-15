package prj5;

/**
 * @author Purnima Ghosh, Alex Bochel, Omar
 * @version 11.13.2016
 * 
 * @param <T> This is the generic type.
 */
public class DoublyLinkedList<T> 
{
    
    /**
     * This class represents the nodes for the DoublyLinkedList.
     * 
     * @author Alexander Bochel, Omar, Purnima Ghosh
     *
     * @param <E> This is the generic type for this class. 
     */
    private class Node<E> 
    {
        private Node<E> next;
        private Node<E> previous;
        private E data;

        /**
         * This method stores data in nodes. 
         * 
         * @param d The data. 
         */
        public Node(E d) 
        {
            data = d;
        }

        /**
         * This method sets the next node. 
         * 
         * @param n The next node. 
         */
        public void setNext(Node<E> n) 
        {
            next = n;
        }

        /**
         * This method sets the previous node. 
         * 
         * @param n The previous node. 
         */
        public void setPrevious(Node<E> n) 
        {
            previous = n;
        }

        /**
         * This method returns the next node. 
         * 
         * @return Node<E> The next node. 
         */
        public Node<E> next() 
        {
            return next;
        }

        /**
         * This method returns the previous node. 
         * 
         * @return Node<E> The previous node. 
         */
        public Node<E> previous() 
        {
            return previous;
        }

        /**
         * This method returns the data of the node. 
         * 
         * @return data of the node. 
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
     * This is the constructor for the DoublyLinkedList. 
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
     * This method returns whether or not the list is empty. 
     * 
     * @return boolean Whether the size is equals to 0. 
     */
    public boolean isEmpty() 
    {
        return size == 0;
    }

    /**
     * This method returns the size of the list. 
     * 
     * @return int The list size. 
     */
    public int size() 
    {
        return size;
    }

    /**
     * This method checks to see if the list contains a specific entry. 
     * 
     * @param obj The object being checked for. 
     * @return int The index of the object. 
     */
    public boolean contains(T obj) 
    {
        return lastIndexOf(obj) != -1;
    }

    /**
     * This method gets the data at a specific index. 
     * 
     * @param index The index of the wanted object. 
     * @return Data from an index. 
     */
    public T get(int index) 
    {
        return getNodeAtIndex(index).getData();
    }

    /**
     * This method adds an entry to the list. 
     * 
     * @param newEntry The entry being added. 
     */
    public void add(T newEntry) 
    {
        add(size(), newEntry);
    }

    /**
     * This method adds an object to a certain index. 
     * 
     * @param index To be added at. 
     * @param obj To be added. 
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
     * This method gets the node at the specified index. 
     * 
     * @param index
     * @return current The node at te index specified.  
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
     * This method finds the last index of a certain object. 
     * 
     * @param obj Being looked for. 
     * @return int Where the object was found. 
     */
    public int lastIndexOf(T obj) 
    {
        /*
         * We should go from the end of the list as then we an stop once we find
         * the first one
         */
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
     * This method removes an entry at a specific index. 
     * 
     * @param index To be removed at. 
     * @return boolean Whether or not remove was succesful.
     */
    public boolean remove(int index) 
    {
        Node<T> nodeToBeRemoved = getNodeAtIndex(index);
        nodeToBeRemoved.previous().setNext(nodeToBeRemoved.next());
        nodeToBeRemoved.next().setPrevious(nodeToBeRemoved.previous());
        size--;
        return true;
    }
    
    /**
     * This method removes a specific object from the list. 
     * 
     * @param obj The object being removed. 
     * @return The object being removed. 
     */
    public T remove(T obj) 
    {
        Node<T> current = head.next();
        while (!current.equals(tail)) {
            if (current.getData().equals(obj)) {
                current.previous().setNext(current.next());
                current.next().setPrevious(current.previous());
                size--;
                return current.getData();
            }
            current = current.next();
        }
        return null; 
    }

    /**
     * This method makes a string out of the data. 
     * @return String of data.
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