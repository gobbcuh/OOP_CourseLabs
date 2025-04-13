package laboratory3_3;

public class Rectangle extends Shape {
    @Override
    void calculateArea() {
        float area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
