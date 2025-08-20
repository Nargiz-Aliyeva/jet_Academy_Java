package Oop1_tekrar;

public class Human {
    public Human(){
        System.out.println("Meni ,çağırirlar");
    }
    public Human(String name){
        System.out.println("welcome"+" " +name);
    }

  public  void rasul(){
      System.out.println("Meni object ile çağırdılar ");
  }
  public void taleh() {
        rasul();
    }

}
