package Condicionales;

public class CiclosWhile {

    public void printNumbers(int number) {
        int i = 1;
        while (i <= number) {
            System.out.println("Number: " + i);
            i++;
        }
    }

    public void printNumbers(int number, int number2) {
        int i = number2;
        do {
            System.out.println("Number: " + i);
            i++;
        }
        while (i <= number) ;
    }
}
