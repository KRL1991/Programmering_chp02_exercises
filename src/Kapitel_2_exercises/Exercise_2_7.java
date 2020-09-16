package Kapitel_2_exercises;
import java.util.Scanner;

public class Exercise_2_7 {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Promt the user to enter number of minutes
        System.out.println(" Enter minutes ");

        int minutes = input.nextInt();

        //Compute subtotal and gratuity

        int years = minutes / 525600;
        int remaningMinutes = minutes % 525600;
        int days = remaningMinutes / 1400;

        //Display result

        System.out.println( minutes+ " minutes approximatly "+years+ " years and "+days+ " days ");


    }



}
