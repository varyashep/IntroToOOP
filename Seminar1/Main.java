package Seminar1;

public class Main {
    public static void main(String[] args) {

        HotBeverageVending vending = new HotBeverageVending();

        HotBeverage product1 = new Tea("Tea", 100, 1L, 100, 250);
        HotBeverage product2 = new Coffee("Coffee", 300, 2L, 60, 350);

        vending.addProduct(product1);
        vending.addProduct(product2);

        System.out.println(vending.getProduct("Tea", 250, 100));
        System.out.println(vending.getProduct("Coffee", 350, 60));
    }
}