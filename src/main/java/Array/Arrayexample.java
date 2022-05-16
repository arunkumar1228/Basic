package Array;


public class Arrayexample {
    public static void main(String[] args) {
        int sum = 0;
        int[] ar = new int[5];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        ar[3] = 4;
        ar[4] = 5;
        for (int i = 0; i < ar.length; i++) {
            if (i >= 0) {
                sum = ar[i];
                System.out.println(sum);
            }
            else
                System.out.println("error");
        }
    }
}