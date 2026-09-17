package AulaPrática01.Pilha.ListaDupla;

public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public Produto(){
        this.nomeProduto = null;
        this.precoProduto = 0;
    }
    public Produto(String nome,double preco){
        this.nomeProduto = nome;
        this.precoProduto = preco;
    }





    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }





    public double getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }



@Override 
    public String toString(){
        return "{Nome do Produto: "+ getNomeProduto()+"| Preço:"+getPrecoProduto()+"}";
    }







}
