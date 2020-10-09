package Kapitel_2_exercises.Exercise_2_9;

import java.util.Scanner;
import java.lang.Math;

public class Exercise_2_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Promt the user to enter v0,v1 and t

        System.out.println(" Please enter v0 ");
        double v0 = input.nextDouble();

        System.out.println(" Please enter v1 ");
        double v1 = input.nextDouble();

        System.out.println(" Please enter t ");
        double t = input.nextDouble();

        double acceleration = ( (v1-v0 ) / t);

        //Display results
        System.out.print(" the average acceleration is " + acceleration);



    }

    public static void Acceleration(){

        Scanner input = new Scanner(System.in);

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double acceleration = ( (v0-v1 )/ (t));
    }

}
