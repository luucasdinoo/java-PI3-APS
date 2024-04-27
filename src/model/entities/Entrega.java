package model.p4;

public class Entrega {

    private EnderecoUsuario endereco;
    private String rota;
    private String tempo;
    private String codEntrega;

    public Entrega(EnderecoUsuario endereco, String rota, String tempo, String codEntrega) {
        this.endereco = endereco;
        this.rota = rota;
        this.tempo = tempo;
        this.codEntrega = codEntrega;
    }

    public EnderecoUsuario getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoUsuario endereco) {
        this.endereco = endereco;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getCodEntrega() {
        return codEntrega;
    }
}
