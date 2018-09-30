package c4_initialization_and_cleanup;

class Dog2 {
    void bark() {System.out.println("quiet");}
    void bark(char c) {System.out.println("quiet");}
    void bark(byte b) {System.out.println("barkbark");}
    void bark(short s) {System.out.println("slurpslurp");}
    void bark(int i) {System.out.println("iyow");}
    void bark(long L) {System.out.println("lalala");}
    void bark(float f) {System.out.println("fififoofum");}
    void bark(double d) {System.out.println("dodo");}
    void bark(char c, int i) {System.out.println("caw-iyow");}
    void bark(int i, char c) {System.out.println("iyow-caw");}


}

public class E06_DogTalk2 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
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
        d.bark(c, 1);
        d.bark(1,c);
    }
}
