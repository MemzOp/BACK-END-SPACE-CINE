import Enums.salas;

public class Sala {
    public int id;
    public String assentos;
    public String infomarcoes_sala;
    public salas tipo_sala;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAssentos() {
        return assentos;
    }

    public void setAssentos(String assentos) {
        this.assentos = assentos;
    }

    public String getInfomarcoes_sala() {
        return infomarcoes_sala;
    }

    public void setInfomarcoes_sala(String infomarcoes_sala) {
        this.infomarcoes_sala = infomarcoes_sala;
    }

    public salas getTipo_sala() {
        return tipo_sala;
    }

    public void setTipo_sala(salas tipo_sala) {
        this.tipo_sala = tipo_sala;
    }
}