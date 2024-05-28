package org.example;

public class Moneda {
    private String codigo;
    private String valor;

    public Moneda(String codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Moneda() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
