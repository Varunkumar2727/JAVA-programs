package p04_constructor_overloading;

class Box {
    int w, h;

    // Default constructor
    Box() {
        w = 1;
        h = 1;
    }

    // Parameterized constructor
    Box(int w, int h) {
        this.w = w;
        this.h = h;
    }

    // Copy constructor
    Box(Box b) {
        this.w = b.w;
        this.h = b.h;
    }

    int area() {
        return w * h;
    }
}

public class constructor {
    public static void main(String[] args) {
        Box b1 = new Box(3, 4);
        Box b2 = new Box(b1);
        Box b3 = new Box();

        System.out.println("Area of A = " + b1.area());
        System.out.println("Area of B = " + b2.area());
        System.out.println("Area of C = " + b3.area());
    }
}
