package model.p4;

public class EnderecoUsuario {

    private String nomeEndereco;
    private Integer numeroEndereco;
    private String complementoEndereco;

    public EnderecoUsuario(String nomeEndereco, Integer numeroEndereco, String complementoEndereco) {
        this.nomeEndereco = nomeEndereco;
        this.numeroEndereco = numeroEndereco;
        this.complementoEndereco = complementoEndereco;
    }

    public String getNomeEndereco() {
        return nomeEndereco;
    }

    public void setNomeEndereco(String nomeEndereco) {
        this.nomeEndereco = nomeEndereco;
    }

    public Integer getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(Integer numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }
}
