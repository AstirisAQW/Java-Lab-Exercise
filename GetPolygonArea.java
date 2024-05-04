/* 
  User defined Function: Return Value
  1.Create a program compute the area of the following polygons and circle using OOP.
    Area of square given the side.
    Area of rectangle given the length and width.
    Area of triangle given the base and height.
    Area of circle given the radius.
  All methods must be have a returning value.
*/
  
import java.util.*;

class Polygon{
    public double squareArea(double side) {
        return side * side;
    }

    public double rectangleArea(double length, double width) {
        return length * width;
    }

    public double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class GetPolygonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Polygon result = new Polygon();

        System.out.println("Choose a Polygon\n1. Square\n2. Rectangle\n3. Triangle\n4. Circle");
        System.out.print("Enter Choice: ");
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.print("\nPolygon: Square");
                System.out.print("\nside = ");
                double side = scanner.nextDouble();
                System.out.println("The area of the square is: " + result.squareArea(side));
                break;
            case 2:
                System.out.print("\nPolygon: Rectangle");
                System.out.print("\nlength: ");
                double rectangleLength = scanner.nextDouble();
                System.out.print("height: ");
                double rectangleHeight = scanner.nextDouble();
                System.out.println("The area of the rectangle is: " +  result.rectangleArea(rectangleLength, rectangleHeight));
                break;
            case 3:
                System.out.print("\nPolygon: Triangle");
                System.out.print("\nbase: ");
                double triangleBase = scanner.nextDouble();
                System.out.print("height: ");
                double triangleHeight = scanner.nextDouble();
                System.out.println("The area of the triangle is: " + result.triangleArea(triangleBase, triangleHeight));
                break;
            case 4:
                System.out.print("\nPolygon: Circle");
                System.out.print("\nradius: ");
                double radius = scanner.nextDouble();
                System.out.println("The area of the circle is: " + result.circleArea(radius));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        scanner.close();
    }
}
