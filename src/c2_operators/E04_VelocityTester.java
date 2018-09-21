package c2_operators;

class VelocityCalculator {
    static double velocity(double dis, double time) {
        if (time == 0) return 0d;
        return dis / time;
    }
}

public class E04_VelocityTester {
    public static void main(String[] args) {
        double d = 565.3f;
        double t = 3.6f;
        System.out.println("Velocity is :" + VelocityCalculator.velocity(d, t));
    }

}
