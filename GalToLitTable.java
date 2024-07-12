/*
 * Conversion Table of Gallon To liter
 *  1 Gallon = 3.7854
*/


public class GalToLitTable {
    public static void main (String[] args) {
        double gal , lit ;
        int counter ;
        counter = 0 ;

        for ( gal = 0 ; gal <= 200  ; gal += 10 ) {
            lit = gal * 3.7854 ;
            System.out.println(gal + " gallons ->  " + lit + " liters ") ;
            counter++ ;
            // Print b;ank line after 10 count 
            if (counter == 10 ) {
                System.out.println() ;
            }
        }

        
    }
}