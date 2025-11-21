class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class TUF {
    Node head;

    // Insert new node at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Search for a key
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true; // Found
            }
            temp = temp.next;
        }
        return false; // Not found
    }

    public static void main(String[] args) {
        LinkedListSearch list = new LinkedListSearch();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        int key = 30;
        if (list.search(key)) {
            System.out.println("Element " + key + " found in the list.");
        } else {
            System.out.println("Element " + key + " not found in the list.");
        }
    }
}
