public class TesteReferencia {
    
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Thiago");
        g1.setSalario(5000.00);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);

        System.out.println(controle.getSoma());
    }
}
