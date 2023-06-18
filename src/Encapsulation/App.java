package Encapsulation;

public class App {
    private String username;
    private int id;
    private String password;

    App(String username,int id,String password){
        this.username=username;
        this.id=id;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void display(){
        System.out.println("before changing the name is : "+this.username);
        System.out.println("before changing the id is : "+this.id);
        System.out.println("before changing the password is : "+this.password);
        System.out.println();
        System.out.println(".................................................");
    }
}

class Appdriver{
    public static void main(String[] args) {
        App a = new App("aditya",123,"kittu");
        a.display();
        //a.getUsername();
        a.setUsername("krishna");
        //a.getId();
        a.setPassword("prasad");
        a.setId(105);
        System.out.println();
        System.out.println("after changing the name is : "+a.getUsername());
        System.out.println("after changing the ID is : "+a.getId());
        System.out.println("after changing the name is : "+a.getPassword());


    }
}
