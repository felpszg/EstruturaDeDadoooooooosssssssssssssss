import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa();

        

        System.out.println("Nome:");
        String nome = scanner.nextLine();
        obj1.setNome(nome);

        System.out.println("idade:");
        int idade = scanner.nextInt();
        obj1.setIdade(idade);


        System.out.println(obj1.toString());
    }
}