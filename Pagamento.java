public class Pagamento {
    private String tipo_ingresso;
    private String cupom;
    private String forma_pagamento;
    private String comprovante;
    private String ingresso_digital;
    private  String cancelar_compra;

    public String getTipo_ingresso(){
        return tipo_ingresso;
    }
    public void setTipo_ingresso(){
        this.tipo_ingresso=tipo_ingresso;
    }

    public String getCupom(){
        return cupom;
    }
    public void setCupom(){
        this.cupom = cupom;
    }

    public String getForma_pagamento(){
        return forma_pagamento;
    }
    public void setForma_pagamento(){
        this.forma_pagamento = forma_pagamento;
    }

    public String getComprovante(){
        return comprovante;
    }
    public void setComprovante(){
        this.comprovante = comprovante;
    }

    public String getIngresso_digital(){
        return ingresso_digital;
    }
    public void setIngresso_digital(){
        this.ingresso_digital = ingresso_digital;
    }

    public String getCancelar_compra(){
        return cancelar_compra;
    }
    public void setCancelar_compra(){
        this.cancelar_compra = cancelar_compra;
    }


    public Pagamento(String tipo_ingresso, String cupom, String forma_pagamento, String comprovante, String ingresso_digital, String cancelar_compra) {
        this.tipo_ingresso = tipo_ingresso;
        this.cupom = cupom;
        this.forma_pagamento = forma_pagamento;
        this.comprovante = comprovante;
        this.ingresso_digital = ingresso_digital;
        this.cancelar_compra = cancelar_compra;



    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "tipo_ingresso='" + tipo_ingresso + '\'' +
                ", cupom='" + cupom + '\'' +
                ", forma_pagamento='" + forma_pagamento + '\'' +
                ", comprovante='" + comprovante + '\'' +
                ", ingresso_digital='" + ingresso_digital + '\'' +
                ", cancelar_compra='" + cancelar_compra + '\'' +
                '}';
    }
}