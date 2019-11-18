package Chapter9;

public class RegularPolygonClient {
    public static void main(String[] args) {
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("p1's perimeter and area is: " + p1.getPerimeter() + " and " + p1.getArea());
        System.out.println("p2's perimeter and area is: " + p2.getPerimeter() + " and " + p2.getArea());
        System.out.println("p3's perimeter and area is: " + p3.getPerimeter() + " and " + p3.getArea());

    }
}
