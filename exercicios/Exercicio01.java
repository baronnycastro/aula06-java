package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
      //  int resultado = ehPar(8);
        
        /*  if(ehPar(11)){
             System.out.println("o numero eh par");
         } else{
             ("o numero eh impar")      
         }
            }

    static boolean ehPar(int num){
        return (num % 2 ==0);
    }
*/    
    }
    static int ehPar(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " é par");
        } else {
            System.out.println("não é par");
        }

        return num;
    }
    /*
  static boolean ehPar(int num){ // outra maneira de se fazer
    if (num % 2 == 0) {
        return true;
    } else {
        return false;
    }

  } */
}
