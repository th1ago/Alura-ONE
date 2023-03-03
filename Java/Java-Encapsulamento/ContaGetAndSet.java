public class ContaGetAndSet {
    private double saldo;
    private int agencia;
    private int numero;
    private ClienteGetAndSet titular; 

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

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() { 
        return this.numero;
    }

    public int getAgencia() { 
        return this.agencia;
    }

    public void setNumero(int novoNumero) { 
        this.numero = novoNumero;
    }    
}