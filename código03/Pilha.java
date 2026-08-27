package código03;
public class Pilha<T>{
    private String nomePilha;
    private No<T> topo;

    public Pilha(){
        this("");
    }
    public Pilha(String nomePilha){
        this.nomePilha = nomePilha;
        this.topo = null;
    }   

    public void setNomePilha(String nomePilha){
        this.nomePilha = nomePilha;
    }

    public String getNomePilha(){
        return this.nomePilha;
    }

    public No<T> getTopo() {
        return topo;
    }
    public void setTopo(No<T> topo){
        this.topo = topo;
    }

    

}