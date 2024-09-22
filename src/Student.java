public class Student {
    private String name;
    private int studentID;
    private String major;
    private double GPA;

    public Student(String name, int studentID, String major, double GPA) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
        this.GPA = GPA;
    }

    public Student() {
        this.name = "";
        this.studentID = 0;
        this.major = "";
        this.GPA = 0.0;
    }

    public void displayInfo() {
        System.out.println("My name is " + name);
        System.out.println("My ID is " + studentID);
        System.out.println("My major is " + major);
        System.out.println("My GPA is " + GPA);
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }
}
