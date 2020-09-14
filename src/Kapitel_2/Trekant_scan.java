package Kapitel_2;
import java.util.Scanner;

public class Trekant_scan {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner input = new Scanner(System.in);


        //Promt the user to enter a radius
        System.out.print(" Enter a number for radius ");
        double radius = input.nextDouble();

        //Compute area
        double area = radius * radius * 3.14159;

        //Display result
        System.out.println(" The area for the circle of the radius "+ radius + " is "+area);

    }
}
