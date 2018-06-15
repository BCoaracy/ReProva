package reprova;

import java.awt.BorderLayout;

public class ReProva {

    public static void main(String[] args) {
        
        Prova p = new Prova();
        ListaEncadeada l1 = new ListaEncadeada();
        ListaEncadeada l2 = new ListaEncadeada();
        ListaEncadeada l3 = new ListaEncadeada();
        l1.adicionaNoFimComPrioridade(1, "A");
        l1.adicionaNoFimComPrioridade(3, "X");
        l1.adicionaNoFimComPrioridade(2, "Y");
        l1.adicionaNoFimComPrioridade(0, "Z");
        p.exercicio1(l1);
        
        System.out.println("Resposta da questão 2 é: Letra D");
        
        l2.adicionaNoFim("Teste");
        l2.adicionaNoFim("o");
        l2.adicionaNoFim("2");
        l3.adicionaNoFim("Para");
        l3.adicionaNoFim("Exercicio");
        
        p.exercicio2(l2, l3);
        
        System.out.println("Resposta da questão 4 é: Letra D");
        
    }
    
}
