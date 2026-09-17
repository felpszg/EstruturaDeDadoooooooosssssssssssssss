package AulaPrática01.Pilha.ListaDupla;
public class ListaDupla<T> {
    private String nomeLista;
    private int tamanho;
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    public ListaDupla(){
        this("Lista Dupla");
    }
    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.tamanho = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }


    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
        atualizaIndice();
        tamanho += 1;
    }

    public void atualizaIndice(){
        NoDuplo<T> aux = primeiroNo;
        int indice = 0;
        while (aux!= null) {
            aux.setIndice(indice);
            aux = aux.getProximoNo();
            indice++;
        }
    }


    public void addFinal(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo =novoNo;
        }
        ultimoNo.setIndice(tamanho);
        tamanho += 1;

}

    public void imprimeLista(){
        if (primeiroNo==null) {
            System.out.println("vazio lista");
        }else{
        System.out.println("Dados da lista: "+ nomeLista);
        NoDuplo<T> aux = primeiroNo;
        while (aux!=null) {
            System.out.println(aux.getDado().toString());
            aux = aux.getProximoNo();
        }}
    }

    public T removeInicio(){
        if (primeiroNo == null) {
            System.out.println("lista vazia");
            return null;
        }else{
            T dado = primeiroNo.getDado();
            primeiroNo = primeiroNo.getProximoNo();

            if (primeiroNo!=null) {
                primeiroNo.setAnteriorNo(null);
            }else{
                ultimoNo=null;
            }
            atualizaIndice();
            tamanho--;
            return dado;        
        }
    }


    public T removeFinal(){
        if (primeiroNo==null) {
            System.out.println("vazio roxo");
            return null;
        }else{
            T dadoTemporario = ultimoNo.getDado();
            ultimoNo = ultimoNo.getAnteriorNo();
            
            if(ultimoNo!=null){
                ultimoNo.setProximoNo(null);
            }else{
                primeiroNo = null;
            }
            tamanho--;
            return dadoTemporario;
        }
    }

    public void addMeio(T dado, int posicao){
        if(posicao <= 0){
            addInicio(dado);
            return;
        }

        if(posicao >= tamanho){
            addFinal(dado);
            return;
        }

        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;

        while (atual != null && indice < posicao) { 
            atual = atual.getProximoNo();
            indice++;
        }

        novoNo.setProximoNo(atual);
        novoNo.setAnteriorNo(atual.getAnteriorNo());
        novoNo.getAnteriorNo().setProximoNo(novoNo);
        novoNo.getProximoNo().setAnteriorNo(novoNo);
        atualizaIndice();
        tamanho++;    
    }




    public T removeMeio(int posicao){
        T dadoTemp;
        if(posicao<=0){
            dadoTemp = removeInicio();
            return dadoTemp;
        }
        if(posicao>=tamanho-1){
            dadoTemp = removeFinal();
            return dadoTemp;
        }

        NoDuplo<T> atual = primeiroNo;
        int indice = 0;
        while (atual != null && indice < posicao) {
            atual = atual.getProximoNo();
            indice++;
        }
        dadoTemp = atual.getDado();
        atual.getAnteriorNo().setProximoNo(atual.getProximoNo());
        atual.getProximoNo().setAnteriorNo(atual.getAnteriorNo());
        
        atualizaIndice();
        tamanho--;
        return dadoTemp;
    }





}
