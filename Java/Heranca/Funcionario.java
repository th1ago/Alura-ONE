// Class mae
// Base class
// Super class

public class Funcionario {
    private String nome;
    private String cpf;
    // visivel somente para os filhos
    protected double salario;
    
    public double getBonificacao(){
        return this.salario * 0.1;
     }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }
}
