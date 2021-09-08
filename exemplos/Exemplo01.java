package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        linha();
        System.out.println("meu programa");
        linha2(5); // chamada de método
        System.out.println("08/09");
        linha2(5); // chamada de método
        linha3(10, '*');
    }


    static void linha(){ // void significa que nao tem retorno
        System.out.println("----------------");
    }

    static void linha2(int tamanho){ //tamanho eh um parametro
        for (int i = 0; i < tamanho; i++) {
        System.out.print("-"); 
        }
        System.out.println();
    }

    static void linha3(int tamanho, char letra){ //tamanho eh um parametro
        for (int i = 0; i < tamanho; i++) {
        System.out.print(letra); 
        }
        System.out.println();
    }
}