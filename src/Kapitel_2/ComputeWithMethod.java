package Kapitel_2;

public class ComputeWithMethod {
    public static void main(String[] args) {

        //kontaknering
        String beregningsType = "areal";
        System.out.println(" Beregner areal med meotder ");

        System.out.println(" Arealet for radius 1 er "+ beregnArea(2) );
        System.out.println(" Arealet for radius 2 er "+ beregnArea(5) );
        System.out.println(" Arealet for radius 3 er "+ beregnArea(7) );


    }

    public static double beregnArea(double radius) {
        double areal = radius * radius * Math.PI;
        return areal;


    }

}
