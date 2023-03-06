public class TesteGetAndSet{
    public static void main(String[] args) {
        ContaGetAndSet banco = new ContaGetAndSet();
        banco.setNumero(12345);

        ClienteGetAndSet thiago = new ClienteGetAndSet();
        thiago.setNome("Thiago");        

        banco.setTitular(thiago);
        System.out.println(banco.getTitular().getNome());
    }
}
