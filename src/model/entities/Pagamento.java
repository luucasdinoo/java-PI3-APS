
package model.entities;

public class Pagamento {
    private Double valorItem;
    private Double valorFrete;
    private Double valorTotal;
    private EnumPagamentoTipo tipoPagamento;

    public Pagamento(Double valorItem, Double valorFrete, Double valorTotal, EnumPagamentoTipo tipoPagamento) {
        this.valorItem = valorItem;
        this.valorFrete = valorFrete;
        this.valorTotal = valorTotal;
        this.tipoPagamento = tipoPagamento;
    }

    public Double getValorItem() {
        return valorItem;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public EnumPagamentoTipo getTipoPagamento() {
        return tipoPagamento;
    }

}
