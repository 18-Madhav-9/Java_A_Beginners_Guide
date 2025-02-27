/* 
prints a conversion table of inches to meters. Display 12 feet
of conversions, inch by inch. Output a blank line every 12 inches.
(One meter equals
approximately 39.37 inches.)
*/

public class SelfTestOne_InToMtr {
    public static void main(String[] args ) {
        
        double feet ;
        double inch  ;
        double meters = 0 ; 
        int total_inch = 0 ;

        for ( feet = 1 ; feet <=12 ; feet++ ) {
            for ( inch = 1 ; inch <= 12 ; inch++ ) { // 1 feet = 12 inches 
                total_inch++ ; // increment the total inches upto 144 inch ( as 12 feet)
                meters += 1/39.37 ;   // 1 inch = 1/39.37 meters  

                System.out.print(total_inch + "\' = ") ;
                System.out.printf("%.2fm\n",meters) ;
                
            }
            System.out.println() ; // Blacnk line After Every Feet
        }

    }    
}
