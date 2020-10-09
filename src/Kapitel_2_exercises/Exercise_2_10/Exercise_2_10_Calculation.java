package Kapitel_2_exercises.Exercise_2_10;

import java.util.Scanner;

public class Exercise_2_10_Calculation {

    public static void energyCalculations() {


        Scanner input = new Scanner(System.in);

        //Promt the user to enter water in kilograms, the initial temperature, final temperature

        System.out.println(" Enter Water in Kilograms ");
        double M = input.nextDouble();

        System.out.println(" Enter Initial Temperature");
        double initialTemp = input.nextDouble();

        System.out.println(" Enter Final Temperature");
        double finalTemp = input.nextDouble();

        //Compute result

        double Q = M * (finalTemp - initialTemp) * 4184;

        System.out.println(" The Energy Needed is " + Q + " Joules");
    }
}
