package laboratory4_2;

public class Triangle extends Shape {
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
