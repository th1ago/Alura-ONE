public class TesteFunc {
    
    public static void main(String[] args) {
       Funcionario thiago = new Funcionario();
       thiago.setNome("Thiago Murakami");
       thiago.setSalario(11650.00);
       

       System.out.println(thiago.getNome());
       System.out.println(thiago.getBonificacao());
    } 
}
