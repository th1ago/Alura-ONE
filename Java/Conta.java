public class Conta {
    float saldo;
    int agencia;
    int numero;
    String titular;

    void deposita(float valor){
        this.saldo += this.saldo + valor;
    }
}
