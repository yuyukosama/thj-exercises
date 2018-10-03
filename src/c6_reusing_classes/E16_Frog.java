package c6_reusing_classes;

class Amphibian {
    protected void swim() {
        System.out.println("Amphibian swim");
    }
    protected void speak() {
        System.out.println("Amphibian speak");
    }
    protected  void eat() {
        System.out.println("Amphibian eat");
    }
    static void grow(Amphibian a) {
        System.out.println("Amphibian grow");
        a.eat();
    }
}

public class E16_Frog extends Amphibian{
    public static void main(String[] args) {
        E16_Frog f = new E16_Frog();
        f.swim();
        f.speak();
        f.eat();
        Amphibian.grow(f);
    }
}
