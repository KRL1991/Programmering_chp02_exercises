package Kapitel_2_exercises;

import java.util.Scanner;

public class Exercise_2_4 {

    public static void main(String[] args) {
        //Create Scanner object
        Scanner input = new Scanner(System.in);


        //Promt the user to enter square meters
        System.out.print(" Ente square meter ");
        double squaremeters = input.nextDouble();

        //Compute area
        double ping  = ( squaremeters * 0.3025);

        //Display result
        System.out.println(squaremeters+ " squaremeters is " +ping + " ping " );
    }

    }
