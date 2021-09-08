package exercicios;

public class Exercicio02 {
    public static void main(String[] args) {
        int menor = retornaMenor(25, 20, 10);
        System.out.println("o menor eh " + menor);
    }

    static int retornaMenor(int num1, int num2, int num3) {

        if (num1 < num2 && num1 < num3) {
            return num1;
        }

        else if (num2 < num1 && num2 < num3) {
            return num2;
        }

        return num3;
    }

}
