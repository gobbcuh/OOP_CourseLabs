package laboratory4_2;

public abstract class Shape {

    float area = 0, perimeter = 0;
    float radius = 10, base = 20, height = 30;
    float a = 40, b = 20, c = 10;

    abstract void calculateArea();
    abstract void calculatePerimeter();
}
