package shape;

import java.util.Scanner;

public class Circle implements Shape {
    double radius = 0.0; // Changed to radius
    double area = 0.0;

    @Override
    public void printArea() {
        System.out.println("\nCircle");
        System.out.println("-------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius of Circle: ");
        this.radius = input.nextDouble();
        this.area = Math.PI * this.radius * this.radius;
        System.out.println("Area of the Circle is: " + this.area);
    }
}
