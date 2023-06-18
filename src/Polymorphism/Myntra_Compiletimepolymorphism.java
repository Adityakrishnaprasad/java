package Polymorphism;

public class Myntra_Compiletimepolymorphism {
    String productname;
    String ecommercename;
    int price;
    String dealername;

    public Myntra_Compiletimepolymorphism() {
        this.productname = productname;
    }

    void purchase(String productname, String ecommercename){
      System.out.println("the product name is :"+productname);
        System.out.println("the website name is :"+ecommercename);
    }

    void purchase(int price){
        System.out.println("product's price is :"+price);

    }
    void purchase(String dealername){
        System.out.println("dealer's name is :"+dealername);
    }

}
