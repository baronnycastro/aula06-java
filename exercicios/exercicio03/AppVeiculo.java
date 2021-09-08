package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo a = new Veiculo("GM", "onix", 12.5);
     
        a.apresentar();
       
        a.setConsumo(-10);
        
       double consumo = a.getConsumo();
       System.out.println("consumo: " + consumo);
    }
}
