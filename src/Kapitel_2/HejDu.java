package Kapitel_2;
import java.util.Scanner;
public class HejDu {

    public static void main(String[] args) {

        // Scanner input = new Scanner (System.in); og import java.util.Scanner for at bruge scanneren

        Scanner input = new Scanner (System.in);

        System.out.println("Skriv dit navn");

        String navn = input.next();

        System.out.println(" Hej "+ navn + " ! ");


    }
}
