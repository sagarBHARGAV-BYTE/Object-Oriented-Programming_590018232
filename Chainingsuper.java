class A {
    A() {
        System.out.println("class A constructor");
    }
}

class B extends A {
    B() {
        super(super());
        System.out.println("Class B Constructor");
    }
}

public class Chainingsuper{
    public static void main(String[] args) {
        B obj=new B();
    }
}
