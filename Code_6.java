class Car {
    int n;

    void setPrice(int price) {
        this.n=price;
    }
}

class Bmw extends Car {

    void updatePrice(int newPrice) {
        super.n=newPrice;
    }
}

public class Code_6{
    public static void main(String[] args) {
        Bmw b=new Bmw();
        b.setPrice(500000000);
        System.out.println("initialise: " + b.n);
        b.updatePrice(800000000);
        System.out.println("Updated: " + b.n);
    }
}