
public class LogicalOpTable {
    public static void main(String[]  args) {
        boolean p = true ,q = true;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT") ;
        System.out.println(p+"\t"+q +"\t"+ (p&q) + "\t"+ (p|q) +"\t"+ (p^q) +"\t"+ (!p) ) ;

        q = !q ; // changing q to  false
        System.out.println(p+"\t"+q +"\t"+ (p&q) + "\t"+ (p|q) +"\t"+ (p^q) +"\t"+ (!p) ) ;
        
        p = !p ; // changing p to false
        System.out.println(p+"\t"+q +"\t"+ (p&q) + "\t"+ (p|q) +"\t"+ (p^q) +"\t"+ (!p) ) ;

        q = !q ; // changing q to true
        System.out.println(p+"\t"+q +"\t"+ (p&q) + "\t"+ (p|q) +"\t"+ (p^q) +"\t"+ (!p) ) ;
        
    }    
}
