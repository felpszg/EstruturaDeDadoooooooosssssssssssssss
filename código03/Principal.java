package código03;
public class Principal{
    public static void main(String[] args) {
       Pilha<String> pilha = new Pilha<String>("Letras");

        pilha.push("Java");
        pilha.push("TypeScript");
        pilha.push("C#");
        pilha.imprimePilha();

    }
}