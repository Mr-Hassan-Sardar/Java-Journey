import java.util.Random; // for random number genration
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        float as;
        Random random = new Random();
        num = random.nextInt(100) + 1;
        System.out.println(num);
        // For float
        as = random.nextFloat(100) + 1;
        System.out.println(as);
        sc.close();
    }

}
