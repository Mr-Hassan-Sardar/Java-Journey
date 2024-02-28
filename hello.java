import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Hello, world");

        // System.out.print("Enter c: ");
        // int c;
        // c = sc.nextInt(); // for int

        // char a;
        // a = sc.next().charAt(0); // for charatcer

        // System.out.println("The value of c: " + c);
        // System.out.println("The value of a: " + a);

        // int a, b;
        // char c;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a: ");
        // a = sc.nextInt();
        // System.out.print("Enter b: ");
        // b = sc.nextInt();
        // System.out.print("Enter c: ");
        // c = sc.next().charAt(0);
        // if (c == '+') {
        // int sum = a + b;
        // System.out.println("The sum is: " + sum);
        // } else {
        // System.out.println("Invalid operator");
        // }

        String fname;
        String lname;
        String fullname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fname: ");
        fname = sc.nextLine();
        System.out.println("Enter lname: ");
        lname = sc.nextLine();
        fullname = fname + lname;

        System.out.println("Name is " + fullname);

    }
}
