public class Combo {
    private String preco;
    private String tipos_combos;
    private String brindes;


    public String getPreco(){
        return preco;
    }
    public void setPreco(String preco){
        this.preco = preco;
    }

    public String getTipos_combos(){
        return tipos_combos;
    }
    public void setTipos_combos(String tipos_combos){
        this.tipos_combos = tipos_combos;
    }

    public String getBrindes(){
        return brindes;
    }
    public void setBrindes(String brindes){
        this.brindes = brindes;
    }

    public Combo(String preco, String tipos_combos, String brindes) {

        this.preco = preco;
        this.tipos_combos = tipos_combos;
        this.brindes = brindes;
    }

    @Override
    public String toString() {
        return "Combo{" +
                "preco='" + preco + '\'' +
                ", tipos_combos='" + tipos_combos + '\'' +
                ", brindes='" + brindes + '\'' +
                '}';
    }
}