import java.util.*;

public class javaBasics {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("This year is leap year");

        } else {
            System.out.println("This year is not leap year");
        }
    }
}