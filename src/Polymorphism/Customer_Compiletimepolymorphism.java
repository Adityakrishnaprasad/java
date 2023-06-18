package Polymorphism;

public class Customer_Compiletimepolymorphism {
    public static void main(String[] args) {
         Myntra_Compiletimepolymorphism m = new Myntra_Compiletimepolymorphism();
         System.out.println(".....the details of a product is .....");
           m.purchase("aditya");
           m.purchase(300);
           m.purchase("cellphone","flipkart");

    }
}


