package reprova;

public class ListaEncadeada {

    private No primeiro;
    private No ultimo;
    private int totalDeElementos;
    
    
//METODOS PARA ADICIONAR ELEMENTOS
    public void adiciona(Object elemento) {
        No no = new No(elemento);
        if(primeiro==null && ultimo==null){
            no.setProximo(null);
            primeiro = no;
            ultimo = no;
        }else{
            no.setProximo(primeiro);
            primeiro = no;
        }
        this.totalDeElementos++;
    }

    public void adiciona(int posicao, Object elemento) {
        No no = new No(elemento);
        No noAux = this.primeiro;
        if(posicao>this.tamanho()){
            this.ultimo.setProximo(no);
            ultimo = no;
            System.out.println("Você informou uma posição maior que o "
                    + "número de elementos na lista.\n"
                    + "O elemento foi insediro no final da lista.");
        }else{
            //Para percorrer até a posição desejada
            for(int i = 1; i<posicao-1;i++){
                noAux = noAux.getProximo();
            }
            //quando na posicao desejada
            no.setProximo(noAux.getProximo());
            noAux.setProximo(no);
        }
        this.totalDeElementos++;
    }
    
    public void adicionaNoComeco(Object elemento) {
        No no = new No(elemento);
        if(primeiro == null){
            primeiro = no;
            ultimo = no;
        }else{
            no.setProximo(primeiro);
            primeiro = no;
        }
        this.totalDeElementos++;
    }
    
    public void adicionaNoFim(Object elemento) {
        No no = new No(elemento);
        if(primeiro == null){
            primeiro = no;
            ultimo = no;
        }else{
            ultimo.setProximo(no);
            ultimo = no;
        }
        this.totalDeElementos++;
    }
    
    public void adicionaNoFimComPrioridade(int prioridade, Object elemento) {
        No no = new No(prioridade, elemento);
        if(primeiro == null){
            primeiro = no;
            ultimo = no;
        }else{
            ultimo.setProximo(no);
            ultimo = no;
        }
        this.totalDeElementos++;
    }
//FIM
    
//METODOS PARA REMOVER
    public void remove(int posicao) {
        
        No noAux = this.primeiro;
        No noAux1 = null;
        
        for(int i = 1;i<posicao;i++){
            if(i<posicao-1){
                noAux = noAux.getProximo();
            }else{
                noAux1= noAux.getProximo();
            }
        }
            noAux.setProximo(noAux1.getProximo());
            noAux1.setProximo(null);
        
        this.totalDeElementos--;
    }
    
    public void removeDoComeco() {
        primeiro = primeiro.getProximo();
        this.totalDeElementos--;
    }
    
    public No removeDoComecoComRetorno() {
        No noRetorno = primeiro;
        primeiro = primeiro.getProximo();
        this.totalDeElementos--;
        return noRetorno;
    }
    

    public void removeDoFim() {
        remove(tamanho());
    }
//FIM
    
//MISCELANEOUS
    
    public int tamanho() { 
        return totalDeElementos;
    }

    public boolean contem(Object o) {
        No no = primeiro;
        boolean saida = false;
        while(saida==false){
            if(no.getElemento().equals(o))
                return true;
            else{
                no = no.getProximo();
                if(no==null)
                    saida=true;
            }
        }
        
        return false;
    }

    public boolean ordenada(){
        No no = primeiro;
        for(int i =0;i<this.tamanho()-1;i++){
            if((int)no.getElemento()>(int)no.getProximo().getElemento())
                return false;
            no = no.getProximo();
        }
        return true;
    }
    
    public boolean ordenadaPrioridade(){
        No no = primeiro;
        for(int i =0;i<this.tamanho()-1;i++){
            if(no.getPrioridade()>no.getProximo().getPrioridade())
                return false;
            no = no.getProximo();
        }
        return true;
    }
    
    public void ordenarListaPrioridade(){
        No no = this.primeiro;
        No noAux = no.getProximo();
        No noAnt = this.primeiro;
        while(this.ordenadaPrioridade()==false){
            if(noAux!=null){
                if(no.getPrioridade()>noAux.getPrioridade()){
                    if(no==primeiro){
                        no.setProximo(noAux.getProximo());
                        noAux.setProximo(no);
                        primeiro = noAux;
                    }else{
                        no.setProximo(noAux.getProximo());
                        noAux.setProximo(no);
                        noAnt.setProximo(noAux);
                    }
                }
            }
            if(no.getProximo()==null){
                ultimo = no;
                no = primeiro;
                noAux = no.getProximo();
            }else{
                noAnt = no;
                no = no.getProximo();
                noAux = no.getProximo();
            }
        }
    }
    
    public void ordenarLista(){
        No no = this.primeiro;
        No noAux = new No(null);
        while(this.ordenada()==false){
            if((int)no.getElemento()>(int)no.getProximo().getElemento()){
                noAux.setElemento(no.getProximo().getElemento());
                no.getProximo().setElemento(no.getElemento());
                no.setElemento(noAux.getElemento());
            }
            if(no.getProximo().equals(ultimo)){
                no = primeiro;
            }
            no = no.getProximo();
        }
    }
}