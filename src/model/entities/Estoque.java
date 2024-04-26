
package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos;
    private String itemArmazenado;
    private EnumProdutoTipo tipoProduto;
    private Integer quantidade;
    private String detalhes;
    private Double valor;


    public Estoque(String itemArmazenado, EnumProdutoTipo tipoProduto, Integer quantidade, String detalhes, Double valor) {
        this.produtos = new ArrayList<>();

        this.itemArmazenado = itemArmazenado;
        this.tipoProduto = tipoProduto;
        this.quantidade = quantidade;
        this.detalhes = detalhes;
        this.valor = valor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String getItemArmazenado() {
        return itemArmazenado;
    }

    public void setItemArmazenado(String itemArmazenado) {
        this.itemArmazenado = itemArmazenado;
    }

    public EnumProdutoTipo getTipoProduto() {
        return tipoProduto;
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
}
