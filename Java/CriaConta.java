public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println(segundaConta.saldo);
    }   
}
