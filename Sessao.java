public class Sessao {
    public String informacoes_ingressos;
    public String numero_sala;
    public String horarios;
    public String local;
    public String dia;
    public String tipo_sessao;

    public String getInformacoes_ingressos(){
        return informacoes_ingressos;
    }
    public void setInformacoes_ingressos(){
        this.informacoes_ingressos = informacoes_ingressos;
    }

    public String getNumero_sala(){
        return numero_sala;
    }
    public void setNumero_sala(){
        this.numero_sala = numero_sala;
    }

    public String getHorarios(){
        return horarios;
    }
    public void setHorarios(){
        this.horarios = horarios;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTipo_sessao() {
        return tipo_sessao;
    }

    public void setTipo_sessao(String tipo_sessao) {
        this.tipo_sessao = tipo_sessao;
    }

    public Sessao(String informacoes_ingressos, String numero_sala, String horarios, String local, String dia, String tipo_sessao) {
        this.informacoes_ingressos = informacoes_ingressos;
        this.numero_sala = numero_sala;
        this.horarios = horarios;
        this.local = local;
        this.dia = dia;
        this.tipo_sessao = tipo_sessao;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "informacoes_ingressos='" + informacoes_ingressos + '\'' +
                ", numero_sala='" + numero_sala + '\'' +
                ", horarios='" + horarios + '\'' +
                ", local='" + local + '\'' +
                ", dia='" + dia + '\'' +
                ", tipo_sessao='" + tipo_sessao + '\'' +
                '}';
    }
}