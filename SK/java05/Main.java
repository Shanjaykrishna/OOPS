import shape.Rectangle;
import shape.shape;
import shape.Triangle;
import shape.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Finding Area");
            System.out.println("************");
            System.out.println("\n1. Rectangle" + "\n2. Triangle" + "\n3. Circle" + "\n4. Exit" + "\n\nEnter your choice: ");
            choice = userInput.nextInt();

            switch (choice) {
                case 1:
                    shape rectangle = new Rectangle();
                    rectangle.printArea();
                    break;
                case 2:
                    shape triangle = new Triangle();
                    triangle.printArea();
                    break;
                case 3:
                    shape circle = new Circle();
                    circle.printArea();
                    break;
                case 4:
                    System.out.println("\n\nThank You !!!");
                    break;
                default:
                    System.out.println("Please enter valid input");
                    break;
            }
        } while (choice != 4);
        
        userInput.close();
    }
}
