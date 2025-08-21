package Oop2;

//birde yazmaliyam
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.sayHi("sparta!");
        String demoText = human.sayBye("Hesterxan");
        System.out.println(demoText);
        int[] myArr = {90, 4, 2, 452, 4, 5, 1, 5, 1, 5, 45, 12, 50};

        int[] response = human.returnEvenArray(myArr);
        human.printScreen(response);

    }
}

