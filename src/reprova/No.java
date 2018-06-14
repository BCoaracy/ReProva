package reprova;
public class No {
    private No proximo;
    private Object elemento;
    private int prioridade;

    public No (int prioridade, Object elemento){
        this.prioridade = prioridade;
        this.elemento = elemento;
    }
    
//    public No (No proximo, Object elemento){
//        this.proximo = proximo;
//        this.elemento = elemento;
//    }
    
    public No (Object elemento){
        this.elemento = elemento;
    }
    
    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    
    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
