package AulaPrática01.Pilha.Pilha;
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

    public void push(T dado){
        No<T> novoNo = new No<T>(dado);
        novoNo.setNextNo(topo);
        topo = novoNo;
    }

    public T pop(){
        if(topo==null){
            System.out.println("Lista vazia mano");
            return null;
        }
        T dado = topo.getDado();
        topo = topo.getNextNo();
        return dado;
    }

    public void imprimePilha(){
        No aux = topo;
        if(aux==null){
            System.out.println("VAzioo!!!!");
        }
        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getNextNo();
        }
    }

    public T peek(){
        if (topo ==null) {
            System.out.println("Vazio");
            return null;
        }
        return topo.getDado();
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