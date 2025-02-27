// new version of queue with overloaded constructor to create queue in different type of situations

class Queue2 {
    private char[] queue ;
    private int putloc , getloc ;

    Queue2(int size) { // creating empty queue 
        queue = new char[size] ;
        putloc = getloc = 0 ;
    }
    
    Queue2(char[] c) { // overloading constructor from an array 
        putloc = 0 ;
        getloc = 0 ;
        queue = new char[c.length] ;
        for ( int i = 0 ; i < c.length ; i++ ) {
            put(c[i]) ;
        }

    }

    Queue2(Queue2 ob ) { // overloading constructor to initialize it with other queue object
        putloc = ob.putloc ;
        getloc = ob.getloc ;
        queue = new char[ob.queue.length] ;
        for ( int i = getloc ; i < putloc ; i++ ) {
            queue[i] = ob.queue[i];
        }
    }

    void put(char data ) {
        if ( putloc == queue.length ) {
            System.out.println("Queue is full ");
            return ;
        }
        queue[putloc] = data ;
        putloc++ ;
    }

    char get() {
        if ( putloc == getloc ) {
            System.out.println("Queue is Empty ") ;
            return (char) 0 ;
        }
        else {
            char data = queue[getloc] ;
            getloc++;
            return data;
        }

    }


}

public class QDemo2 {
    public static void main(String[] args ) {
        Queue2 a = new Queue2(5) ; //creating empty queue 
        a.put('2');
        a.put('a');

        char[] array = {'a','b','d','A','D','e'} ;

        Queue2 b = new Queue2(array) ; //  creating from an array
        Queue2 c = new Queue2(b) ; // creating from other object 
        
        System.out.println(c.get()) ;

        

    }
}
