package p02_class_and_object;

class Student {
    String studentName;
    int studentAge;

    void displayDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentName = "Bloodline";
        s1.studentAge = 20;

        s1.displayDetails();
    }
}
