package Kapitel_2_exercises;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Exercise_2_3 {

    public static void main(String[] args) {
        //Create Scanner object
        Scanner input = new Scanner(System.in);


        //Promt the user to enter meters
        System.out.print(" Enter meters ");
        double meters = input.nextDouble();

        //Compute area
        double feettometers = ( meters * 3.2786);

        //Display result
        System.out.println(meters+" meters is "+feettometers+ " feet " );
    }


    }