
public class CircularLL {

    // 🔹 Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // 🔸 1. INSERTION AT END
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) { // empty list
            head = tail = newNode;
            newNode.next = head; // circular link
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head; // maintain circular connection
    }

    // 🔸 2. INSERTION AT BEGINNING
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head; // circular link maintained
    }

    // 🔸 3. DELETION AT BEGINNING
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head == tail) { // only one node
            head = tail = null;
            return;
        }

        head = head.next;
        tail.next = head; // maintain circular link
    }

    // 🔸 4. DELETION AT END
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head == tail) { // single node
            head = tail = null;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
    }

    // 🔸 5. TRAVERSAL (Print)
    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    // 🔸 MAIN FUNCTION
    public static void main(String[] args) {
        CircularLL somu = new CircularLL();

        // Insertion
        somu.insertAtEnd(10);
        somu.insertAtEnd(20);
        somu.insertAtEnd(30);
        somu.insertAtBeginning(5);

        somu.printList(); // Circular List: 5 → 10 → 20 → 30 → (back to head)

        // Deletion
        somu.deleteFromBeginning();
        somu.deleteFromEnd();

        somu.printList(); // Circular List: 10 → 20 → (back to head)
    }
}
