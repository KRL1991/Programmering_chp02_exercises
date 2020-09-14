package Kapitel_2;

public class BeregnRektangel {

    // Lav en metode, der beregner arealet af en rektangel
    // Kald metoden fra din main med værdierne
    // l = 2 b = 3
    // l = 6 b = 12
    // Brug int

    // Vis resultaterne

    public static void main(String[] args) {

        System.out.println("Beregn arealet af en rektangel");

        System.out.println(" Arealet for rektangel 1 er "+ beregnAreal( 2, 3));
        System.out.println(" Arealet for rektangel 2 er "+ beregnAreal(6, 12));


    }

    public static int beregnAreal(int l, int b) {
        int areal = ( l * b );
        return areal;

    }
}
