public class Conta {
    float saldo;
    int agencia;
    int numero;
    String titular;

    void deposita(float valor){
        this.saldo += this.saldo + valor;
    }

    boolean saca(float valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }
}
