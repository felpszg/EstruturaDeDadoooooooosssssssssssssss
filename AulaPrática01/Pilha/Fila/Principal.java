package AulaPrática01.Pilha.Fila;
public class Principal{
    public static void main(String[] args) {
       Fila<String> fila = new Fila<String>("Alunos");

        fila.enfileirar("Felipe");
        fila.enfileirar("Roberto");
        fila.enfileirar("Paulo");
        fila.imprimeFila();

        System.out.println("Removido: "+fila.desenfileirar());
        System.out.println("Primeiro: "+fila.getPrimeiroNo().getDado());

        System.out.println("");

        fila.enfileirar("Fernando");
        fila.enfileirar("Ramon");
        fila.imprimeFila();

    }
}