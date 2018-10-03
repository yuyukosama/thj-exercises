package c6_reusing_classes;

class AmphibianEx17 {
    protected void swim() {
        System.out.println("Amphibian swim");
    }
    protected void speak() {
        System.out.println("Amphibian speak");
    }
    protected  void eat() {
        System.out.println("Amphibian eat");
    }
    static void grow(AmphibianEx17 a) {
        System.out.println("Amphibian grow");
        a.eat();
    }
}

public class E17_Frog extends AmphibianEx17 {
    @Override
    protected void swim() {
        System.out.println("Frog swim");
    }

    @Override
    protected void speak() {
        System.out.println("Frog speak");
    }

    @Override
    protected  void eat() {
        System.out.println("Frog eat");
    }

    static void grow(AmphibianEx17 a) {
        System.out.println("Frog grow");
        a.eat();
    }

    public static void main(String[] args) {
        E17_Frog f = new E17_Frog();
        f.swim();
        f.speak();
        f.eat();
        f.grow(f);
        AmphibianEx17.grow(f);
    }
}
