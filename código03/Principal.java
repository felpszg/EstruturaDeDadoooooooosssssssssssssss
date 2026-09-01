package código03;
public class Principal{
    public static void main(String[] args) {
       Pilha<String> pilha = new Pilha<String>("Letras");


       System.out.println(pilha.peek());
        pilha.imprimePilha();
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.imprimePilha();

        System.out.println("Explosao de "+ pilha.pop());

        pilha.imprimePilha();
        System.out.println(pilha.peek());



    }
}