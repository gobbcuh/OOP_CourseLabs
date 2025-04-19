package laboratory4_2;

public class Triangle extends Shape {
    private float base, height;
    private float a, b, c;
    private float area, perimeter;

    public Triangle(float base, float height, float a, float b, float c) {
        this.base = base;
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void calculateArea() {
        area = 0.5f * base * height;
        System.out.println("Area of Triangle: " + area);
    }

    @Override
    void calculatePerimeter() {
        perimeter = a + b + c;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
}
