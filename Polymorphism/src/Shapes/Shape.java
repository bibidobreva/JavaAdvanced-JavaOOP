package Shapes;

public abstract class Shape {

    private Double perimeter;
    private Double area;

    public Double getArea() {
        return area;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public abstract Double calculatePerimeter();

    public abstract Double calculateArea();


}
