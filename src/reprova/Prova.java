package reprova;

import java.util.Scanner;

public class Prova extends ListaEncadeada{

Scanner scan = new Scanner(System.in);    
    
//Implemente um programa que tenha uma fila cujos elementos possuem um campo 
//inteiro representando sua prioridade. Quanto menor o valor deste campo, maior 
//a prioridade do elemento. Insira n elementos com prioridades diversas na fila 
//e depois divida a fila em duas, uma com elementos cuja prioridade é menor ou
//igual ao valor p fornecido pelo usuário e outra com os elementos restantes.

    public void exercicio1(ListaEncadeada lista){
        System.out.println("Forneça o valor da prioridade de divisão:");
        int divisoria = scan.nextInt();
        lista.ordenarListaPrioridade();
        
    }
    
    
    
}
