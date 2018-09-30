package c4_initialization_and_cleanup;

class Dog {
    void bark() {System.out.println("quiet");}
    void bark(char c) {System.out.println("quiet");}
    void bark(byte b) {System.out.println("barkbark");}
    void bark(short s) {System.out.println("slurpslurp");}
    void bark(int i) {System.out.println("iyow");}
    void bark(long L) {System.out.println("lalala");}
    void bark(float f) {System.out.println("fififoofum");}
    void bark(double d) {System.out.println("dodo");}


}

public class E05_DogTalk {
    public static void main(String[] args) {
        Dog d = new Dog();
        char c = 'c';
        byte b = 0;
        short s = 0;
        d.bark();
        d.bark(c);
        d.bark(b);
        d.bark(s);
        d.bark(0);
        d.bark(3L);
        d.bark(3.f);
        d.bark(3.2);
    }
}
