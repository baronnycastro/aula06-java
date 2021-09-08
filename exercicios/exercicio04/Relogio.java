package exercicios.exercicio04;

public class Relogio {
    private int hora, minuto, segundo;

    Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);

    }

    void exibirRelogio() {
        System.out.printf("a hora é %d:%d:%d", hora, minuto, segundo);
    }

    

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        }
    }
    int getHora() {
        return hora;
    }

    

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        }
    }
    int getMinuto() {
        return minuto;
    }

        public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        }
        
    }
    int getSegundo() {
        return segundo;
    }
}
