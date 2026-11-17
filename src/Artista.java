import java.util.ArrayList;
import java.util.List;

public class Artista {
    
    //ATRIBUTOS
    public String nome;
    public boolean vivo;
    public String nascimento;
    public String falecimento;
    public String nacionalidade;
    public String especialidade;
    public int id_artista;
    public int i=1;
    
    public List<Obra> obras;
    
    //CONSTRUCTOR
    public Artista(String nome, boolean vivo, String nascimento, String falecimento, String nacionalidade, String especialidade, int id_artista){
        this.nome=nome;
        this.vivo=vivo;
        this.nascimento=nascimento;
        this.nascimento=falecimento;
        this.nacionalidade=nacionalidade;
        this.especialidade=especialidade;
        this.id_artista=i;
        i++;
        this.obras = new ArrayList<>();
    }
    
    //GETS
    public String getNome() {
        return nome;
    }

    public boolean isVivo() {
        return vivo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getFalecimento() {
        return falecimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public int getId_artista() {
        return id_artista;
    }

    public List<Obra> getObras() {
        return obras;
    }
    
    //mostrar obras;
    
    
    //SETS
    public void matar(String data){
        this.falecimento=data;
        this.vivo=false;
    }
    
    public void setEspecialidade(String especialidade){
        this.especialidade=especialidade;
    }
}