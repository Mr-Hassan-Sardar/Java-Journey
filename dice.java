//this is simpple rooling dice game
import java.util.Random;
import java.util.Scanner;

public class dice {

    private int value;

    public dice() {
        this.value = 0;
    }

    public void roll() {
        Random random = new Random();
        value = random.nextInt(6) + 1;

        if (value == 6) {
            System.out.println("Side :" + value + "Chaaaakka");
        } else {
            System.out.println("Side: " + value + "  Better luck next time");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dice d1 = new dice();
        String choice;

        while (true) {
            System.out.println("Do you want to roll dice? Y/N");
            choice = sc.next();
            if (choice.equals("y") || choice.equals("Y")) {
                System.out.println("Dice is rolling");
                d1.roll();

            } else if (choice.equals("n") || choice.equals("N")) {
                System.out.println("Program exits");
                break;

            } else {
                System.out.println("Wrong choice please enter correct choice");
            }
        }

        sc.close();

    }

}
