import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        String choice = "Yes";

        while (choice.equals("Yes")) {
            System.out.println("Enetr a:");
            a = sc.nextInt();
            System.out.println("Enetr b:");
            b = sc.nextInt();

            System.out.println("Sum is" + (a + b));

            System.out.println("Do you want to continue: Yes/No");

            choice = sc.next();
        }

        System.out.println("Thank you");

        sc.close();
    }

}
