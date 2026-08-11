import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Principal{
    public static void main(String[] args){

    Scanner sim = new Scanner(System.in);

    Pessoa obj1 = new Pessoa("home",4);
    Pessoa obj2 = new Pessoa();
    Pessoa obj3 = new Pessoa();

    System.out.println("Digite seu nome:");
    obj3.setNome(sim.nextLine());
    
    System.out.println("Idade:");
    obj3.setIdade(sim.nextInt());

   // System.out.println(obj1.toString());
   // System.out.println(obj2.toString());
   // System.out.println(obj3.toString());


    ArrayList<Pessoa> pessoas123 = new ArrayList<Pessoa>();
    pessoas123.add(obj1);
    pessoas123.add(obj2);
    pessoas123.add(obj3);

    for(Pessoa auxPessoa: pessoas123){
        System.out.println(auxPessoa.toString());
    }
    
    pessoas123.get(1).setNome("josefo");
    pessoas123.get(1).setIdade(34);

    System.out.println(pessoas123.get(1));


    
    }
}