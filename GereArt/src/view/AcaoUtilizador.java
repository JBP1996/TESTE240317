/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Date;
import java.util.Scanner;
import controller.GeriroObras;
import controller.GerirExposicoes;
import java.util.ArrayList;
import model.Obra;

/**
 *
 * @author JBP1996 Atec
 */
public class AcaoUtilizador {
    GeriroObras go = new GeriroObras();
    GerirExposicoes ge = new GerirExposicoes();
    ArrayList<Obra> listaObras = new ArrayList<Obra>();
    
    
    public AcaoUtilizador() {
    }

    public void inserirObra(){
        System.out.println("INSERCAO DE OBRA\n");
        System.out.println("Nome do Artista");
        String artista =new Scanner(System.in).nextLine();
        System.out.println("Nome da Obra");
        String obra =new Scanner(System.in).nextLine();
        System.out.println("Categoria da Obra");
        String categoria =new Scanner(System.in).nextLine();
        System.out.println("Tipo de Obra");
        String tipo =new Scanner(System.in).nextLine();
        System.out.println("Data que a Obra foi criada");
        String data =new Scanner(System.in).nextLine();
        
        go.inserirObra(artista, obra, categoria, tipo, data);
        
    }

    public void inserirExposicao(){
        System.out.println("INSERCAO DE Exposicao\n");
        System.out.println("Nome da Exposicao");
        String nome =new Scanner(System.in).nextLine();
        System.out.println("Data de Inicio da Exposicao");
        String dataInicio =new Scanner(System.in).nextLine();
        System.out.println("Data de Fim da Exposicao");
        String dataFim =new Scanner(System.in).nextLine();
        System.out.println("Quantidade de Visitantes da Exposicao");
        int quantidade =new Scanner(System.in).nextInt();
        System.out.println("Preco da Exposicao");
        Double preco =new Scanner(System.in).nextDouble();
        
        System.out.println("Obras que estarao na Exposicao");
        String obra =new Scanner(System.in).nextLine();
        
        
        
        Obra listobra;
        for(int i=0;i<listaObras.size();i++){
            listobra=listaObras.get(i);
            
            listarObra();
            System.out.println("\n Titulo: "+listobra.getTitulo()); 
        }
        
        //ge.inserirExposicao(nome, dataInicio, dataFim, quantidade, preco, obrasPresentes);
        
    }
    
    public void listarObra(){
        go.listarObra();
    }
    
}
