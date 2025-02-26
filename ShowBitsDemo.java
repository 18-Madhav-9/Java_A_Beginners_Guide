// Display in binary the bit-pattern of any integer value

class ShowBits{
    int numbits ;
    ShowBits(int x ) {
        numbits = x ; // numbits specify how many bits to shows from right to left
    }

    void show(long val) {
        long mask = 1 ; 
        mask <<= numbits-1 ; // mask will shift or set 1 to no. of left most till which we want to show
        
        int spacer = 0 ; // it will add space after 8 bits 
        for (; mask!= 0 ; mask >>>= 1){ // it will start from msb of mask  run until mask lsb does not become 0 by zero-fill shift
            if ((val&mask) !=0 ) System.out.print("1") ; // if value msb bit and mask bit are 1 then it will print 1 
            else System.out.print("0"); // it will print 0 for bit if mask and val are different or zero
            spacer++ ;
            if ( spacer%8 == 0 ) { // it will check for space, if divisble by 8 then put space after 8 bits 
                System.out.print(" ") ;
                spacer = 0 ; // make space zero again
            } 
        }
        System.out.println();

    }
}

public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits show = new ShowBits(8);
        show.show(8);

    }    
}
