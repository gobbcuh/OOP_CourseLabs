package laboratory3_3;

public class Triangle extends Shape {
    @Override
    void calculateArea() {
        float area = base * height / 2;
        System.out.println("Area of Triangle: " + area);
    }
}
