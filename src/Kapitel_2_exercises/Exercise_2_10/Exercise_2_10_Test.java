package Kapitel_2_exercises.Exercise_2_10;

import java.util.Scanner;

public class Exercise_2_10_Test {
    public static void main(String[] args) {

        // Test 1
        // M = 55,5
        // initialTemp = 3,5
        // finalTemp = 10,5
        //Expected = 1625484,0
        //Pass

        // Test 2
        // M = 50
        // initialTemp = 5
        // finalTemp = 12
        //Expected = 1464400
        //Pass

        // Test 3
        // M = 75
        // initialTemp = 6
        // finalTemp = 20
        //Expected = 4.393.20
        //Pass

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