
/* 
write a program
that reads characters from the keyboard. Have it convert all lowercase letters to uppercase,
and all uppercase letters to lowercase, displaying the result. Make no changes to any other
character. Have the program stop when the user enters a period. At the end, have the program
display the number of case changes that have taken place.

*/

public class SelfTestThree_LOWtoUP {
    public static void main(String[] args ) throws java.io.IOException {
        char c ; 
        int count = 0 ;

        do {
            c = (char) System.in.read() ;
            if ( c >= 97 && c <= 122 ) { // checks if character is Lowercase or not 
                c = (char) (c - 32) ; // then decrease 32 to make it Uppercase
                count++ ; // increase counter to denote case change
            }
            if ( c != '.') System.out.print(c ) ; // if first character enter is " . " then ignore 

        }while ( c != '.') ;

        System.out.println();
        System.out.println("Total changes :" + count) ;

    }    
}
