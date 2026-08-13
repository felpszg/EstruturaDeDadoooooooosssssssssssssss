import java.util.Scanner;
import java.util.ArrayList;

public class Principal{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();

        Pessoa obj1 = new Pessoa("Rafael",35);
        Pessoa obj2 = new Pessoa();
        Pessoa obj3 = new Pessoa();
        Pessoa obj4 = new Pessoa("Gaybriel",29, new Endereco("Dos bobos",3,"emeraldo"));
        //Pessoa obj3;

        System.out.println("Nome: " + obj1.getNome());
        System.out.println("Idade: " + obj1.getIdade());  
        
        System.out.println("Digite o nome: ");
        //String nome = input.nextLine();
        obj3.setNome(input.nextLine());

        System.out.println("Digite a idade: ");
        //int idade = input.nextInt();
        obj3.setIdade(input.nextInt());

        //obj3 = new Pessoa(nome, idade);
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());

        listaP.add(obj1);
        listaP.add(obj2);
        listaP.add(obj3);
        listaP.add(obj4);


        for(Pessoa auxPessoa: listaP){
            System.out.println(auxPessoa.toString());
        }

        listaP.get(1).setNome("Joaquim");
        listaP.get(1).setIdade(1);
        
        System.out.println(listaP.get(1));
        System.out.println(obj2.toString());

        
        

    }
}