package org.launchcode;
import java.util.Scanner;

public class NumericTypes {

        public static void main(String [] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is the length of the rectangle?");
            int length = input.nextInt();
            System.out.println("What is the height of the rectangle?");
            int width = input.nextInt();
            int area = length * width;
            System.out.println("The area of the rectangle is " + area );
        }
    }

