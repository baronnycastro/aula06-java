package exercicios.exercicio03;

public class Veiculo {
    String modelo, marca;
    private double consumo;

    Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        setConsumo(consumo);
    }

    void apresentar() {
        System.out.println("Modelo do carro é " + modelo);
        System.out.println("Marca do carro é " + marca);
    }

    double getConsumo() { // nome padrao para pegar valor de atributo
        return consumo;
    }

    void setConsumo(double consumo) { // nome padrao para alterar valor de atributo
        if (consumo > 0) {
            this.consumo = consumo;
        }
    }
}
