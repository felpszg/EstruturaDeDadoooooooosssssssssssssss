public class Endereco{
    private String nomeRua;
    private int numero;
    private String bairro;


    public Endereco(){
        this(null,0,null);
    }


    public Endereco(String nomeRua,int numero, String bairro){
        setNomeRua(nomeRua);
        setNumero(numero);
        setBairro(bairro);
    }


    public void setNomeRua(String nomeRua){
        this.nomeRua = nomeRua;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }


    public String getNomeRua(){
        return this.nomeRua;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getBairro(){
        return this.bairro;
    }

    @Override
    public String toString(){
        return String.format("Endereco [Rua:%s,Número:%i,Bairo:%s]", getNomeRua(),getNumero(),getBairro());
    }



}