// public class DoubleLL {
//     public class Node {
//         int data;
//         Node next;
//         Node prev;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }

//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     // add
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head;
//         head.prev = newNode;
//         head = newNode;
//     }

//     // print
//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "<->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // remove
//     public int removeFirst() {
//         if (head == null) {
//             System.out.println("DLL id empty");
//             return Integer.MIN_VALUE;
//         }
//         if (size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size--;
//             return val;
//         }
//         int val = head.data;
//         head = head.next;
//         head.prev = null;
//         size--;
//         return val;
//     }

//     public static void main(String args[]) {
//         DoubleLL dll = new DoubleLL();
//         dll.addFirst(3);
//         dll.addFirst(2);
//         dll.addFirst(1);

//         dll.print();
//         System.out.println(dll.size);

//         dll.removeFirst();
//         dll.print();
//         System.out.println(dll.size);
//     }

// }

public class DoubleLL {

    // 🔹 Node structure
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head, tail;

    // 🔸 1. INSERTION AT BEGINNING
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) { // empty list
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // 🔸 2. INSERTION AT END
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) { // empty list
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
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
        head.prev = null;
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
        tail = tail.prev;
        tail.next = null;
    }

    // 🔸 5. TRAVERSAL (Forward)
    public void printForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 🔸 6. TRAVERSAL (Backward)
    public void printBackward() {
        Node temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // 🔸 MAIN FUNCTION
    public static void main(String[] args) {
        DoubleLL somu = new DoubleLL();

        // Insertion
        somu.insertAtEnd(10);
        somu.insertAtEnd(20);
        somu.insertAtBeginning(5);
        somu.insertAtEnd(30);

        somu.printForward(); // Forward: 5 ⇄ 10 ⇄ 20 ⇄ 30 ⇄ null
        somu.printBackward(); // Backward: 30 ⇄ 20 ⇄ 10 ⇄ 5 ⇄ null

        // Deletion
        somu.deleteFromBeginning();
        somu.deleteFromEnd();

        somu.printForward(); // Forward: 10 ⇄ 20 ⇄ null
    }
}
