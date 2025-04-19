package laboratory4_2;

public class Circle extends Shape {
    private float radius;
    private float area, perimeter;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        area = (float)(Math.PI * radius * radius);
        System.out.println("Area of Circle: " + area);
    }

    @Override
    void calculatePerimeter() {
        perimeter = (float)(2 * Math.PI * radius);
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}
