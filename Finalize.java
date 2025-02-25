class FinalizeDemo{
    int x ;
    FinalizeDemo(int i ) {
        x = i ;
    }

    protected void finalize() {
        System.out.println("this object is destroyed " + x ); //  this will run after object grabage collection
    }
    void generator(int i ) {
        @SuppressWarnings("unused")
        FinalizeDemo f = new FinalizeDemo(i) ;
    }

}


public class Finalize {
    public static void main(String[] args) {
        
        FinalizeDemo a = new FinalizeDemo(0) ;
        for ( int i = 0 ; i < 1000000 ; i++) { // generate large number of object at somepoint Garbagecollector will run up
            a.generator(i) ;
            System.out.println(i);
        }

    }    
}
