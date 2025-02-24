// program that finds all of the prime numbers between 2 and 100.

public class SelfTestTwo_PrimeFind {
    public static void main(String[] args ) {

        for ( int i = 2 ; i <= 100 ; i ++) {
            int count = 0 ; 
            for ( int j = 1 ;  j <= i ; j++ ) { // inner loop will run from 1 to number 
                if ( i%j == 0 ) { // check if number is divided by numbers before it 
                    count++ ; // increment count
                }
                else if (count > 3) {
                    break ; // if number of divison counts > 2 break loop for unnnecessoy divisons
                }
            }
            if (count == 2 ) { // if number is exactly divided 2 times by itself and 1 
                System.out.println(i);
            }
        }

    }

}
