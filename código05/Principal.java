package código05;

public class Principal{
    public static void main(String[] args) {
        
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        lista.addInicio("Felps");
        lista.addInicio("Joao");
        lista.addInicio("Felipeira");
        lista.addInicio("Tiahos");
        System.out.println(lista.removeMeio(1));
        lista.imprimeLista();
}     
    }
