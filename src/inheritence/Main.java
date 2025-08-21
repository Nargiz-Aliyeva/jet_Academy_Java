package inheritence;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.ekranaYaz();
        child.ekranaYaz(34);
        child.ekranaYaz("Taleh");
        child.ekranaYaz("Aghayev","Elshad");

        Dog dog = new Dog();
//        dog.sound();
//        dog.bark();
//        Cat cat = new Cat();
//        cat.sound();
        dog.sound();

        Student aytac = new Student();
        aytac.name="Aytac";
        aytac.surName = "Bagirova";
        aytac.setUniversirt("bdu");

        System.out.println(aytac); }

}
