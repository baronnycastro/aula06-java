package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        // cria um novo objeto pessoa
        Pessoa p = new Pessoa("baronny", 26);
        Pessoa a = new Pessoa("berolau", 30);

      // p.nome = "baronny";
        //p.idade = 25;
        p.apresentar();
        // atalho comentario linha = CTRL + ;
      //  a.nome = "berolau";
      //  a.idade = 30;
        a.apresentar();
   
    }
}
