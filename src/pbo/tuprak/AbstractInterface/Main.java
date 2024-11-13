package pbo.tuprak.AbstractInterface;

public class Main {
    public static void main(String[] args) {
        // Creating ResizableCircle objects
        ResizableCircle circle1 = new ResizableCircle(5.0);
        ResizableCircle circle2 = new ResizableCircle(10.0);

        // Creating ResizableRectangle objects
        ResizableRectangle rectangle1 = new ResizableRectangle(4.0, 6.0);
        ResizableRectangle rectangle2 = new ResizableRectangle(8.0, 12.0);

        // Display initial details and resize
        System.out.println(circle1);
        circle1.resize(50); // Resize by 50%
        System.out.println("After resizing: " + circle1);

        System.out.println(circle2);
        circle2.resize(25); // Resize by 25%
        System.out.println("After resizing: " + circle2);

        System.out.println(rectangle1);
        rectangle1.resize(20); // Resize by 20%
        System.out.println("After resizing: " + rectangle1);

        System.out.println(rectangle2);
        rectangle2.resize(10); // Resize by 10%
        System.out.println("After resizing: " + rectangle2);
    }
}
