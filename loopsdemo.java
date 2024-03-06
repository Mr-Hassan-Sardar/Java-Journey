import java.util.Scanner;

public class loopsdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        // for
        for (i = 0; i < 9; i++) {
            System.out.println("hello world");
        }
        // while
        i = 0;
        while (i < 9) {
            System.out.println("while");
            i++;
        }
        // do while
        i = 0;
        do {
            System.out.println("do while");
            i++;
        } while (i < 9);

        // for each or for enhace loop
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int a : arr) {
            System.out.println("Elements are " + a);
        }

        sc.close();
    }
}
