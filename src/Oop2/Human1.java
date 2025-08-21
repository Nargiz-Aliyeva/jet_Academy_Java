package Oop2;

public class Human1 {
    //public , privet ,protected ,default

//    private void sayHi() {
//        System.out.println("hi");
//    }
//
//    public void sayBye() {
//        System.out.println("sayBye");
//
//    }
//
//    public void reception() {
//        sayHi();
//        sayBye();
//    }


    public Human1() {
    }

    public Human1(String fullName1, int age1, boolean gender1){
        this.fullName=fullName1;
        this.age=age1;
        this.gender=gender1;
    }

    @Override
    public String toString() {
        return "Oop2.Human1{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public String fullName;
    public int age;
    public  boolean gender;

public String genderCompalier (boolean gender){
    if (gender){
        return "Woman";
    }
return "man";
}
}
