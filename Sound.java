/*
 * how far away a listener from lightning strike
 * speed of sound is 343 m/s
*/


public class Sound {
    public static void main(String[] args) {
        double distance , time_taken ;
        int sound_speed = 343 ; 
        time_taken  = 7.2 ;
        distance = time_taken * sound_speed ;

        System.out.println("the ligtning is " + distance + " meters away ") ;
    }
}