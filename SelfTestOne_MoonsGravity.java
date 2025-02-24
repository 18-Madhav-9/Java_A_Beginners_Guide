public class SelfTestOne_MoonsGravity {
    public static void main(String[] args ) {
        
        double earthGravity = 9.8 ; // Earth gravity is 9.8g or 9.8 ms^-2

        double moonGravity =  (double) 17/100 * earthGravity  ; //Moon is 17 percent of that Earth 
        
        double weightEarth = 100 ; // Let weaght on Earth 100 units
        // weight = m*g 
        // mass is same in both cases ,therefore m = weight on earth / earth gravity
        // weight on moon = m * gravity on moon
        
        System.out.println( "Weight on Moon = " + (( weightEarth/earthGravity) * moonGravity ) + "units" );

    }    
}
