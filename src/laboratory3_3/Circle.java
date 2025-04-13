package laboratory3_3;

public class Circle extends Shape {
    @Override
    void calculateArea() {
        float area = 3.14f * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
