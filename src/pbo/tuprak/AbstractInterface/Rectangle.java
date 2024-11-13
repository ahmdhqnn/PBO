package pbo.tuprak.AbstractInterface;

class Rectangle extends GeometricObject {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle with width: " + width + " and length: " + length;
    }
}