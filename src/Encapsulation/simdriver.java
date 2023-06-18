package Encapsulation;

public class simdriver {

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
