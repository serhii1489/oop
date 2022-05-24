package ds.linked_list;

public class LinkedList {
    // Represents the first node of this list
    // Should be initialized when first value is added
    private Node head;

    // Represents the number of values that were added to this list
    private int length = 0;

    public LinkedList() {
    }

    // Should add new value to the end of the list and increment length
    public void add(String value) {
        Node firstNode = new Node(value);
        firstNode.next = head;
        head = firstNode;
    }

    // Should add new value next to specified afterValue, increment length and return true
    // If afterValue is not present in list - do nothing and return false.
    public boolean addAfter(String value, String afterValue) {
        if (head == null) {
            head = new Node(value);

        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(value);
        return false;
    }

    // Should return true if value exists in this list, false - otherwise
    public boolean contains(String value) {
        if (head == null) {
            return false;
        }
        if (head.value == value) {
            return true;
        }
        Node currentNode = head;
        int result = 0;
        while (currentNode.next != null) {
            ++result;
            if (currentNode.next.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    // Should remove first occurrence of the specified value from this list and decrement the length
    // If value existed and was removed - return true, false - otherwise
    public boolean remove(String value) {
        if (head == null) {
            return false;
        }
        if (head.value==value){
            head = head.next;
            return true;
        }
        Node currentNode = head;
        while (currentNode.next != null){
            if (currentNode.next.value == value){
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }
        return true;
    }

    public int getLength() {
        return length;
    }

    private static class Node {
        String value;
        Node next;

        public Node(String value) {
            value = value;
        }
    }
}
