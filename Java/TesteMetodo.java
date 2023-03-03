public class TesteMetodo {
    public static void main(String[] args) {
        Conta contaThiago = new Conta();
        contaThiago.saldo = 100;
        contaThiago.deposita(50);
        System.out.println(contaThiago.saldo);

        boolean retirarValor = contaThiago.saca(20);
        System.out.println(contaThiago.saldo);
        System.out.println(retirarValor);
    }   
}
