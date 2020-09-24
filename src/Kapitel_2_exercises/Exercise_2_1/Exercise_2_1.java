package Kapitel_2_exercises.Exercise_2_1;
import java.util.Scanner; //Scanner Import

public class Exercise_2_1 {

    public static void main(String[] args) {

        System.out.println("Exercise 2.1");

        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Promt the user to enter a radius
        System.out.print(" Enter Miles ");
        double miles = input.nextDouble();

        //Compute miles
        double kilometers = miles * 1.6;

        //Display Result
        System.out.println(" Number of miles is "+ kilometers + (" Kilometers "));

    }
}

