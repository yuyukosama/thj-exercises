package c7_polymorphism.shape;

import static net.mindview.util.Print.print;

public class Rectangle extends Shape {
    @Override
    public void draw() { print("Rectangle.draw()"); }
    @Override
    public void erase() { print("Rectangle.erase()"); }
    @Override
    public void amend() { print("Rectangle.amend()"); }
}
