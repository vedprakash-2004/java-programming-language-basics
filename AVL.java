// public class AVL {

//     // Node definition
//     static class Node {
//         int data, height;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             this.height = 1; // new node is initially at height 1
//         }
//     }

//     public static Node root;

//     // Get height of node
//     public static int height(Node node) {
//         if (node == null)
//             return 0;
//         return node.height;
//     }

//     // Get balance factor
//     public static int getBalance(Node node) {
//         if (node == null)
//             return 0;
//         return height(node.left) - height(node.right);
//     }

//     // Right rotation
//     public static Node rightRotate(Node y) {
//         Node x = y.left;
//         Node T2 = x.right;

//         // Perform rotation
//         x.right = y;
//         y.left = T2;

//         // Update heights
//         y.height = Math.max(height(y.left), height(y.right)) + 1;
//         x.height = Math.max(height(x.left), height(x.right)) + 1;

//         // Return new root
//         return x;
//     }

//     // Left rotation
//     public static Node leftRotate(Node x) {
//         Node y = x.right;
//         Node T2 = y.left;

//         // Perform rotation
//         y.left = x;
//         x.right = T2;

//         // Update heights
//         x.height = Math.max(height(x.left), height(x.right)) + 1;
//         y.height = Math.max(height(y.left), height(y.right)) + 1;

//         // Return new root
//         return y;
//     }

//     // Insert a key into AVL Tree
//     public static Node insert(Node node, int key) {
//         // 1. Perform normal BST insertion
//         if (node == null)
//             return new Node(key);

//         if (key < node.data)
//             node.left = insert(node.left, key);
//         else if (key > node.data)
//             node.right = insert(node.right, key);
//         else
//             return node; // Duplicate keys not allowed

//         // 2. Update height
//         node.height = 1 + Math.max(height(node.left), height(node.right));

//         // 3. Get balance factor
//         int balance = getBalance(node);

//         // 4. If node is unbalanced, handle 4 cases

//         // Left Left Case
//         if (balance > 1 && key < node.left.data)
//             return rightRotate(node);

//         // Right Right Case
//         if (balance < -1 && key > node.right.data)
//             return leftRotate(node);

//         // Left Right Case
//         if (balance > 1 && key > node.left.data) {
//             node.left = leftRotate(node.left);
//             return rightRotate(node);
//         }

//         // Right Left Case
//         if (balance < -1 && key < node.right.data) {
//             node.right = rightRotate(node.right);
//             return leftRotate(node);
//         }

//         // Return unchanged node pointer
//         return node;
//     }

//     // Inorder Traversal (sorted output)
//     public static void inorder(Node root) {
//         if (root != null) {
//             inorder(root.left);
//             System.out.print(root.data + " ");
//             inorder(root.right);
//         }
//     }

//     // Driver code
//     public static void main(String[] args) {
//         AVL tree = new AVL();

//         root = insert(root, 10);
//         root = insert(root, 20);
//         root = insert(root, 30);
//         root = insert(root, 40);
//         root = insert(root, 50);
//         root = insert(root, 25);

//         System.out.println("Inorder traversal of constructed AVL tree:");
//         inorder(root);
//     }
// }

class AVL {
    public static int reverseDigits(int n) {
        // Code here
        String s = "";
        while (n > 0) {
            int lastDigit = n % 10;
            s += lastDigit;
            n = n / 10;
        }
        return Integer.parseInt(s);

    }

    public static void main(String[] args) {
        // AVL obj= new AVL();
        int val = reverseDigits(122);
        System.out.println(val);
    }
}
