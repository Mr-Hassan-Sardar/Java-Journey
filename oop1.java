package OopinJava;

import java.util.ArrayList;
import java.util.Scanner;

public class oop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // default constructor
        // student s1 = new student();
        // s1.name = "Hassan";
        // s1.marks = 98;
        // System.out.println("Name is: " + s1.name);
        // System.out.println("Marks are: " + s1.marks);
        // // parametrized constructor
        // student s2 = new student("Ali", 97);
        // System.out.println("Name is: " + s2.name);
        // System.out.println("Marks are: " + s2.marks);
        // // setter and getter
        // student s3 = new student();
        // s3.setName("Ahmed");
        // s3.setMarks(95);
        // System.out.println("Name is: " + s3.getName());
        // System.out.println("Marks are: " + s3.getMarks());

        // student s4=new student("abc", 121);

        // System.out.println(s4);
        // //Shallow Copy
        // // Changing in 1 object wil change other objec also

        // student s5 = new student("amar", 120);
        // student s6 = s5;
        // System.out.println("..........Before change shallow copy..........");
        // System.out.println("Name: " + s5.name + " Marks: " + s5.marks);
        // System.out.println("Name: " + s6.name + " Marks: " + s6.marks);
        // s6.name = "Gafar";
        // System.out.println("..........After change shallow copy..........");
        // System.out.println("Name: " + s5.name + " Marks: " + s5.marks);
        // System.out.println("Name: " + s6.name + " Marks: " + s6.marks);

        // // Deep Copy
        // // Changing in 1 object will not change other objec
        // student s7 = new student(s5);
        // System.out.println("..........Before change Deep copy..........");
        // System.out.println("Name: " + s5.name + " Marks: " + s5.marks);
        // System.out.println("Name: " + s7.name + " Marks: " + s7.marks);
        // s7.name = "Jhon";
        // System.out.println("..........After change Deep copy..........");
        // System.out.println("Name: " + s5.name + " Marks: " + s5.marks);
        // System.out.println("Name: " + s7.name + " Marks: " + s7.marks);



        int marks;
        String name;
        char choice = 'y';
        // Array List

        ArrayList<student> student_List = new ArrayList<>();

        while (choice == 'y' || choice == 'Y') {
            System.out.println("Please enter yoiur  name: ");
            name = sc.next();
            System.out.println("Please Enter your marks: ");
            marks = sc.nextInt();

            // student class object

            student s8 = new student(name, marks);
            // add method(Built-in)
            student_List.add(s8);

            System.out.println("Do you want to continue: ");
            choice = sc.next().charAt(0);
        }
        // printing student list
        for (int i = 0; i < student_List.size(); i++) {
            student_List.get(i).displayinfo();

        }


        
        sc.close();
    }
}
