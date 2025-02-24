import java.io.IOException;

public class Help {
    public static void main(String[] args)  throws IOException {
        char choice ;
        System.out.println( " Help On " ) ;
        System.out.println(" 1. If ") ;
        System.out.println(" 2. Switch ") ;
        System.out.println(" Choose One ") ;  

        choice = (char) System.in.read() ;
        System.out.println() ;

        switch ( choice ) {
            case '1' : {
                System.out.println( " The if :") ;
                System.out.println("if (condition) statement ;") ;
                System.out.println("else statement ;") ;
                break; 
            }
            case '2' : {
                System.out.println("the switch :") ;
                System.out.println("switch (expression) {") ;
                System.out.println("  case Constant :") ;
                System.out.println("     statement sequence ") ;
                System.out.println("     break ") ;
                System.out.println("   default : statement ") ;
                System.out.println("} ") ;
                break ;
            }
            default : {
                System.out.println("Wrong choice ") ;
            }

        }

    }
}
