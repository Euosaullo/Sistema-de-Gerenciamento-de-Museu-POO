public class Visitante {
    
    //ATRIBUTOS
    public String nome;
    public String cpf;
    public int idade;
    
    //CONSTRUCTOR
    public Visitante (String nome, String cpf, int idade){
        this.nome=nome;
        this.cpf=cpf;
        this.idade=idade;
    }
    
    //GETS
    public String getNome(){
        return nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public int getIdade(){
        return idade;
    }
    
    //SETS
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setIdade(int idade){
        this.idade=idade;
    }
    
    

}