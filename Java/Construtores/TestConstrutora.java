public class TestConstrutora {
    public static void main(String[] args) {
        ContaConstrutora conta = new ContaConstrutora(1234, 1111);
        ContaConstrutora conta2 = new ContaConstrutora(1234, 2222);
        ContaConstrutora conta3 = new ContaConstrutora(1234, 3333);
        System.out.println(ContaConstrutora.getTotal());
    }
}
