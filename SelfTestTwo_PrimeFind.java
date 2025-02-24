

public class SelfTestTwo_PrimeFind {
    public static void main(String[] args ) {

        for ( int i = 2 ; i <= 100 ; i ++) {
            int count = 0 ; 
            for ( int j = 1 ;  j <= i ; j++ ) {
                if ( i%j == 0 && count <= 2 ) {
                    count++ ;
                }
                else if (count >= 3) {
                    break ;
                }
            }
            if (count == 2 ) {
                System.out.println(i);
            }
        }

    }

}
