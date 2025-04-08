package laboratory2_3;

public class Rectangle extends Shape {

    @Override
    void getArea() {
        int length = 4;
        int width = 5;
        int area = length * width;
        System.out.println("Area: " + area);
    }
}
