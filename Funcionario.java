public class Funcionario{

    private String nome;
    private String cpf;
    private double salario;
    private String departamento;

    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return this.nome;
    }




//terminem de fazer os métodos gets e sets
//crie uma classe Principal.java
//Coloque o método main
//crie um objeto Funcionario f=new Funcionario();
//passe seu nome como parâmetro setNome("Gabriela")
//exiba seu nome com o método getNome();
//compile javac Principal.java
//java Principal

public double bonificacao(){
    return this.salario*0.1;
}

}