package Variabler;

	// byte	Stores whole numbers from -128 to 127
    //    short	2 bytes	Stores whole numbers from -32,768 to 32,767
    //    int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
    //    long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    //    float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    //    double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
    //    boolean	1 bit	Stores true or false values
    //    char	2 bytes	Stores a single character/letter or ASCII values



public class Opgaver_variabler {

    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        System.out.println("x + y is " + (x + y) );

    }
}

class Double{

    public static void main(String[] args) {

        double x = 50.00;
        double y = 100.00;

        System.out.println(" x + y is "+ (x + y));

    }
}

class Float{

    public static void main(String[] args) {
        // Not really usefull here

    }
}

class Long{

    public static void main(String[] args) {

        long x = 15500000;
        long y = 25000000;

        System.out.println(" x + y is " +( x+y ) );
    }
}

class Boolean{

    public static void main(String[] args) {
        int first;
        int second;

        first = 150;
        second = 130;

        if ( first > second )
            System.out.println( true );
        else
            System.out.println( false );

    }

}



