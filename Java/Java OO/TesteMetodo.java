public class TesteMetodo {
    public static void main(String[] args) {
        Conta contaThiago = new Conta();
        contaThiago.saldo = 100;
        contaThiago.deposita(50);
        System.out.println(contaThiago.saldo);

        boolean retirarValor = contaThiago.saca(20);
        System.out.println(contaThiago.saldo);
        System.out.println(retirarValor);

        Conta contaSilva = new Conta();
        contaSilva.deposita(3000);

        boolean transfereConta = contaSilva.transfere(9300, contaThiago);

        if(transfereConta){
            System.out.println("Valor transferido com sucesso");
            System.out.println(contaSilva.saldo);
        } else {
            System.out.println("Saldo insuficiente");
            System.out.println(contaSilva.saldo);
        }
    }   
}
