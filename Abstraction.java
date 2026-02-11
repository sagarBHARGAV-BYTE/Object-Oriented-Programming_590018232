abstract class Sample {
    int var1 = 10;
    abstract void printinfo();
    void display() {
        System.out.println("Abstract class");
    }
}

class Demo extends Sample {
    void printinfo() {
        super.display();
        System.out.println("extend abstract function");
    }
}

public class Abstraction {
    public static void main(String[] args) { 
        Demo b= new Demo();
        System.out.println("Value of var1: " + b.var1);
        b.printinfo();
    }
}
