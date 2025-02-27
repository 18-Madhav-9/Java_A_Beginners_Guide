// Stack (LIFO) - data which is inseted at last will come out first ,data get inserted at last and it is taken from last 

class Stack {
    private char[] stack ;
    private int last ;

    Stack(int size) {
        stack = new char[size] ;
        last = 0 ;
    }

    void push(char data) {
        if (last == stack.length ) {
            System.out.println("stack is full !");
            return ;
        }
        stack[last] = data ;
        last++ ;

    }

    char pop() {
        if ( last == 0 ) {
            System.out.println("Stack is empty !" );
            return (char) 0 ;
        }
        char data = stack[last-1] ;
        last-- ;
        return data ;
    }
}

public class SelfTestSix_Stack {
    public static void main(String[] args) {
        Stack s = new Stack(5) ;
        s.push('0');
        char x = s.pop() ;
        System.out.println( x ) ;
        System.out.println( s.pop() ) ;
        s.push('0');
        s.push('0');
        s.push('0');
        s.push('0');
        s.push('0');


    }
}

