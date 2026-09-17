package AulaPrática01.Pilha.ListaDupla;

public class NoDuplo<T> {
    private T dado;
    private NoDuplo<T> anteriorNo;
    private NoDuplo<T> proximoNo;
    private int indice;

public NoDuplo(){
        this.dado = null;
        this.indice = 0;
        this.anteriorNo = null;
        this.proximoNo = null;
    }


    public NoDuplo(T dado){
        this.dado = dado;
        this.indice = 0;
        this.anteriorNo = null;
        this.proximoNo = null;
    }

    public T getDado() {
        return this.dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }


    public NoDuplo<T> getAnteriorNo() {
        return this.anteriorNo;
    }

    public void setAnteriorNo(NoDuplo<T> anteriorNo) {
        this.anteriorNo = anteriorNo;
    }


    public NoDuplo<T> getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(NoDuplo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }


    public int getIndice() {
        return this.indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    


    @Override 
    public String toString(){
        return "{Indice: "+ getIndice()+"| Dado:"+getDado()+"}";
    }

}
