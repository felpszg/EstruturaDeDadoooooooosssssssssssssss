public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(){
        nome = null;
        idade = 0;
    }

    public Pessoa(String nome, int idade){
       setNome(nome);
       setIdade(idade); 
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public String toString(){
        return String.format("Pessoa{nome: %s,Idade: %d }",this.getNome(),this.getIdade());
    }





    
}