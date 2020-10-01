package Kapitel_2_exercises.Exercise_2_8;

import java.util.Scanner;

import static Kapitel_2_exercises.Exercise_2_8.Exercise_2_8.*;

public class UI {

    public static void main(String[] args) {

        //Promt the user to enter GMT
        System.out.println("Please enter time zone offset to GMT");

        //Create Scanner object
        Scanner input = new Scanner(System.in);

        double currentHour = input.nextDouble();
        double currentMinute = input.nextDouble();
        double currentSecond = input.nextDouble();



        //Display results

        System.out.println("Current time is " + currentHour + currentMinute + currentSecond );
    }
}
