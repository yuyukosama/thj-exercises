package c6_reusing_classes;

class SmallBrain {

}

final class Dinosaur {
    SmallBrain x = new SmallBrain();
}

//class Further extends Dinosaur {}

public class E22_JurassicEx {
    public static void main(String[] args) {
        Dinosaur d = new Dinosaur();
    }
}
