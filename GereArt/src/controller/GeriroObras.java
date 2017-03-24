/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import model.Obra;

/**
 *
 * @author JBP1996 Atec
 */
public class GeriroObras {
    ArrayList<Obra> obras = new ArrayList<Obra>();
    /*
    public GeriroObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }
    */

    public void inserirObra(String nomeArtista, String titulo, String categoria, String tipo, String data){
        Obra a = new Obra(nomeArtista,titulo,categoria,tipo,data);
        
        obras.add(a);
    }
    
    public void listarObra(){
        Obra obra;
        for(int i=0;i<obras.size();i++){
            obra=obras.get(i);
            System.out.println(" Artista: "+obra.getNomeArtista()+"\n Titulo: "+obra.getTitulo()+
                    "\n Categoria: "+obra.getCategoria()+"\n Tipo: "+obra.getTipo()+"\n Data: "+obra.getData()); 
        }
    }
}
