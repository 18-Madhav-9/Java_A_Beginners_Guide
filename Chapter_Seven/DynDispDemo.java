// how dynamic dispatch works in java at run time to which method to call

class  Sup{
    void who() {
        System.out.println("this is the superclass") ;
    }
}

class Sub1 extends Sup {
    void who() {
        System.out.println("this is the subclass 1") ;
    }
}

class Sub2 extends Sup {
    void who() {
        System.out.println("this is the subclass 2") ;
    }
}

public class DynDispDemo {
    public static void main(String[] args ) {
        Sup sup = new Sup() ;
        Sub1 sub1 = new Sub1() ;
        Sub2 sub2 = new Sub2() ;

        // it the superclass reference varible 
        Sup refer  ;

        
        refer = sup ;
        // it will call that method at run-time to  which OBJECT , the reference variable to
        refer.who() ; // in this case reference variable refer to object of superclass

        refer = sub1 ;
        // it will call that method at run-time to  which OBJECT , the reference variable to
        refer.who() ; // in this case reference variable refer to object of subclass 1

        refer = sub2 ;
        // it will call that method at run-time to  which OBJECT , the reference variable to
        refer.who() ; // in this case reference variable refer to object of subclass 2


    }
    
}
