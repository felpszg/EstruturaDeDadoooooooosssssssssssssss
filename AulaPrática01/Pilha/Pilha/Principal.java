package AulaPrática01.Pilha.Pilha;
public class Principal{
    public static void main(String[] args) {
       Pilha<String> pilha = new Pilha<String>("Linguagens de programação");

        pilha.push("Java");
        pilha.push("TypeScript");
        pilha.push("C#");
        pilha.imprimePilha();

        System.out.println("Removido: "+pilha.pop());
        System.out.println("Topo: "+pilha.peek());
        
        pilha.push("Portugol");
        pilha.push("C++");
        pilha.imprimePilha();


    }
}