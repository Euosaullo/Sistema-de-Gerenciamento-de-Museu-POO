public class Obra {
    
    //ATRIBUTOS
    //colocar nome da obra depois
    public String categoria;
    public String data;
    public Artista autor;
    public int id_obra;
    
    
    //CONSTRUCTOR
    public Obra (String categoria, String data, Artista autor){
        this.categoria=categoria;
        this.data=data;
        this.autor=autor;
    }
    
    
    //GETS
    public String getCategoria() {
        return categoria;
    }

    public String getData() {
        return data;
    }
    
    public int getId_obra(){
        return id_obra;
    }
    
    //mostrar nome do autor;
    
    //SETS
    

}