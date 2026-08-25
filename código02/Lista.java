package código02;
public class Lista<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeLista;

    public Lista(){
        this("Lista");
    }

    public Lista(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }
        else{
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }

    }

    public void removeInicio(){
        if (primeiroNo ==null) {
            System.out.println("Não tem primeiro nó");
        }
        else {
             System.out.println("o dado:"+primeiroNo.getDado()+ "foi obliterado");
            if(primeiroNo==ultimoNo){
                primeiroNo = null;
                ultimoNo = null;
            }else{
            primeiroNo = primeiroNo.getNextNo();
        }
    }  
}

    public void imprimeLista(){
        if (primeiroNo == null) {
            System.out.println("Vazio.");
        }else{
            System.out.println("Nome da lista:"+getNomeLista());
            No<T> aux = primeiroNo;
        while( aux != null) {
            System.out.println(aux.getDado());
            aux = aux.getNextNo();
        }
       }
    }
    
    











    public void setNomeLista(String nome){
        this.nomeLista = nome;
    }
    public String getNomeLista(){
        return this.nomeLista;
    }

    public void setPrimeiroNo(No<T> primeiroNo){
        this.primeiroNo = primeiroNo;
    }
    public No<T> getPrimeiroNo(){
        return this.primeiroNo;
    }

    public void setUltimoNo(No<T> ultimoNo){
        this.ultimoNo = ultimoNo;
    }

    public No<T> getUltimoNo(){
        return this.ultimoNo;
    }
}
