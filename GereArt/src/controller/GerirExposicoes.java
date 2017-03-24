/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import model.Exposicao;
import model.Obra;

/**
 *
 * @author JBP1996 Atec
 */
public class GerirExposicoes {
    
    ArrayList<Exposicao> exposicoes;
    /*
    public void inserirExposicao(String nome, Date dataInicio, Date dataFim, int quantidadeVisitantes, double preco, ArrayList<Obra> obrasPresentes){
        Exposicao a = new Exposicao(nome,dataInicio,dataFim,quantidadeVisitantes,preco,obrasPresentes);
        exposicoes.add(a);
    }
    */
    /*
    public GerirExposicoes(ArrayList<Exposicao> exposicoes) {
        this.exposicoes = exposicoes;
    }
    */
    public void inserirExposicao(String nome, String dataInicio, String dataFim, int quantidadeVisitantes, double preco, ArrayList<Obra> obrasPresentes){
        Exposicao a = new Exposicao(nome,dataInicio,dataFim,quantidadeVisitantes,preco,obrasPresentes);
        exposicoes.add(a);
    }
    /*
    public void listarExposicao(){
        for(int i=0;i<exposicoes.size();i++){
          System.out.println("Exposicao \n"+exposicoes.listIterator(i)); 
        }
    }
    */
     public void listarExposicao(){
        Exposicao exposicao;
        for(int i=0;i<exposicoes.size();i++){
            exposicao=exposicoes.get(i);
            System.out.println(" Exposicao: "+exposicao.getNome()+"\n Data Inicio: "+exposicao.getDataInicio()+
                "\n Data Fim: "+exposicao.getDataFim()+"\n Quantidade Visitantes: "+exposicao.getQuantidadeVisitantes()+
                "\n Preco: "+exposicao.getPreco()+"\n Obras Presentes: "+exposicao.getObrasPresentes()); 
        }
    }
    
}
