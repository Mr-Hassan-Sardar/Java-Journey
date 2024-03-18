public class student {
    public String name;
    public int marks;

    // Default Constructor
    public student() {

    }

    // Parameterized Constructor
    public student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Copy Constructor(Deep Copy)
    public student(student s) {
        this.name = s.name;
        this.marks = s.marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString() {
        return "Name: " + name + "  Marks: " + marks;
    }

    public void displayinfo() {
        System.out.println("Name: " + name + " Marks: " + marks);
    }

}
