package reprova;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Prova extends ListaEncadeada{

Scanner scan = new Scanner(System.in);    

    public void exercicio1(ListaEncadeada lista){
        System.out.println("Forneça o valor da prioridade de divisão:");
        int divisoria = scan.nextInt();
        lista.ordenarListaPrioridade();
        ListaEncadeada l1 = new ListaEncadeada();
        ListaEncadeada l2 = new ListaEncadeada();
        
        for(int i = 0; i <= divisoria;i++){
            l1.adicionaNoFim(lista.removeDoComecoComRetorno());            
        }
        while(lista.tamanho()!=0){
            l2.adicionaNoFim(lista.removeDoComecoComRetorno());
        }
        
        System.out.println("Lista até a divisão de prioridades: ");
        No no = null;
        System.out.println("Lista 1: ");
        while(l1.tamanho()!=0){
            no = l1.removeDoComecoComRetorno();
            System.out.println(" | "+no.getElemento()+ " | " +no.getPrioridade());
        }
        System.out.println("Lista 2: ");
        while(l2.tamanho()!=0){
            no = l2.removeDoComecoComRetorno();
            System.out.println(" | "+no.getElemento()+ " | " +no.getPrioridade());
        }
    }
    
    public void exercicio2(ListaEncadeada lista1, ListaEncadeada lista2){
        ListaEncadeada L3 = new ListaEncadeada();
        int tam = lista1.tamanho()+lista2.tamanho();
        
        for(int i = 0; i<tam;i++){
            if(lista1.tamanho()!=0){
                L3.adicionaNoFim(lista1.removeDoComecoComRetorno());
            }
            if(lista2.tamanho()!=0){
                    L3.adicionaNoFim(lista2.removeDoComecoComRetorno());
            }
        }
        int x = L3.tamanho();
        for (int i= 0; i<x;i++){
            System.out.print(" | " + L3.removeDoComecoComRetorno().getElemento());
        }
        System.out.println("\nPronto");
     }
}
