// changing the value of original object using pass by reference

class Test {
    int a,b ;

    Test(int x, int y ) {
        a = x ;
        b = y ;
    }

    void changeRef(Test ob) { // orginal value of objectwhich is passed get changed , PASS BY REFERANCE
        ob.a = 2*a ;
        ob.b = -b ;
    }

}

public class PassObRef {
    public static void main(String[] args ) {
        Test ob = new Test(1,2) ;
        System.out.println("Value Before : a = " + ob.a + " b = " + ob.b) ; 

        ob.changeRef(ob) ; // passing the object to itself 
        System.out.println("Value after : a = " + ob.a + " b = " + ob.b) ;


    }
    
}
