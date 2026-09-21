package p07_enums;

enum Planet {
    Earth(9.81),
    Mars(3.71),
    Moon(1.62);

    private double gravity;

    Planet(double gravity) {
        this.gravity = gravity;
    }

    double weight(double mass) {
        return mass * gravity;
    }
}

public class PlanetProgram {
    public static void main(String[] args) {
        Planet p = Planet.Mars;

        System.out.println("Weight on Mars for 70kg = " + p.weight(70));
        System.out.println("Weight on Earth for 90kg = " + Planet.Earth.weight(90));
        System.out.println("Weight on Moon for 30kg = " + Planet.Moon.weight(30));
        System.out.println();
        System.out.println("Earth weight for 70kg = " + Planet.Earth.weight(70));
        System.out.println("Mars weight for 70kg = " + Planet.Mars.weight(70));
        System.out.println("Moon weight for 70kg = " + Planet.Moon.weight(70));
    }
}
