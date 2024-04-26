package model.entities;

public class Produto {

    private String nome;
    private Integer quantidade;
    private String detalhes;
    private Double valor;
    private EnumProdutoTipo tipo;

    public Produto(String nome, Integer quantidade, String detalhes, Double valor, EnumProdutoTipo tipo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.detalhes = detalhes;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public EnumProdutoTipo getTipo() {
        return tipo;
    }

}