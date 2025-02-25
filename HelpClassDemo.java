import java.io.IOException;

class HelpClass {
    void HelpOn(int what) {
        switch (what) {
            case '1':
                System.out.println(" The IF : ");
                System.out.println("if (condition) statement ");
                System.out.println("else statement ;");
                break;
            case '2':
                System.out.println(" The SWITCH : ");
                System.out.println("switch (variable) {");
                System.out.println("    case (literal) : Statement ;");
                System.out.println("        break ;");
                System.out.println("    default statement break ");
                System.out.println("} ");
                break;
            case '3':
                System.out.println(" The FOR : ");
                System.out.println("for(init ;condit;iter) { ");
                System.out.println("      statement sequence ;");
                System.out.println("} ");   
                break;
            case '4':
                System.out.println(" The While : ");
                System.out.println("while(condition){ ");
                System.out.println("    statement sequence ;");
                System.out.println("} ");
                break;
            case '5':
                System.out.println(" The do-while : ");
                System.out.println("do { ");
                System.out.println("    statement sequence ;");
                System.out.println("}while (condition) ; ");
                break; 
            case '6':
                System.out.println(" The break : ");
                System.out.println("break ;");
                break;
            case '7':
                System.out.println(" The Continue : ");
                System.out.println("continue ;");
                break;
        }
        
    }
    
    void ShowMenu() {
        System.out.println("Help On:");
        System.out.println("1. if ") ;
        System.out.println("2. switch ") ;
        System.out.println("3. for ") ;
        System.out.println("4. while ") ;
        System.out.println("5. do while ") ;
        System.out.println("6. break ") ;
        System.out.println("7. continue ") ;
        System.out.println("q. quit help");
    }

    boolean isValid(char q) {
        if ( q < '1' | q > '7' & q != 'q') return false ;
        else return true ;
    }
    
}


public class HelpClassDemo {
    public static void main(String[] args ) throws IOException {
        char choice ,ignore ;
        HelpClass help = new HelpClass() ;
        
        while (true) {
            do {
                help.ShowMenu();
                choice = (char) System.in.read() ;
                do {
                    ignore = (char) System.in.read();
                }while (ignore != '\n') ;

                help.HelpOn(choice);

            }while ( !help.isValid(choice) ) ;
            
            if ( choice == 'q' ) break ; 
            System.out.println();

        }
    }
    
}
