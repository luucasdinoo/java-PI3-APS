package model.entities;

public class RegistroClimatico {

    private String nivelMare;
    private String regiao;
    private String porHora;
    private String porDia;
    private String lua;

    public RegistroClimatico(String nivelMare, String regiao, String porHora, String porDia, String lua) {
        this.nivelMare = nivelMare;
        this.regiao = regiao;
        this.porHora = porHora;
        this.porDia = porDia;
        this.lua = lua;
    }

    public RegistroClimatico(String regiao, String porHora, String porDia){
        this.regiao = regiao;
        this.porHora = porHora;
        this.porDia = porDia;
    }

    public String getNivelMare() {
        return nivelMare;
    }

    public void setNivelMare(String nivelMare) {
        this.nivelMare = nivelMare;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getPorHora() {
        return porHora;
    }

    public void setPorHora(String porHora) {
        this.porHora = porHora;
    }

    public String getPorDia() {
        return porDia;
    }

    public void setPorDia(String porDia) {
        this.porDia = porDia;
    }

    public String getLua() {
        return lua;
    }

    public void setLua(String lua) {
        this.lua = lua;
    }
}