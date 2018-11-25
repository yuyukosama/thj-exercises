package c10_holding;
import java.util.*;

class Shape {
    public void draw() {}
    public void erase() {}
} ///:~
class Circle extends Shape {
    public void draw() { System.out.println("Circle.draw()"); }
    public void erase() { System.out.println("Circle.erase()"); }
} ///:~
class Square extends Shape {
    public void draw() { System.out.println("Square.draw()"); }
    public void erase() { System.out.println("Square.erase()"); }
} ///:~
class Triangle extends Shape {
    public void draw() { System.out.println("Triangle.draw()"); }
    public void erase() { System.out.println("Triangle.erase()"); }
} ///:~

class RandomShapeGenerator implements Iterable<Shape>{
    private Random rand = new Random(47);
    private int iteNum = 0;

    RandomShapeGenerator(int iteNum) {
        this.iteNum = iteNum;
    }
    public Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int count;
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean hasNext() {
                return count < iteNum;
            }

            @Override
            public Shape next() {
                count++;
                return RandomShapeGenerator.this.next();
            }
        };
    }
} ///:~

public class Ex31 {
    public static void main(String[] args) {
        RandomShapeGenerator rsg = new RandomShapeGenerator(5);
        for(Shape s : rsg)
            System.out.println(s);
    }
}
