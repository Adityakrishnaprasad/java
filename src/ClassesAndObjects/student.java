package ClassesAndObjects;

public class student {
    String name;
    int age;
    double id;

    student(String name,int age,double id){
        this.name=name;
        this.age=age;
        this.id=id;
    }

    public void getdetails(){

        System.out.println("the name of the student is : " +name);
        System.out.println("the age of the student is : " +age);
        System.out.println("the id of the student is : " +id);

    }

}

class school{
    public static void main(String[] args) {
        student s = new student("aditya",24,1254);
        student s1 = new student("krishna",25,8645);
        s.getdetails();
        System.out.println("....................................");
        s1.getdetails();


    }
}