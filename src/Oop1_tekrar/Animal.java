package Oop1_tekrar;
//OOP
public class Animal {
    public  void  ekranaYaz(){
        System.out.println("It is my first method!");
    }
    public void ekranaQirmiziYaz(){
        System.err.println("It ' i my first red text");
    }

    public void calc(int a){
        System.out.println(a);
    }
    public  void calcs (int point , String name){
        System.out.println("Wencome"+" "+name+" "+"Your point :"+point);
    }
//    public void calculator(int a,int b){
//        System.out.println(a+b);
//
//    }
public void calculator(int a,int b ,String c){
        if ("*".equals(c)){
            System.out.println(a+"*"+b+"="+(a*b));
        } else if ("+".equals(c)) {
            System.out.println(a+"+"+b+"="+(a+b));
        }
        else if ("-".equals(c)) {
            System.out.println(a+"-"+b+"="+(a-b));
        }
        else if ("/".equals(c)) {
            System.out.println(a+"/"+b+"="+(a/b));
        }
        else {
            System.err.println("Operations is not found.Please try again");
        }



}
}
