package Control;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter the value :");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        switch (a){
            case 1 :
                System.out.println("value is 1");
                break;
            case 2 :
                System.out.println("value is 2");
                break;
            case 3 :
                System.out.println("value is 3");
                break;
            case 4 :
                System.out.println("value is 4");
                break;
        }
    }
}
