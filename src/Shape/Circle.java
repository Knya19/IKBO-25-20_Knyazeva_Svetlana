package Shape;

public abstract class Circle extends Shape
{
    double radius;

    public Circle()
    {

    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    double getArea() {
        return 3.14*(Math.pow(radius,2));
    }

    double getPerimeter() {
        return (2*3.14)*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
