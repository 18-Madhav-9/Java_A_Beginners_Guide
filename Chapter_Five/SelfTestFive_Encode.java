// Expanding on the Encode cipher class, modify it so that it uses an eight-character string as the key



public class SelfTestFive_Encode {
    public static void main(String[] args ) {
        String message = "This is the message " ;
        String encoded = "" ;  
        String decoded = "" ;
        String key = "JavaJava" ;


        for (int i = 0 ; i < message.length() ; i++ ) {
            char keyChar = key.charAt(i % key.length()); // taking corresponding character of message with key ,if message longer than key then it will reapeat
            encoded += (char) (message.charAt(i) ^ keyChar);
        }
        
        System.out.println("Encoded: " +encoded);

        for ( int i = 0 ; i < message.length() ; i++ ) {
            char keyChar = key.charAt(i % key.length()); 
            decoded += (char) (encoded.charAt(i) ^ keyChar);
        }

        System.out.println("Decoded: " + decoded);

    }
}
