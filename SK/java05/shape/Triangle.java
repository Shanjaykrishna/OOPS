package shape;

import java.util.Scanner;

public class Triangle implements Shape {
    double length = 0.0;
    double height = 0.0; // Corrected spelling of "height"
    double area = 0.0;

    @Override
    public void printArea() {
        System.out.println("\nTriangle");
        System.out.println("---------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base of Triangle: "); // Changed "Length" to "Base"
        this.length = input.nextDouble();
        System.out.println("Enter Height of Triangle: ");
        this.height = input.nextDouble();
        this.area = 0.5 * this.length * this.height;
        System.out.println("Area of the Triangle is: " + this.area);
    }
}
