package com.step;

import java.util.Scanner;

public class GeometricCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        System.out.println("Set the color for the square: ");
        square.setColor(sc.nextLine());
        System.out.println("Set the side length of the square: ");
        square.setSide(sc.nextDouble());
        System.out.println("The square's perimeter = " + square.getPerimeter());
        System.out.println("The square's surface = " + square.getSurface());
        System.out.println("The square's color = " + square.getColor());

        System.out.println();
        sc.nextLine();
        System.out.println("Set the color for the rectangle: ");
        rectangle.setColor(sc.nextLine());
        System.out.println("Set the width for the rectangle: ");
        double width = sc.nextDouble();
        rectangle.setWidth(width);
        System.out.println("Set the length for the rectangle: ");
        double length = sc.nextDouble();
        rectangle.setLength(length);
        System.out.println("Rectangle's perimeter = " + rectangle.getPerimeter());
        System.out.println("Rectangle's surface = " + rectangle.getSurface());
        System.out.println("Rectangle's color = " + rectangle.getColor());

        System.out.println();
        sc.nextLine();
        System.out.println("Set the color for the circle: ");
        circle.setColor(sc.nextLine());
        System.out.println("Set the radius for the circle: ");
        double radius = sc.nextDouble();
        circle.setRadius(radius);
        System.out.println("Circle's length = " + circle.getPerimeter());
        System.out.println("Circle's surface = " + circle.getSurface());
        System.out.println("Circle's color = " + circle.getColor());
    }
}
