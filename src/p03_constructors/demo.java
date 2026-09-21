package p03_constructors;

class student {
    int rollno;
    String name;

    student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " - " + name);
    }
}

public class demo {
    public static void main(String[] args) {
        student s1 = new student(101, "Ravi");
        student s2 = new student(102, "Anita");

        s1.display();
        s2.display();
    }
}
