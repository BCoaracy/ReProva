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
            l2.adicionaNoComeco(lista.removeDoComecoComRetorno());
        }
        
        System.out.println("Lista até a divisão de prioridades: ");
        No no = null;
        while(l1.tamanho()!=0){
            no = l1.removeDoComecoComRetorno();
            System.out.println(" | "+no.getElemento()+ " | " +no.getPrioridade());
        }
        while(l2.tamanho()!=0){
            no = l2.removeDoComecoComRetorno();
            System.out.println(" | "+no.getElemento()+ " | " +no.getPrioridade());
        }
        
    }
}
