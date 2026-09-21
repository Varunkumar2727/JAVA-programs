package p01_variables;

public class variablesdemo {
    public static void main(String[] args) {
        int rollno = 101;
        double marks = 92.5;
        char section = 'B';
        String name = "Ravi";
        boolean ispass = marks >= 40;

        System.out.println(name + " ( " + rollno + " )");
        System.out.println("Section: " + section);
        System.out.println("Marks: " + marks);
        System.out.println("Pass: " + ispass);
    }
}
