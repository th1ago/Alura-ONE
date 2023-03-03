public class TesteGetAndSet{
    public static void main(String[] args) {
        ContaGetAndSet banco = new ContaGetAndSet();
        banco.setNumero(12345);
        
        System.out.println(banco.getNumero());
    }
}
