public class Bubble {
    public static void main(String[] args ) {
        int array[] = {3,4,6,1,62,0,2,6} ;

        for ( int i = 0 ; i < array.length ;  i++) { // No of passes 
            for ( int j = 0 ; j < array.length-1 ; j++ ) { 
                if ( array[j] > array[j+1] ) { // bubble the smaller element to left side 
                    int temp = array[j+1] ;
                    array[j+1] = array[j] ;
                    array[j] = temp ;
                }
            }
        }

        for (int item : array) {
            System.out.println(item);
        }
    }
}
