package model.p4;

import model.p1.Produto;

public class Avaliacao {

    private Produto produto;
    private Usuario usuario;
    private Integer pontos;
    private String comentarios;

    public Avaliacao(Produto produto, Usuario usuario, Integer pontos, String comentarios) {
        this.produto = produto;
        this.usuario = usuario;
        this.pontos = pontos;
        this.comentarios = comentarios;
    }

    public Produto getProduto() {
        return produto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Integer getPontos() {
        return pontos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
