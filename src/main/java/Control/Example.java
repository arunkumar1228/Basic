package Control;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("Enter the value :");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a == 10) {
            if (a % 2 == 0) {
                System.out.println(" The value is Zero");
            }
        } else if (a == 20) {
            System.out.println("The value not Zero");
        } else {
            System.out.println(" Not give the value");
        }

    }
}
