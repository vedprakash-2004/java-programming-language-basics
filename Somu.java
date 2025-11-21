// ********* 6. Reverse  a singly Linked list ********
// public class Somu {

//     class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;

//         }
//     }

//     public Node head;
//     public Node tail;

//     public void addFirst(int data) {
//         // step1 = create new node
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         // step2 - newsomu next = head
//         newNode.next = head; // link

//         // step2 -head = newNode
//         head = newNode;

//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public void reverse() {
//         Node prev = null;
//         Node curr = tail = head;
//         Node next;

//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         head = prev;
//     }

//     public static void main(String args[]) {
//         Somu somu = new Somu();
//         somu.addFirst(3);
//         somu.addFirst(5);
//         somu.addFirst(6);
//         somu.addFirst(8);
//         somu.addFirst(9);
//         somu.print();
//         somu.reverse();
//         somu.print();

//     }

// }

// *************** 7. Detect in a Linked list *************

// public class Somu {

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;

//         }
//     }

//     public Node head;
//     public Node tail;

//     public boolean isCycle() {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast) {
//                 return true;
//             }
//         }
//         return false; // cylce done

//     }

//     public static void main(String[] args) {
//         Somu somu = new Somu();
//         somu.head = new Node(1);
//         somu.head.next = new Node(2);
//         somu.head.next.next = new Node(3);
//         somu.head.next.next.next = somu.head;
//         // 1->2->3->1
//         System.out.println(somu.isCycle());
//     }

// }

// *********** 8. find middle element of a linked list ************

// public class Somu {

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public Node head;

//     // Add element at end
//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }

//     // 🧭 Function to find middle element
//     public Node findMiddle() {
//         if (head == null) {
//             return null;
//         }

//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next; // move 1 step
//             fast = fast.next.next; // move 2 steps
//         }

//         return slow; // slow is now at middle
//     }

//     public static void main(String[] args) {
//         Somu somu = new Somu();

//         somu.addLast(1);
//         somu.addLast(2);
//         somu.addLast(3);
//         somu.addLast(4);
//         somu.addLast(5);

//         Node mid = somu.findMiddle();
//         System.out.println("Middle element: " + mid.data);
//     }
// }

// ********** 9.Implementation of doubly linked list. Operations on Linked List. Insertion, Deletion, 
//Traversal.***********

// public class Somu {

//     // 🔹 Node structure
//     static class Node {
//         int data;
//         Node prev;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.prev = null;
//             this.next = null;
//         }
//     }

//     Node head; // start of the list

//     // 🔹 Insert at beginning
//     public void insertAtBeginning(int data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         if (head != null) {
//             head.prev = newNode;
//         }
//         head = newNode;
//     }

//     // 🔹 Insert at end
//     public void insertAtEnd(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }

//         temp.next = newNode;
//         newNode.prev = temp;
//     }

//     // 🔹 Delete a node (by value)
//     public void deleteNode(int key) {
//         if (head == null) {
//             System.out.println("List is empty!");
//             return;
//         }

//         Node temp = head;

//         // If head node itself holds the key
//         if (temp.data == key) {
//             head = temp.next;
//             if (head != null)
//                 head.prev = null;
//             return;
//         }

//         // Search for the node to be deleted
//         while (temp != null && temp.data != key) {
//             temp = temp.next;
//         }

//         // If not found
//         if (temp == null) {
//             System.out.println("Node not found!");
//             return;
//         }

//         // Unlink the node
//         if (temp.next != null)
//             temp.next.prev = temp.prev;

//         if (temp.prev != null)
//             temp.prev.next = temp.next;
//     }

//     // 🔹 Traverse forward
//     public void traverseForward() {
//         Node temp = head;
//         System.out.print("Forward Traversal: ");
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     // 🔹 Traverse backward
//     public void traverseBackward() {
//         if (head == null)
//             return;

//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }

//         System.out.print("Backward Traversal: ");
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.prev;
//         }
//         System.out.println();
//     }

//     // 🔹 Main function to test
//     public static void main(String[] args) {
//         Somu somu = new Somu();

//         somu.insertAtEnd(10);
//         somu.insertAtEnd(20);
//         somu.insertAtEnd(30);
//         somu.insertAtBeginning(5);

//         somu.traverseForward(); // 5 10 20 30
//         somu.traverseBackward(); // 30 20 10 5

//         somu.deleteNode(20);
//         somu.traverseForward(); // 5 10 30
//     }
// }

//************** *  10. Implementation of circular linked list. Operations on Linked List. Insertion, Deletion, 
//Traversal. ************

// public class Somu {

//     // 🔹 Node structure
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     Node head = null;
//     Node tail = null;

//     // 🔹 Insert at end
//     public void insertAtEnd(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//             tail.next = head; // make it circular
//         } else {
//             tail.next = newNode;
//             tail = newNode;
//             tail.next = head; // last node connects to head
//         }
//     }

//     // 🔹 Insert at beginning
//     public void insertAtBeginning(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//             tail.next = head;
//         } else {
//             newNode.next = head;
//             head = newNode;
//             tail.next = head; // maintain circularity
//         }
//     }

//     // 🔹 Delete a node by value
//     public void deleteNode(int key) {
//         if (head == null) {
//             System.out.println("List is empty!");
//             return;
//         }

//         Node current = head;
//         Node prev = tail;

//         // Case 1: Only one node
//         if (head == tail && head.data == key) {
//             head = null;
//             tail = null;
//             return;
//         }

//         // Case 2: Head node to delete
//         if (head.data == key) {
//             head = head.next;
//             tail.next = head;
//             return;
//         }

//         // Case 3: Other nodes
//         do {
//             if (current.data == key) {
//                 prev.next = current.next;

//                 // if deleted node was the tail
//                 if (current == tail) {
//                     tail = prev;
//                 }
//                 return;
//             }
//             prev = current;
//             current = current.next;
//         } while (current != head);

//         System.out.println("Node not found!");
//     }

//     // 🔹 Traverse the list
//     public void traverse() {
//         if (head == null) {
//             System.out.println("List is empty!");
//             return;
//         }

//         Node temp = head;
//         System.out.print("Circular Linked List: ");
//         do {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         } while (temp != head);
//         System.out.println();
//     }

//     // 🔹 Main function to test
//     public static void main(String[] args) {
//         Somu New = new Somu();
//         New.insertAtEnd(10);
//         New.insertAtEnd(20);
//         New.insertAtEnd(30);
//         New.insertAtBeginning(5); // ✅ fixed here

//         New.traverse(); // 5 10 20 30

//         New.deleteNode(10);
//         New.traverse(); // 5 20 30

//         New.deleteNode(5);
//         New.traverse(); // 20 30
//     }
// }

//******************11. Write a function to merge two sorted linked lists into one sorted linked list.************* 

// public class Somu {

//     // 🔹 Node structure
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // 🔹 Function to merge two sorted linked lists
//     public static Node mergeLists(Node l1, Node l2) {
//         // Dummy node to simplify logic
//         Node dummy = new Node(-1);
//         Node tail = dummy;

//         // Traverse both lists
//         while (l1 != null && l2 != null) {
//             if (l1.data <= l2.data) {
//                 tail.next = l1;
//                 l1 = l1.next;
//             } else {
//                 tail.next = l2;
//                 l2 = l2.next;
//             }
//             tail = tail.next;
//         }

//         // Attach the remaining part
//         if (l1 != null)
//             tail.next = l1;
//         if (l2 != null)
//             tail.next = l2;

//         return dummy.next; // head of merged list
//     }

//     // 🔹 Helper function to print a linked list
//     public static void printList(Node head) {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     // 🔹 Main method to test
//     public static void main(String[] args) {
//         // First sorted list: 1 -> 3 -> 5
//         Node l1 = new Node(1);
//         l1.next = new Node(3);
//         l1.next.next = new Node(5);

//         // Second sorted list: 2 -> 4 -> 6
//         Node l2 = new Node(2);
//         l2.next = new Node(4);
//         l2.next.next = new Node(6);

//         System.out.print("List 1: ");
//         printList(l1);
//         System.out.print("List 2: ");
//         printList(l2);

//         Node merged = mergeLists(l1, l2);

//         System.out.print("Merged List: ");
//         printList(merged);
//     }
// }

//**************  12. Write a function to remove the Nth node from the start/end of a linked list.  
//*********** * *

// public class Somu {

//     // 🔹 Node structure
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     Node head;

//     // 🔹 Function to insert node at end
//     public void insert(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }

//     // 🔹 Function to remove Nth node from START
//     public void removeNthFromStart(int n) {
//         if (head == null) {
//             System.out.println("List is empty!");
//             return;
//         }

//         // If first node needs to be removed
//         if (n == 1) {
//             head = head.next;
//             return;
//         }

//         Node temp = head;
//         for (int i = 1; i < n - 1 && temp != null; i++) {
//             temp = temp.next;
//         }

//         if (temp == null || temp.next == null) {
//             System.out.println("Position out of range!");
//             return;
//         }

//         temp.next = temp.next.next;
//     }

//     // 🔹 Function to print list
//     public void printList() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     // 🔹 Main method
//     public static void main(String[] args) {
//         Somu list = new Somu();

//         list.insert(10);
//         list.insert(20);
//         list.insert(30);
//         list.insert(40);
//         list.insert(50);

//         System.out.print("Original List: ");
//         list.printList();

//         list.removeNthFromStart(3); // remove 3rd node
//         System.out.print("After removing 3rd node from start: ");
//         list.printList();
//     }
// }

// ************ 13. Write a program to implement a stack using an list list with basic operations: push, 
// pop, peek, and isEmpty. **********

// public class Somu {

//     // 🔹 Node structure
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     Node top; // top of the stack

//     // 🔹 Constructor
//     Somu() {
//         top = null;
//     }

//     // 🔹 Push operation
//     public void push(int data) {
//         Node newNode = new Node(data);
//         newNode.next = top; // link new node to previous top
//         top = newNode; // update top
//         System.out.println(data + " pushed to stack");
//     }

//     // 🔹 Pop operation
//     public int pop() {
//         if (isEmpty()) {
//             System.out.println("Stack Underflow!");
//             return -1;
//         }
//         int popped = top.data;
//         top = top.next;
//         return popped;
//     }

//     // 🔹 Peek operation
//     public int peek() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty!");
//             return -1;
//         }
//         return top.data;
//     }

//     // 🔹 isEmpty operation
//     public boolean isEmpty() {
//         return (top == null);
//     }

//     // 🔹 Display stack
//     public void display() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty!");
//             return;
//         }
//         Node temp = top;
//         System.out.print("Stack elements: ");
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     // 🔹 Main method to test
//     public static void main(String[] args) {
//         Somu stack = new Somu();

//         stack.push(10);
//         stack.push(20);
//         stack.push(30);
//         stack.display();

//         System.out.println("Top element is: " + stack.peek());

//         System.out.println(stack.pop() + " popped from stack");
//         stack.display();

//         System.out.println("Is stack empty? " + stack.isEmpty());
//     }
// }

//**********14. Write a function to check if a string containing parentheses is balanced.  */

// import java.util.Stack;

// public class Somu {

//     // 🔹 Function to check if parentheses are balanced
//     public static boolean isBalanced(String str) {
//         Stack<Character> stack = new Stack<>();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             // 🔸 If it's an opening bracket → push to stack
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 stack.push(ch);
//             }
//             // 🔸 If it's a closing bracket → check top of stack
//             else if (ch == ')' || ch == '}' || ch == ']') {
//                 // Stack empty means no matching opening bracket
//                 if (stack.isEmpty()) {
//                     return false;
//                 }

//                 char top = stack.pop();

//                 // Check if brackets match
//                 if ((ch == ')' && top != '(') ||
//                         (ch == '}' && top != '{') ||
//                         (ch == ']' && top != '[')) {
//                     return false;
//                 }
//             }
//         }

//         // 🔸 If stack is empty → balanced
//         return stack.isEmpty();
//     }

//     // 🔹 Main function to test
//     public static void main(String[] args) {
//         String s1 = "{[()]}";
//         String s2 = "([)]";
//         String s3 = "(((";

//         System.out.println(s1 + " -> " + isBalanced(s1)); // true
//         System.out.println(s2 + " -> " + isBalanced(s2)); // false
//         System.out.println(s3 + " -> " + isBalanced(s3)); // false
//     }
// }

//************ 15. Write a function to evaluate a given postfix expression.  */

// import java.util.Stack;

// public class Somu {

//     // 🔹 Function to evaluate postfix expression
//     public static int evaluatePostfix(String expression) {
//         Stack<Integer> stack = new Stack<>();
//         String[] tokens = expression.split(" ");

//         for (String token : tokens) {

//             // If it's a number → push it to stack
//             if (isNumeric(token)) {
//                 stack.push(Integer.parseInt(token));
//             }
//             // Otherwise → it's an operator
//             else {
//                 int b = stack.pop(); // 2nd operand
//                 int a = stack.pop(); // 1st operand
//                 int result = 0;

//                 if (token.equals("+")) {
//                     result = a + b;
//                 } else if (token.equals("-")) {
//                     result = a - b;
//                 } else if (token.equals("*")) {
//                     result = a * b;
//                 } else if (token.equals("/")) {
//                     result = a / b;
//                 } else if (token.equals("^")) {
//                     result = (int) Math.pow(a, b);
//                 } else {
//                     System.out.println("Invalid operator: " + token);
//                     return -1;
//                 }

//                 stack.push(result);
//             }
//         }

//         // Final result at top of stack
//         return stack.pop();
//     }

//     // 🔹 Helper: check if string is a number
//     public static boolean isNumeric(String str) {
//         try {
//             Integer.parseInt(str);
//             return true;
//         } catch (NumberFormatException e) {
//             return false;
//         }
//     }

//     // 🔹 Main method to test
//     public static void main(String[] args) {
//         String exp1 = "2 3 +";
//         String exp2 = "5 1 2 + 4 * + 3 -";

//         System.out.println("Postfix: " + exp1 + " = " + evaluatePostfix(exp1));
//         System.out.println("Postfix: " + exp2 + " = " + evaluatePostfix(exp2));
//     }
// }

//***************16. Implement a Queue Using Linked List: Write a function to implement a queue using a 
// linked list with basic operations: enqueue, dequeue, front, and isEmpty. */

// public class Somu {

//     // 🔹 Node structure
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // 🔹 Front and Rear pointers
//     Node front = null;
//     Node rear = null;

//     // 🔹 Enqueue operation — insert at end
//     public void enqueue(int data) {
//         Node newNode = new Node(data);

//         if (rear == null) { // Empty queue
//             front = rear = newNode;
//             return;
//         }

//         rear.next = newNode;
//         rear = newNode;
//     }

//     // 🔹 Dequeue operation — remove from front
//     public void dequeue() {
//         if (front == null) {
//             System.out.println("Queue is empty!");
//             return;
//         }

//         System.out.println("Dequeued: " + front.data);
//         front = front.next;

//         // If queue becomes empty
//         if (front == null) {
//             rear = null;
//         }
//     }

//     // 🔹 Peek / Front element
//     public void front() {
//         if (front == null) {
//             System.out.println("Queue is empty!");
//         } else {
//             System.out.println("Front element: " + front.data);
//         }
//     }

//     // 🔹 Check if empty
//     public boolean isEmpty() {
//         return front == null;
//     }

//     // 🔹 Display queue
//     public void display() {
//         if (front == null) {
//             System.out.println("Queue is empty!");
//             return;
//         }

//         Node temp = front;
//         System.out.print("Queue: ");
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     // 🔹 Main method to test
//     public static void main(String[] args) {
//         Somu q = new Somu();

//         q.enqueue(10);
//         q.enqueue(20);
//         q.enqueue(30);
//         q.display(); // Queue: 10 20 30

//         q.front(); // Front element: 10

//         q.dequeue(); // Dequeued: 10
//         q.display(); // Queue: 20 30

//         q.dequeue();
//         q.dequeue();
//         q.dequeue(); // Queue is empty!
//     }
// }

// ********17. Write a program to implement a queue using two stacks.******

// import java.util.Stack;

// public class Somu {

//     Stack<Integer> stack1 = new Stack<>(); // Main stack for enqueue
//     Stack<Integer> stack2 = new Stack<>(); // Helper stack for dequeue

//     // 🔹 Enqueue operation — O(1)
//     public void enqueue(int data) {
//         stack1.push(data);
//         System.out.println("Enqueued: " + data);
//     }

//     // 🔹 Dequeue operation — O(n)
//     public void dequeue() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty!");
//             return;
//         }

//         // Move all elements from stack1 → stack2 (to reverse order)
//         while (!stack1.isEmpty()) {
//             stack2.push(stack1.pop());
//         }

//         // Remove front element (top of stack2)
//         int dequeued = stack2.pop();
//         System.out.println("Dequeued: " + dequeued);

//         // Move everything back to stack1
//         while (!stack2.isEmpty()) {
//             stack1.push(stack2.pop());
//         }
//     }

//     // 🔹 Front element (peek)
//     public void front() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty!");
//             return;
//         }

//         // Move all elements to stack2 to reach front
//         while (!stack1.isEmpty()) {
//             stack2.push(stack1.pop());
//         }

//         System.out.println("Front element: " + stack2.peek());

//         // Move back to stack1
//         while (!stack2.isEmpty()) {
//             stack1.push(stack2.pop());
//         }
//     }

//     // 🔹 Check if queue is empty
//     public boolean isEmpty() {
//         return stack1.isEmpty();
//     }

//     // 🔹 Display queue (front → rear)
//     public void display() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty!");
//             return;
//         }

//         System.out.print("Queue (front → rear): ");
//         for (int i = 0; i < stack1.size(); i++) {
//             System.out.print(stack1.get(i) + " ");
//         }
//         System.out.println();
//     }

//     // 🔹 Main method to test
//     public static void main(String[] args) {
//         Somu q = new Somu();

//         q.enqueue(10);
//         q.enqueue(20);
//         q.enqueue(30);
//         q.display(); // Queue: 10 20 30

//         q.front(); // Front: 10
//         q.dequeue(); // Removes 10
//         q.display(); // Queue: 20 30

//         q.dequeue();
//         q.dequeue();
//         q.dequeue(); // Queue is empty
//     }
// }

//*************18. Write a program to implement a stack using two queues.  */

// import java.util.LinkedList;
// import java.util.Queue;

// public class Somu {

//     Queue<Integer> q1 = new LinkedList<>(); // main queue
//     Queue<Integer> q2 = new LinkedList<>(); // helper queue

//     // 🔹 Push operation — O(n)
//     public void push(int data) {
//         // Step 1: Add new element to q2
//         q2.add(data);

//         // Step 2: Move all elements from q1 → q2
//         while (!q1.isEmpty()) {
//             q2.add(q1.remove());
//         }

//         // Step 3: Swap q1 and q2
//         Queue<Integer> temp = q1;
//         q1 = q2;
//         q2 = temp;

//         System.out.println("Pushed: " + data);
//     }

//     // 🔹 Pop operation — O(1)
//     public void pop() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty!");
//             return;
//         }
//         System.out.println("Popped: " + q1.remove());
//     }

//     // 🔹 Peek / Top element — O(1)
//     public void peek() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty!");
//             return;
//         }
//         System.out.println("Top element: " + q1.peek());
//     }

//     // 🔹 Check if empty
//     public boolean isEmpty() {
//         return q1.isEmpty();
//     }

//     // 🔹 Display stack elements (top → bottom)
//     public void display() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty!");
//             return;
//         }
//         System.out.println("Stack (top → bottom): " + q1);
//     }

//     // 🔹 Main method to test
//     public static void main(String[] args) {
//         Somu stack = new Somu();

//         stack.push(10);
//         stack.push(20);
//         stack.push(30);
//         stack.display(); // [30, 20, 10]

//         stack.peek(); // Top element: 30
//         stack.pop(); // Popped: 30
//         stack.display(); // [20, 10]

//         stack.pop();
//         stack.pop();
//         stack.pop(); // Stack is empty!
//     }
// }







