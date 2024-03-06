import java.util.Random; // for random number genration
import java.util.Scanner;

public class RandomGuess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, guess, count = 0;

        Random random = new Random();
        num = random.nextInt(100) + 1;
        while (true) {
            count++;
            System.out.println("Enter your guess:");
            guess = sc.nextInt();
            if (guess == num) {
                System.out.println("You enterd the correct number");
                System.out.println("You guess the number in  " + count + " Tries");
                break;
            } else if (guess < num) {
                System.out.println("Your guess is small");

            } else if (guess > num) {
                System.out.println("Your guess is greater");

            }
        }

        if (count < 5) {
            System.out.println("Excellent");
        } else if (count > 5 && count < 10) {
            System.out.println("Average");
        } else {
            System.out.println("Bhai tu kya kr rha hai");
        }

        sc.close();
    }

}
