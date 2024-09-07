package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius;

        do {
            System.out.println("What is the radius? ");
        }
        while (!input.hasNextDouble());
        do {
            System.out.println("Sorry, the radius must be a positive number!!!!!!!!!!");
            input.next();
        radius = input.nextDouble();
    } while (radius< 0);

    double area = Circle.getArea(radius);
        System.out.println("The area of the circle is "+area);
        input.close();
}

