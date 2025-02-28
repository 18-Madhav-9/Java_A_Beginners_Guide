// Method overriding.

class A {
    int i, j;
    A(int a, int b) {
    i = a;
    j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // display k – this overrides show() in A
    void show() {
        // use super to use the superclass method 
        super.show() ;
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String args[]) {
        B subOb = new B(1, 4, 3);
        subOb.show(); // this calls show() in B and super from A
    }
}