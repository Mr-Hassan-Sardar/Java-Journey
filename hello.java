import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ch: ");
        int ch;
        char A;
        ch = sc.nextInt(); // for int

        System.out.print("Enter A: ");
        A = sc.next().charAt(0); // for charatcer

        System.out.println("The value of ch: " + ch);
        System.out.println("The value of a: " + A);

        int a, b;
        char c;
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.print("Enter c: ");
        c = sc.next().charAt(0);
        if (c == '+') {
            int sum = a + b;
            System.out.println("The sum is: " + sum);
        } else {
            System.out.println("Invalid operator");
        }

        // for strings
        String fname;
        String lname;
        String fullname;

        System.out.println("Enter fname: ");
        fname = sc.nextLine().trim(); // Trim to remove leading/trailing whitespace
        sc.nextLine(); // Consume the newline character in the buffer
        System.out.println("Enter lname: ");
        lname = sc.nextLine();
        fullname = fname + " " + lname;

        System.out.println("Name is " + fullname);

    }
}
