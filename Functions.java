import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FunctionHelp obj=new FunctionHelp();
        obj.printstars();
       // System.out.println();
        obj.sum(10, 20);
        obj.sum(3, 03, 05);
        
        sc.close();
    }
}