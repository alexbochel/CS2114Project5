/**
 * 
 */
package prj5;

/**
 * @author Purnima Ghosh
 * @version 11.13.2016
 */
public class DoublyLinkedList<T> 
{

    private class Node<E> 
    {
        private Node<E> next;
        private Node<E> previous;
        private E data;

        public Node(E d) 
        {
            data = d;
        }

        public void setNext(Node<E> n) 
        {
            next = n;
        }

        public void setPrevious(Node<E> n) 
        {
            previous = n;
        }

        public Node<E> next() 
        {
            return next;
        }

        public Node<E> previous() 
        {
            return previous;
        }

        public E getData() 
        {
            return data;
        }
    }
    private int size;
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList() 
    {
        head = new Node<T>(null);
        tail = new Node<T>(null);
        head.setNext(tail);
        tail.setPrevious(head);
        size = 0;
    }

    public boolean isEmpty() 
    {
        return size == 0;
    }

    public int size() 
    {
        return size;
    }

    public boolean contains(T obj) 
    {
        return lastIndexOf(obj) != -1;
    }

    public T get(int index) 
    {
        return getNodeAtIndex(index).getData();
    }

    public void add(T newEntry) 
    {
        add(size(), newEntry);
    }

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

    /*public boolean remove(int index) 
    {
        Node<T> nodeToBeRemoved = getNodeAtIndex(index);
        nodeToBeRemoved.previous().setNext(nodeToBeRemoved.next());
        nodeToBeRemoved.next().setPrevious(nodeToBeRemoved.previous());
        size--;
        return true;
    }

    public boolean remove(T obj) 
    {
        Node<T> current = head.next();
        while (!current.equals(tail)) {
            if (current.getData().equals(obj)) {
                current.previous().setNext(current.next());
                current.next().setPrevious(current.previous());
                size--;
                return true;
            }
            current = current.next();
        }
        return false;
    }*/

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
