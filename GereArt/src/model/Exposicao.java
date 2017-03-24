/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JBP1996 Atec
 */
public class Exposicao {
    private String nome;
    private String dataInicio;
    private String dataFim;
    private int quantidadeVisitantes;
    private double preco;
    private ArrayList<Obra> obrasPresentes;

    public Exposicao(String nome, String dataInicio, String dataFim, int quantidadeVisitantes, double preco, ArrayList<Obra> obrasPresentes) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.quantidadeVisitantes = quantidadeVisitantes;
        this.preco = preco;
        this.obrasPresentes = obrasPresentes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public int getQuantidadeVisitantes() {
        return quantidadeVisitantes;
    }

    public void setQuantidadeVisitantes(int quantidadeVisitantes) {
        this.quantidadeVisitantes = quantidadeVisitantes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Obra> getObrasPresentes() {
        return obrasPresentes;
    }

    public void setObrasPresentes(ArrayList<Obra> obrasPresentes) {
        this.obrasPresentes = obrasPresentes;
    }
}
