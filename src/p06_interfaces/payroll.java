package p06_interfaces;

interface Payable {
    double pay();
}

interface taxable {
    double tax();
}

class Employee implements Payable, taxable {
    double salary;

    Employee(double s) {
        salary = s;
    }

    public double pay() {
        return salary;
    }

    public double tax() {
        return salary * 0.1; // Assuming a flat tax rate of 20%
    }
}

public class payroll {
    public static void main(String[] args) {
        Employee e = new Employee(50000);
        System.out.println(e.pay());
        System.out.println(e.tax());
    }
}
