// import java.util.*;

// public class Linkedlist {

//     class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }

//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         // step1 = create new node
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         // step2 - newNode next = head
//         newNode.next = head; // link

//         // step3 - head = newNode
//         head = newNode;

//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         if (head == null) {
//             System.out.print("LL is empty");
//             return;
//         }
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public void add(int idx, int data) {
//         if (idx == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i = 0;

//         while (i < idx - 1) {
//             temp = temp.next;
//             i++;
//         }

//         // i = idx-1; temp -> prev
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     public int removeFirst() {
//         if (size == 0) {
//             System.out.println("LinkedList is empty");
//             return Integer.MIN_VALUE;
//         } else if (size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }

//     public int removeLast() {
//         if (size == 0) {
//             System.out.println("LinkedList is empty");
//             return Integer.MIN_VALUE;

//         } else if (size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         // prev : i = size-2
//         Node prev = head;
//         for (int i = 0; i < size - 2; i++) {
//             prev = prev.next;
//         }

//         int val = prev.next.data; // tail.data
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;
//     }

//     public int itrSearch(int key) {
//         Node temp = head;
//         int i = 0;

//         while (temp != null) {
//             if (temp.data == key) { // key found
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         // key not found
//         return -1;
//     }

//     public static void main(String[] args) {
//         Linkedlist somu = new Linkedlist();
//         somu.addFirst(2);
//         somu.addFirst(1);
//         somu.addLast(4);
//         somu.addLast(5);
//         somu.add(2, 3);
//         somu.print();// 1->2->3->4->5
//         // System.out.println(somu.size);
//         // somu.removeFirst();
//         // somu.print();
//         // somu.removeLast();
//         // somu.print();
//         // System.out.println(somu.size);

//         System.out.println(somu.itrSearch(3));
//         System.out.println(somu.itrSearch(10));
//     }
// }

// dusra savaal

public class Linkedlist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // step1 = create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 - newNode next = head
        newNode.next = head; // link

        // step3 - head = newNode
        head = newNode;

    }

    public void print() {
        if (head == null) {
            System.out.print("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;
            return;
        }
        // sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // merge sort on linkedlist

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                // temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                // temp = temp.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getMid(head);
        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        Linkedlist somu = new Linkedlist();
        // somu.addFirst(6);
        // somu.addFirst(5);
        // somu.addFirst(4);
        // somu.addFirst(3);
        // somu.addFirst(2);
        // somu.addFirst(1);
        // somu.print(); // 4->3->2

        // somu.deleteNthfromEnd(4);
        // somu.print();
        somu.addFirst(1);
        somu.addFirst(2);
        somu.addFirst(3);
        somu.addFirst(4);
        somu.addFirst(5);
        somu.addFirst(6);
        // 6->5->4->3->2->1
        somu.print();
        somu.head = somu.mergeSort(somu.head);
        somu.print();
    }
}

// floyd's cycle finding algorithms(slow fast)
// Detect a Loop/Cycle in a LinkedList
// public class Linkedlist {

// static class Node {
// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// this.next = null;
// }f
// }

// public static Node head;

// public static boolean isCycle() {
// Node slow = head;
// Node fast = head;

// while (fast != null && fast.next != null) {
// slow = slow.next; // +1
// fast = fast.next.next; // +2
// if (slow == fast) {
// return true;// cycle exists

// }
// }
// return false; // cycle doesn't exist
// }

// public static void main(String args[]) {
// head = new Node(1);
// head.next = new Node(2);
// head.next.next = new Node(3);
// head.next.next.next = head;
// // 1->2->3->1
// System.out.println(isCycle());
// }

// }
