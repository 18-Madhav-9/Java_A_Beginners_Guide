// short-circuit AND can be used to prevent a divide-by-zero error

public class SelfTestTwo_ShortCircuitAND {
    public static void main(String[] args ) {
        int a , b ;
        a = 2 ;
        b = 1 ;
        if ( b !=0 &&  a/b > 0 ) {
            System.out.println( a/b );
        }
        else {
            System.out.println("Short-circuit Condition False") ;
        }
    }
}
