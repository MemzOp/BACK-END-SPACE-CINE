import Enums.Genero;
import Enums.Genfilme;
import Enums.Idioma;
import java.time.LocalDate;

public class Filme {
    private int id;
    private String nome;
    private Genfilme genero;
    private double Duracao;
    private Idioma idioma;
    private String sinopse;
    private LocalDate dtEstreia;


    public int getId (){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public Genfilme getGenero(){
        return genero;
    }

    public void setGenero(Genfilme genero){
        this.genero = genero;
    }


    public Double getDuracao(){
        return Duracao;
    }


    public void setDuracao(double duracao) {
        if (duracao < 0) {
            IO.println("A duração não pode ser negativa");
        } else {
            this.Duracao = duracao;
        }
    }

    public Idioma getIdioma(){
        return idioma;
    }
    public void setIdioma(Idioma idioma){
        this.idioma = idioma;
    }


    public String getSinopse(){
        return sinopse;
    }
    public void setSinopse(String sinopse){
        this.sinopse = sinopse;
    }

    public LocalDate getDtEstreia(){
        return dtEstreia;
    }
    public void setDtEstreia(LocalDate dtEstreia){
        this.dtEstreia = dtEstreia;
    }

    // CONSTRUTOR VAZIO
    public Filme(){}
    // CONSTRUTOR COM ARGUMENTOS


    public Filme(int id, String nome, Genfilme genero, double duracao, Idioma idioma, String sinopse, LocalDate dtEstreia) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        Duracao = duracao;
        this.idioma = idioma;
        this.sinopse = sinopse;
        this.dtEstreia = dtEstreia;
    }
}