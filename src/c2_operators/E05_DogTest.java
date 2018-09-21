package c2_operators;

class Dog {
    //Two String Fields
    String name;
    String says;

    public void setName(String name) {
        this.name = name;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public void showName() {
        System.out.println(this.name);
    }

    public void speak() {
        System.out.println(this.says);
    }
}

public class E05_DogTest {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.setName("spot");
        spot.setSays("Ruff!");

        Dog scruffy = new Dog();
        scruffy.setName("scruffy");
        scruffy.setSays("Wurf!");

        spot.showName();
        spot.speak();

        scruffy.showName();
        scruffy.speak();

    }
}
