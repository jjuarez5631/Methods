package com.example.java;
import java.util.Scanner;


public class Main {
    int area;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int shapeSelected = 0;
        int inputLength, inputWidth, inputHeight, inputBase, inputRadius, inputArea;

            //welcome user and ask to choose a shape.
        System.out.println("Welcome!");
        System.out.println("Area Calculation! Please select a shape:");
            //while loop to verify the inputs for invalid, shape selection, or exit program.
        do {
            //display each of the options available
            System.out.println("1.Square");
            System.out.println("2.Parallelogram");
            System.out.println("3.Circle");
            System.out.println("4.Triangle");
            System.out.println("0.Exit");
            //get shape input from the user
            shapeSelected = input.nextInt();

            //switch case will display user selection, ask for shape details, then call a method.
            switch (shapeSelected) {
                case 0:
                    System.out.println("Have a nice day!");
                    break;
                case 1:
                    System.out.println("Square!");
                    System.out.println("Enter the length of a side: ");
                    inputLength = input.nextInt();

                    square(inputLength);
                    break;
                case 2:
                    System.out.println("Parallelogram");
                    System.out.println("Enter the base length: ");
                    inputLength = input.nextInt();
                    System.out.println("Enter the height: ");
                    inputHeight = input.nextInt();

                    parallelogram(inputLength, inputHeight);
                    break;
                case 3:
                    System.out.println("Circle!");
                    System.out.println("Enter the radius: ");
                    inputRadius = input.nextInt();

                    circle(inputRadius);
                    break;
                case 4:
                    System.out.println("Triangle!");
                    System.out.println("Enter the base length: ");
                    inputLength = input.nextInt();
                    System.out.println("Enter the height: ");
                    inputHeight = input.nextInt();

                    triangle(inputLength, inputHeight);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    System.out.println("");
            }
        }while (shapeSelected != 0);
    }
        //methods for each type of shape and their formulas
    public static void square(int length){
        int area;
        area = length * length;
        System.out.println("Area of Triangle: " + area);
        System.out.println("");
    }

    public static void parallelogram(int base, int height){
        int area;
        area = base * height;
        System.out.println("Area of parallelogram: " + area);
        System.out.println("");
    }

    public static void circle(double radius){
        double area;
        area = 3.14 * (radius * radius);
        System.out.println("Area of Circle: " + area);
        System.out.println("");
    }

    public static void triangle(int base, int height){
        double area;
        area = .5 * base * height;
        System.out.println("Area of Triangle: " + area);
        System.out.println("");
    }


}
