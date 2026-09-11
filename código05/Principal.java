package código05;

public class Principal{
    public static void main(String[] args) {
        
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        lista.addInicio("Felps");
        lista.addInicio("Joao");
        lista.imprimeLista();
        System.out.println("dado explodido: "+lista.removeInicio());
    }
}