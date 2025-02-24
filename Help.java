import java.io.IOException;

public class Help {
    public static void main(String[] args)  throws IOException {
        char choice ,ignore ;
        while (true) {
            do {
                System.out.println();
                System.out.println( " Help On " ) ;
                System.out.println(" 1. If ") ;
                System.out.println(" 2. Switch ") ;
                System.out.println(" 3. for ") ;
                System.out.println(" 4. while ") ;
                System.out.println(" 5. Do while ") ;
                System.out.println(" q. for quiting ");
                System.out.println(" Choose One ") ;  

                choice = (char) System.in.read() ;
                do {
                    ignore = (char) System.in.read() ; // reading the other characters in buffer to a waste varible 
                }
                while (ignore != '\n') ; // reading until new line if new line buffer is already read 

            }while ( choice < '1' | choice > '5' ) ; // if choice is greater than 5 or lower than 5 , do not stop loop 
            
            if ( choice == 'q' ) break ; // if choice is quit then break the infinite loop  

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
                    System.out.println("  default : statement ") ;
                    System.out.println("} ") ;
                    break ;
                }
                case '3' : {
                    System.out.println( " The for :") ;
                    System.out.println("for ( initialization ; condition ; iteration ) statement ;") ;
                    break; 
                }
                case '4' : {
                    System.out.println( " The while  :") ;
                    System.out.println("while (condition) statement ;") ;
                    break; 
                }
                case '5' : {
                    System.out.println( " The do-while :") ;
                    System.out.println("do { Statement sequence  ") ;
                    System.out.println(" }while(condition) ;") ;
                    break; 
                }
                default : {
                    System.out.println("Wrong choice ") ;
                }
            }
        }
    }
}
