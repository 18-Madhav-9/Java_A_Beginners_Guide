// method overloading using different version of same function


class Overload{
    
    void one() { // this method will be overloaded in other definitons of it
        System.out.println("Zero parameter") ;
    }

    void one(int x) { 
        System.out.println("one integer parameter : " + x ) ;
    }

    void one(double y) { 
        System.out.println("one double parameter : " + y) ;
    }

    void one(int x , double y ) { 
        System.out.println("one int and other double parameter  " + x +" , " + y ) ;
    }
    
}

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload(); 

        ob.one(); // this will call one without parameters
        ob.one(2); // this will call one with single int parameter
        ob.one(3.4566); // this will call one with double parameter
        ob.one(3,5.3434); //  this will call one with int and double parameter

    }    
}
