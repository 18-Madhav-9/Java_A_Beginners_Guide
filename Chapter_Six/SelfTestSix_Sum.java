// . varargs method called sum( ) that sums the int values passed to it

public class SelfTestSix_Sum {

    static int sum (int ... v) { // vargs of type int method to return sum of its argument passed
        int s = 0 ;
        for ( int i = 0 ; i < v.length ; i++ ) {
            s += v[i] ;
        }
        return s ;
    }

    public static void main(String[] args) {
        int s = sum (1,2,3,4,5,6,6,7,8,39,293) ;
        System.out.println("the sum is  : " + s) ;

        s = sum() ;
        System.out.println("the sum is  : " +s) ;

    }
    
}
