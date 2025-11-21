// public class Linnlist {

//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }

//     }

//     public static Node head;
//     public static Node tail;

//     public void addFirst(int data) {
//         // step1 = create new node
//         Node newNode = new Node(data);
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
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         if (head == null) {
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp = head;
//         while (temp != null) {
//             System.out.println(temp.data + " ->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         Linkedlist ll = new Linkedlist();
//         ll.print();
//         ll.addFirst(2);
//         ll.print();
//         ll.addFirst(1);
//         ll.print();
//         ll.addLast(3);
//         ll.print();
//         ll.addLast(4);
//         ll.print();

//     }
// }

// // class Node {
// // int data;
// // Node next;

// // Node(int data) {
// // this.data = data;
// // }
// // }

// public class Linnlist {
//     static boolean hasCycle(Node head) {
//         Node slow = head, fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast)
//                 return true;
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = head.next; // create cycle

//         System.out.println(hasCycle(head)); // Output: true
//     }
// }

// // class Node {
// // int data;
// // Node next;

// // Node(int data) {
// // this.data = data;
// // }
// // }

// // public class Linnlist {
// // static Node findMiddle(Node head) {
// // Node slow = head, fast = head;
// // while (fast != null && fast.next != null) {
// // slow = slow.next;
// // fast = fast.next.next;
// // }
// // return slow;
// // }

// // public static void main(String[] args) {
// // Node head = new Node(1);
// // head.next = new Node(2);
// // head.next.next = new Node(3);
// // head.next.next.next = new Node(4);
// // head.next.next.next.next = new Node(5);

// // Node mid = findMiddle(head);
// // System.out.println("Middle element: " + mid.data);
// // }
// // }

// // class Node {
// // int data;
// // Node prev, next;

// // Node(int d) {
// // data = d;
// // }
// // }

// // public class Linnlist {
// // Node head;

// // void insert(int d) {
// // Node n = new Node(d);
// // if (head == null) {
// // head = n;
// // return;
// // }
// // Node t = head;
// // while (t.next != null)
// // t = t.next;
// // t.next = n;
// // n.prev = t;
// // }

// // void delete(int d) {
// // Node t = head;
// // while (t != null && t.data != d)
// // t = t.next;
// // if (t == null)
// // return;
// // if (t.prev != null)
// // t.prev.next = t.next;
// // else
// // head = t.next;
// // if (t.next != null)
// // t.next.prev = t.prev;
// // }

// // void show() {
// // for (Node t = head; t != null; t = t.next)
// // System.out.print(t.data + " ");
// // System.out.println();
// // }

// // public static void main(String[] a) {
// // Linnlist l = new Linnlist();
// // l.insert(10);
// // l.insert(20);
// // l.insert(30);
// // l.show();
// // l.delete(20);
// // l.show();
// // }
// // }

// // class CircularLinkedList {
// // Node last;

// // class Node {
// // int data;
// // Node next;

// // Node(int data) {
// // this.data = data;
// // }
// // }

// // // Insert at end
// // void insert(int data) {
// // Node newNode = new Node(data);
// // if (last == null) {
// // last = newNode;
// // last.next = last;
// // } else {
// // newNode.next = last.next;
// // last.next = newNode;
// // last = newNode;
// // }
// // }

// // // Delete a node
// // void delete(int key) {
// // if (last == null)
// // return;
// // Node curr = last, prev = null;
// // do {
// // prev = curr;
// // curr = curr.next;
// // if (curr.data == key) {
// // prev.next = curr.next;
// // if (curr == last && curr.next == last)
// // last = null;
// // else if (curr == last)
// // last = prev;
// // return;
// // }
// // } while (curr != last);
// // }

// // // Traverse list
// // void display() {
// // if (last == null)
// // return;
// // Node temp = last.next;
// // do {
// // System.out.print(temp.data + " ");
// // temp = temp.next;
// // } while (temp != last.next);
// // System.out.println();
// // }

// // public static void main(String[] args) {
// // CircularLinkedList cll = new CircularLinkedList();
// // cll.insert(10);
// // cll.insert(20);
// // cll.insert(30);
// // cll.display();
// // cll.delete(20);
// // cll.display();
// // }
// // }

// // class MergeSortedLists {
// // static class Node {
// // int data;
// // Node next;

// // Node(int data) {
// // this.data = data;
// // }
// // }

// // static Node merge(Node l1, Node l2) {
// // Node dummy = new Node(0), tail = dummy;
// // while (l1 != null && l2 != null) {
// // if (l1.data < l2.data) {
// // tail.next = l1;
// // l1 = l1.next;
// // } else {
// // tail.next = l2;
// // l2 = l2.next;
// // }
// // tail = tail.next;
// // }
// // tail.next = (l1 != null) ? l1 : l2;
// // return dummy.next;
// // }

// // static void print(Node head) {
// // for (; head != null; head = head.next)
// // System.out.print(head.data + " ");
// // System.out.println();
// // }

// // public static void main(String[] args) {
// // Node a = new Node(1);
// // a.next = new Node(3);
// // a.next.next = new Node(5);
// // Node b = new Node(2);
// // b.next = new Node(4);
// // b.next.next = new Node(6);
// // Node merged = merge(a, b);
// // print(merged);
// // }
// // }

// // class RemoveNthNode {
// // static class Node {
// // int data;
// // Node next;

// // Node(int d) {
// // data = d;
// // }
// // }

// // // Remove Nth node from start
// // static Node removeFromStart(Node head, int n) {
// // if (head == null)
// // return null;
// // if (n == 1)
// // return head.next;
// // Node temp = head;
// // for (int i = 1; temp != null && i < n - 1; i++)
// // temp = temp.next;
// // if (temp == null || temp.next == null)
// // return head;
// // temp.next = temp.next.next;
// // return head;
// // }

// // // Remove Nth node from end
// // static Node removeFromEnd(Node head, int n) {
// // Node dummy = new Node(0);
// // dummy.next = head;
// // Node first = dummy, second = dummy;
// // for (int i = 0; i <= n; i++)
// // first = first.next;
// // while (first != null) {
// // first = first.next;
// // second = second.next;
// // }
// // second.next = second.next.next;
// // return dummy.next;
// // }

// // static void print(Node head) {
// // for (; head != null; head = head.next)
// // System.out.print(head.data + " ");
// // System.out.println();
// // }

// // public static void main(String[] args) {
// // Node head = new Node(1);
// // head.next = new Node(2);
// // head.next.next = new Node(3);
// // head.next.next.next = new Node(4);
// // head.next.next.next.next = new Node(5);

// // head = removeFromStart(head, 2); // remove 2nd from start → removes 2
// // print(head);

// // head = removeFromEnd(head, 2); // remove 2nd from end → removes 4
// // print(head);
// // }
// // }

// class StackList {
// Node top;

// class Node {
// int data;
// Node next;

// Node(int d) {
// data = d;
// }
// }

// void push(int x) {
// Node n = new Node(x);
// n.next = top;
// top = n;
// }

// int pop() {
// if (top == null)
// throw new RuntimeException("Stack is empty");
// int val = top.data;
// top = top.next;
// return val;
// }

// int peek() {
// if (top == null)
// throw new RuntimeException("Stack is empty");
// return top.data;
// }

// boolean isEmpty() {
// return top == null;
// }

// public static void main(String[] args) {
// StackList s = new StackList();
// s.push(10);
// s.push(20);
// s.push(30);
// System.out.println(s.pop()); // 30
// System.out.println(s.peek()); // 20
// System.out.println(s.isEmpty()); // false
// }
// }

// public class Linnlist {

// class Somu {
// int data;
// Somu next;

// Somu(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public Somu head = null;

// void addFirst(int data) {
// Somu newnode = new Somu(data);
// if (head == null) {
// head = newnode;
// }
// newnode.next = head;
// head = newnode;
// }

// public static void main(String args[]) {
// Linnlist obj = new Linnlist();
// Linnlist obj2 = new Linnlist();
// obj.addFirst(4);
// obj.addFirst(12);
// System.out.println(obj.head.data);
// obj2.addFirst(10);
// obj2.addFirst(13);

// System.out.println(obj2.head.data);

// }
// }

public class Linnlist {

    class somu {
        int data;
        somu next;

        somu(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public somu head;
    public somu tail;

    public void addFirst(int data) {
        // step1 = create new node
        somu newNode = new somu(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 - newsomu next = head
        newNode.next = head; // link

        // step2 -head = newNode
        head = newNode;

    }

    // Add last

    public void addLast(int data) {
        somu newNode = new somu(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void print() {
        somu temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        Linnlist obj = new Linnlist();
        obj.print();
        obj.addFirst(1);
        obj.print();
        obj.addFirst(2);
        obj.print();
        obj.addLast(3);
        obj.print();
        obj.addLast(4);
        obj.print();

    }
}