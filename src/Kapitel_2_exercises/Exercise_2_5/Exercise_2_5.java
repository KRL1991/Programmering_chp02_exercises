package Kapitel_2_exercises.Exercise_2_5;

import java.util.Scanner;

public class Exercise_2_5 {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner input = new Scanner(System.in);

        //Promt the user to enter subtotal
        System.out.println(" Enter subtotal ");

        double subtotal = input.nextDouble();

        System.out.println(" Enter gratuity ");

        double gratuity = input.nextDouble();

        //Compute subtotal and gratuity
        double totalgratuity = gratuity / 100 * subtotal;

        double totalsubtotal = subtotal + totalgratuity;


        //Display result

        System.out.println(totalgratuity+"$ is the gratuity " + " and "+ totalsubtotal+ "$ is subtotal you have to pay ");
    }
}
