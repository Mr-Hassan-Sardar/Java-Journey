import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float height;
        float weight;
        float bmi;
        float sqheight;

        System.out.println("Enter your height in meters:");
        height = sc.nextFloat();
        sqheight = height * height;

        System.out.println("Enter your height in KGs:");
        weight = sc.nextFloat();
        bmi = weight / sqheight;

        if (bmi < 18.5) {
            System.out.println("Your BMI is: " + bmi);
            System.out.println(" You are Under weight");
        } else if (bmi >= 18.5 || bmi <= 24.9) {
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You are Normal Weight");
        } else if (bmi >= 25 || bmi <= 29.9) {
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You are Over weight");
        } else {
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You have Obessity");
        }

    }

}
