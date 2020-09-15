package Kapitel_2_exercises;

import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Exercise_2_2 {
    public static void main(String[] args) {
        System.out.println(triangle());

    }
    static String triangle(){
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter Length of the triangle ");
        double lenght = input.nextDouble();
        double area = (sqrt(3) / 4) * pow(lenght,2);
        double volumen = area * lenght;

        String output = ( " The area is: " +area + "\n" +" The volume of the Triangular prism is "+ volumen);

        return output;


    }





    }


