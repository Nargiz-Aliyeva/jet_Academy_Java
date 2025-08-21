package Oop2;

import javax.xml.crypto.dom.DOMCryptoContext;

//birde yazmaliyam
public class Main {
    public static void main(String[] args) {
//        Human human = new Human();
//        human.sayHi("sparta!");
//        String demoText = human.sayBye("Hesterxan");
//        System.out.println(demoText);
//        int[] myArr = {90, 4, 2, 452, 4, 5, 1, 5, 1, 5, 45, 12, 50};
//
//        int[] response = human.returnEvenArray(myArr);
//        human.printScreen(response);
//
//Human1 human1 =new Human1();
//human1.reception();
        Human1 taleh = new Human1("Taleh Agayev", 34, false);
        Human1 nargiz = new Human1("Nargiz Aliyeva", 24, true);

        Human1 agshin = new Human1("Agshin Fataliyev", 27, false);

        System.out.println(nargiz.genderCompalier(nargiz.gender));

//        System.out.println(taleh);
//        System.out.println(nargiz);
//        System.out.println(agshin);





        Animal cat = new Animal();
       cat.setAge(3);
        System.out.println(cat.getAge());
    }
}

