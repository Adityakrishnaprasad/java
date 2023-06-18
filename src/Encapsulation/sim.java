package Encapsulation;

public class sim {
    private long simnumber;
    private String simprovider;
    private double balance;
     sim(long simnumber, String simprovider, double balance){
         this.simnumber=simnumber;
         this.simprovider=simprovider;
         this.balance=balance;
     }
     public double getsimnumber(){
         return simnumber;
     }

    public void setSimnumber(long simnumber) {
        this.simnumber = simnumber;
    }
    public String getSimprovider(){
         return simprovider;
    }

    public void setSimprovider(String simprovider) {
        this.simprovider = simprovider;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void info(){
         System.out.println("the simnumber is : " +this.simnumber);
         System.out.println("the simprovider is : " +this.simprovider);
         System.out.println("the balance is : "+this.balance);
    }
    public static void main(String[] args) {
        sim s = new sim(8555028720l,"jio",123);
        System.out.println("....before updating....");
        s.info();
        s.setSimprovider("airtel");
        s.setBalance(556);
        s.setSimnumber(81067585737l);
        System.out.println();
        System.out.println("....after updating....");
        s.info();






    }
}
