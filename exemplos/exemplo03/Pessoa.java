package exemplos.exemplo03;

public class Pessoa {
    // atributos =  o que o objeto TEM
    String nome;
    int idade;

    //método construtor = inicializar o objeto;
    Pessoa(String nome, int idade) {
        // this se refere ap próprio objeto = atributo.
        this.nome = nome;
        this.idade = idade;
    }
    
    // métodos = o que o objeto FAZ
    void apresentar() {
        System.out.println("Olá! eu sou " + nome);
        System.out.printf("tenho %d anos\n" , idade);
    }
}
