package exeptionLessons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            System.out.println(plus18(a));
        }
        catch (MyExeptionClass e){
            System.out.println(e.getMessage());
        }
    }
    public  static  Boolean plus18(Integer age){
        if(age==0)throw new MyExeptionClass("Yasiniz 0 ola bilmez");
        return age>18;
    }
}
