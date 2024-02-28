import java.util.Scanner;

public class population_growth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int population;
        float growth_rate;
        int year;
        float newpop;
        System.out.println("Enter the current population of the world:");
        population = sc.nextInt();

        System.out.println("Enter the current growth rate of population of the world:");
        growth_rate = sc.nextFloat();
        System.out.println("Enter the year you want to know the population:");
        year = sc.nextInt();
        newpop = year * growth_rate * population;
       

        System.out.print("The population after " + year);
        System.out.println(" is" + newpop);



        //Integer.floatParseInt();
    }
}
