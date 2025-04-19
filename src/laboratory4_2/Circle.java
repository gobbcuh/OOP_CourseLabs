package laboratory4_2;

public class Circle extends Shape {
    @Override
    void calculateArea() {
        area = 3.14f * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    @Override
    void calculatePerimeter() {
        perimeter = 2 * 3.14f * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}
