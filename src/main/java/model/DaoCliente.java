package model;
/** dados para teste**/
public class DaoCliente {
    private String nomeCliente;
    private String telefone;
    private String rua;
    private String setor;
    private Integer quadra;
    private Integer lote;
    private String referencia;



    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Integer getQuadra() {
        return quadra;
    }

    public void setQuadra(Integer quadra) {
        this.quadra = quadra;
    }

    public Integer getLote() {
        return lote;
    }

    public void setLote(Integer lote) {
        this.lote = lote;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "DaoCliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", telefone='" + telefone + '\'' +
                ", rua='" + rua + '\'' +
                ", setor='" + setor + '\'' +
                ", quadra=" + quadra +
                ", lote=" + lote +
                ", referencia='" + referencia + '\'' +
                '}';
    }
}
