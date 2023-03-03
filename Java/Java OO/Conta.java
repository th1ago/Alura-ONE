
public class Conta {
    float saldo;
    int agencia;
    int numero;
    Cliente titular;

    void deposita(float valor){
        this.saldo += valor;
    }

    boolean saca(float valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    boolean transfere(float valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}
