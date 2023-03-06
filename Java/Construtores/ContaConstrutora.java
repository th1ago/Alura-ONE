package Java.Construtores;

public class ContaConstrutora {
    private double saldo;
    private int agencia;
    private int numero;
    private ClienteContrutora titular;
    private static int total = 0;

    public ContaConstrutora(int agencia, int numero){
        ContaConstrutora.total++;
        System.out.println("O total de contas é " + ContaConstrutora.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, ContaConstrutora destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(ClienteContrutora titular){
        this.titular = titular;
    }

    public ClienteContrutora getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return ContaConstrutora.total;
    }
}
