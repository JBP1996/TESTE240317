/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gereart;

import java.util.Scanner;
import view.AcaoUtilizador;

/**
 *
 * @author JBP1996 Atec
 */
public class GereArt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao=0;
        AcaoUtilizador a = new AcaoUtilizador();
        while(opcao!=6){
            System.out.println("Escolha uma opcao");
            opcao = new Scanner(System.in).nextInt();

            switch(opcao){
                case 1:
                    a.inserirObra();
                    break;
                case 2:
                    a.inserirExposicao();
                    break;
                case 3:
                    a.listarObra();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("OPCAO INEXISTENTE");

            }
        }
    } 
}
