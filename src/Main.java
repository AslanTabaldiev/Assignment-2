public class Main {
    public static void main(String[] args) {
        Student Aslan = new Student("Aslan", 230107013, "Management", 3.6);
        Student Nazar = new Student("Nazar", 230107001, "Management", 3.5);
        Student Aidar = new Student("Aidar", 230107005, "Management", 3.5);
        Student Islam = new Student();

        Aslan.displayInfo();
        Nazar.displayInfo();
        Aidar.displayInfo();
        Islam.displayInfo();

        Nazar.sayHello("Aziz");
        Aslan.sayHello("Zhenishbek agai");
        Aidar.sayHello("Aktan");
        Islam.sayHello("Aslan");
    }
}