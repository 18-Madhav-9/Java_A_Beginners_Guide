// using of variabe argument feature java [ ... ] 

public class VarArgs {
    
    static void vaTest(int ... v) { // method with varible argument of type integer
        for ( int i = 0 ; i < v.length ; i++ ) { 
            System.out.println("Argument : " + v[i] ) ;
        }
        System.out.println("Argument Ended :");
    }

    public static void main(String[] args ) {
        // calling with different number of argument
        vaTest() ;
        vaTest(1,2) ;
        vaTest(1,2,3) ;
        vaTest(1,2,3,4) ;

    }
}
