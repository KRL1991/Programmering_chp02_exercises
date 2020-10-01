package Kapitel_2_exercises.Exercise_2_3;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) {

        System.out.print(" Enter meters ");

        //Create Scanner object
        Scanner input = new Scanner(System.in);
        double meters = input.nextDouble();

        System.out.println(meters+" meters is " + Exercise_2_3.FeetToMeters(meters) + " feet " );

    }
}
