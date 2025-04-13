package laboratory3_3;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        rectangle.calculateArea();
        circle.calculateArea();
        triangle.calculateArea();
    }
}
