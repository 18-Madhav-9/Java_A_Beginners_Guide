// Queue(FIFO) = the element which goes first will be the first to get out 

class Queue {
    private char[] queue ; // storing charactors in queue with array
    private int size ;
    private int putloc , getloc ; // putloc is position where data is added and getloc is where data is removed

    Queue(int x ) {
        queue = new char[x] ;
        size = x ;
        putloc = getloc = 0 ;
    }

    void put(char data ) { // method to put values in queues
        if (putloc == queue.length ) { // check for full
            System.out.println("Queue is FULL !");
        }
        else {
            queue[putloc] = data ;//put data at putlocation and increment putlocation
            putloc++ ;
        }
    }

    char get() { // method to get first entered from queue
        if (getloc == putloc ) { // check if empty 
            System.out.println("Queue is Empty !");
            return (char) 0 ;
        }
        else {
            char data = queue[getloc] ; // get data from getloaction
            getloc++ ;                  // increment getlocation as it will point to next element entered after it 
            return data ; 
        }
    }


}

public class QDemo{
    public static void main(String[] args ) {
        Queue queue = new Queue(10) ;
        queue.put('A');
        queue.put('a');
        System.out.println(queue.get() );
        System.out.println(queue.get() );
        System.out.println(queue.get() );

    }
}