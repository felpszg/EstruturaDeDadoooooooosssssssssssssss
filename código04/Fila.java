package código04;
public class Fila<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    public String nomeFila;

    public Fila(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.nomeFila = null;
    }

    public Fila(String dado){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.nomeFila = dado;
    }





    public No<T> getPrimeiroNo() {
        return primeiroNo;
    }
    public void setPrimeiroNo(No<T> primeiroNo) {
        this.primeiroNo = primeiroNo;
    }
    public No<T> getUltimoNo() {
        return ultimoNo;
    }
    public void setUltimoNo(No<T> ultimoNo) {
        this.ultimoNo = ultimoNo;
    }
    public String getNomeFila() {
        return nomeFila;
    }
    public void setNomeFila(String nomeFila) {
        this.nomeFila = nomeFila;
    }







    
}
