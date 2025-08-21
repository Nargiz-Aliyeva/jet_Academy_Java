package Oop2;

public class Human {
    public void sayHi(String name) {
        System.out.println("Hello" + " " + name);
    }

    public String sayBye(String name) {
        return name + " " + "bye bye!";
    }


    public int countEvenNumber(int[] intArray) {
        int countEvenNumber = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                countEvenNumber++;

            }
        }
        return countEvenNumber;
    }

    public int[] returnEvenArray(int[] intArray) {


        int evenArrayIndex = 0;
        int countEvenNumbers = countEvenNumber(intArray);


        int[] evenArray = new int[countEvenNumber(intArray)];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                evenArray[evenArrayIndex] = intArray[i];
                evenArrayIndex++;
            }
        }
        return evenArray;
    }

    public void printScreen(int response[]) {
        for (int i = 0; i < response.length; i++) {
            System.out.println(response[i]);
        }
    }
}
