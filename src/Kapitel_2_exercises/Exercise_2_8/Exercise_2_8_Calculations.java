package Kapitel_2_exercises.Exercise_2_8;

import java.util.Scanner;

//TODO I dont know how to solve this yet

public class Exercise_2_8_Calculations {

    public static void ShowCurrentTime(){

        Scanner input = new Scanner(System.in);

        // Promt the user to enter Timezone

        System.out.println("Please enter Timezone");

        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        //Display result

    }
}
