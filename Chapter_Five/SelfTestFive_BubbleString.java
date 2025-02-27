// sort an array of string 

class Bubble_Two {

    void sort(String[] array , int size ) {
        for ( int i = 0 ; i < array.length ; i++ ) {
            for ( int j = 0 ; j < array.length-1 ; j++ ) {
                if ( array[j].compareTo(array[j+1] ) > 0 ) { // comapreTo compare string if next string is smaller then swap 
                    String temp = array[j] ;
                    array[j] = array[j+1];
                    array[j+1] = temp ;
                }
            } 
        }
    }

}

public class SelfTestFive_BubbleString {
    public static void main(String[] args) {
        Bubble_Two sort = new Bubble_Two();
        String array[] = {"hello" ,"world" ,"this" ,"A", "Bubble" ,"Sort"} ;
        sort.sort(array, 6); 
        for(String item: array) {
            System.out.print(item + " ");
        }
    }
}
