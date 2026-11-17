import java.util.ArrayList;
import java.util.List;
public class Exposição {
    
    //ATRIBUTOS
    public List<Obra> obras;
    public List<Visitante> visitantes;
    
    public String titulo;
    public String data_inicio;
    public String data_fim;
    public Double preço; //fazer meia depois
    
    public int id_exposicao;
    public int i = 1;
    
    //CONSTRUCTOR
    public Exposição(String titulo, String data_inicio, String data_fim, Double preço){
        this.obras = new ArrayList<>();
        this.visitantes = new ArrayList<>();
        
        this.titulo=titulo;
        this.data_inicio=data_inicio;
        this.data_fim=data_fim;
        this.preço=preço;
        this.id_exposicao=i;
        i++;
    }
    
    //GETS
    public String getTitulo() {
        return titulo;
    }
    public String getData_inicio() {
        return data_inicio;
    }
    public String getData_fim() {
        return data_fim;
    }
    
    //mostrar obrasss
    //mostrar visitantes
    
    //SETS
    //fazer sets para caso a exposicao seja adiada/atrasada ou cancelada
    
    
    
    
}
