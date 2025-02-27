// Pass Objects as arguments  to class methods or methods

class Block{
    int a,b,c ;
    int volume ;
    Block(int x, int y ,int z ) {
        a = x; 
        b = y ;
        c = z ;
    }

    int  volume() {
        volume = a*b*c ;
        return volume ;
    }

    int sameBlock(Block ob) { // check if two blocks dimension are same , using other block as argument  
        if ( ob.a == a & ob.b == b & ob.c == c ){
            return 1 ;
        }
        else return 0 ;
    }
    
    int sameVolume(Block ob) { // check if two blocks volume is same , passing other block as argument
        if (ob.volume() == volume() ) {
            return 1;
        }
        else return 0 ;
    }


}

public class PassOb {
    public static void main(String[] args ) {
        Block one = new Block(1,2,3);
        Block two = new Block(3,2,1);
        
        if ( one.sameBlock(two) == 1 ) {
            System.out.println("Two blocks have same dimensions"); 
        }
        else {
            if ( one.sameVolume(two) == 1 ) {
                System.out.println(" Only Their Volume are equal ");
            }
            else {
                System.out.println(" Not same either dimension and volume ");
            }
        }

    }
    
}
