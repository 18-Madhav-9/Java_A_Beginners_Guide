// recursive method to reverse the string 

public class SelfTestSix_StringRecur {
    
    static String reverseString(String s , int l ) {
        if ( l < 0 ) {
            return "" ; 
        }
        return  s.charAt(l) + reverseString( s , l-1 ) ; // recursive call
    }

    public static void main(String[] args) {
        String s = "HelloWorld" ;
        String j = reverseString( s, s.length()-1 ) ;

        System.out.println( "After reverse : " +j);

    }
}