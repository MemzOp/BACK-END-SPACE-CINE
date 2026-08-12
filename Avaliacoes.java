public class Avaliacoes {
    public String usuario;
    public String estrelas;
    public String resenha_critica;
    public String dt_resenha;

    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getEstrelas(){
        return estrelas;
    }
    public void setEstrelas(String estrelas){
        this.estrelas = estrelas;
    }

    public String getResenha_critica(){
        return resenha_critica;
    }
    public void setResenha_critica(String resenha_critica){
        this.resenha_critica = resenha_critica;
    }

    public String getDt_resenha(){
        return dt_resenha;
    }
    public void setDt_resenha(String dt_resenha){
        this.dt_resenha = dt_resenha;
    }

    public Avaliacoes(String usuario, String estrelas, String resenha_critica, String dt_resenha) {

        this.usuario = usuario;
        this.estrelas = estrelas;
        this.resenha_critica = resenha_critica;
        this.dt_resenha = dt_resenha;
    }

    @Override
    public String toString() {
        return "Avaliacoes{" +
                "usuario='" + usuario + '\'' +
                ", estrelas='" + estrelas + '\'' +
                ", resenha_critica='" + resenha_critica + '\'' +
                ", dt_resenha='" + dt_resenha + '\'' +
                '}';
    }
}