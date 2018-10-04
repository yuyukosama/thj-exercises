//: polymorphism/shape/Circle.java
package c7_polymorphism.shape;
import static net.mindview.util.Print.*;

public class Circle extends Shape {
  @Override
  public void draw() { print("Circle.draw()"); }
  @Override
  public void erase() { print("Circle.erase()"); }
  @Override
  public void amend() { print("Circle.amend()"); }
} ///:~
