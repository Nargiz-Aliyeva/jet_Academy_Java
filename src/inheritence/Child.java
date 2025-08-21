package inheritence;

public class Child {
    // Overload
    public void ekranaYaz(){
        System.out.println("Hello i am Java");

    }
    public  void ekranaYaz(String name){
        System.out.println("welcome"+ name);
    }
    public void ekranaYaz(int age){
        System.out.println("my age"+age);
    }
    public void ekranaYaz(String lastName,String fatherName){
        System.out.println(lastName+" "+fatherName);
    }
}
