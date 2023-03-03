public class TesteCliente {
    public static void main(String[] args) {
        Cliente thiago = new Cliente();
        thiago.nome = "Thiago";
        thiago.cpf = "111.111.111-11";
        thiago.profissao = "Analista de dados";

        Conta contaDoThiago = new Conta();
        contaDoThiago.deposita(200);

        contaDoThiago.titular = thiago;
        System.out.println(contaDoThiago.titular.nome);
    }
    
}
