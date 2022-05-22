package ds.linked_list;

public class LinkedList {
    public LinkedList() {
    }

    // Represents the number of values that were added to this list
    private int length = 0;

    public int getLength() {
        return length;
    }

    private static class Node {
        String value;
        Node next;

        public Node(String value) {
            this.value = value;
        }
    }

    // Represents the first node of this list
    // Should be initialized when first value is added
    private Node head;
    private Node last;


    // Should add new value to the end of the list and increment length
    public void add(String value) {
        if (head == null) {
            this.head = new Node(value);
        } else {
            head.next = new Node(value);
        }
        length++;
    }


    // Should add new value next to specified afterValue, increment length and return true
    // If afterValue is not present in list - do nothing and return false.
    public boolean addAfter(String value, String afterValue) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(afterValue);

        return false;
    }

    // Should return true if value exists in this list, false - otherwise
    public boolean contains(String value) {
        // TODO implement me
        return false;
    }

    // Should remove first occurrence of the specified value from this list and decrement the length
    // If value existed and was removed - return true, false - otherwise
    public boolean remove(String value) {
        // TODO implement me
        return false;
    }

}
