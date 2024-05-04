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

public class GetPolygonArea {
    private double area;

    public double squareArea(double side) {
        this.area = side * side;
        return area;
    }

    public double rectangleArea(double length, double width) {
        this.area = length * width;
        return area;
    }

    public double triangleArea(double base, double height) {
        this.area = 0.5 * base * height;
        return area;
    }

    public double circleArea(double radius) {
        this.area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        GetPolygonArea result = new GetPolygonArea();

        double squareArea = result.squareArea(5);
        double rectangleArea = result.rectangleArea(4, 6);
        double triangleArea = result.triangleArea(3, 4);
        double circleArea = result.circleArea(7);

        System.out.println("Area of the square: " + squareArea);
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Area of the triangle: " + triangleArea);
        System.out.println("Area of the circle: " + circleArea);
    }
}