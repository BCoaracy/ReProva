package reprova;

import java.awt.BorderLayout;

public class ReProva {

    public static void main(String[] args) {
        
        Prova p = new Prova();
        ListaEncadeada l1 = new ListaEncadeada();
        l1.adicionaNoFimComPrioridade(1, "A");
        l1.adicionaNoFimComPrioridade(3, "X");
        l1.adicionaNoFimComPrioridade(2, "Y");
        l1.adicionaNoFimComPrioridade(0, "Z");
        p.exercicio1(l1);
        
        System.out.println("Resposta da questão 2 é: Letra D");
        System.out.println("Resposta da questão 4 é: Letra D");
        
    }
    
}
