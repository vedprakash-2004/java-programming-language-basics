// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class patterns {

//     public static void patterns(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         patterns(4);
//     }
// }

// public class patterns {

//     public static void main(String[] args) {
//         int n=4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Print HALF-PYRAMID pattern

// public class patterns {

//     public static void main(String[] args) {
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

//print CHARACTER pattern

public class patterns {

    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}