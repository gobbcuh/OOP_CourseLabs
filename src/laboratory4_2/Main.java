package laboratory4_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(15, 28, 12, 48, 20);
        
        circle.calculateArea();
        circle.calculatePerimeter();
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}
