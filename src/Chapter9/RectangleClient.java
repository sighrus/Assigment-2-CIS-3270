package Chapter9;

import org.w3c.dom.css.Rect;

public class RectangleClient {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1 dimensions: " + rect1.toString());
        System.out.println("Rectangle 1 Area and Perimeter respectively: " + rect1.getArea() + ", " + rect1.getPerimeter());

        System.out.println("Rectangle 2 dimensions: " + rect2.toString());
        System.out.println("Rectangle 2 Area and Perimeter respectively: " + rect2.getArea() + ", " + rect2.getPerimeter());

    }
}
