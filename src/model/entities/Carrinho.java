package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> itens;
    private Pagamento pagamento;
    private Double frete;
    private Double valorTotal;

    public Carrinho(Pagamento pagamento, Double frete, Double valorTotal) {
        this.itens = new ArrayList<>();
        this.pagamento = pagamento;
        this.frete = frete;
        this.valorTotal = valorTotal;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public Double getFrete() {
        return frete;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

}