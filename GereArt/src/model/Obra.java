/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author JBP1996 Atec
 */
public class Obra {
    private String nomeArtista;
    private String titulo;
    private String categoria;
    private String tipo;
    private String data;

    public Obra(String nomeArtista, String titulo, String categoria, String tipo, String data) {
        this.nomeArtista = nomeArtista;
        this.titulo = titulo;
        this.categoria = categoria;
        this.tipo = tipo;
        this.data = data;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
