package AulaPrática01.Pilha.ListaDupla;

public class Principal{
    public static void main(String[] args) {
        ListaDupla<Produto> listadupla = new ListaDupla<Produto>("Produtos");

        listadupla.addInicio(new Produto("Arroz", 5.50));
        listadupla.addFinal(new Produto("Feijão",6.99));
        listadupla.addMeio(new Produto("Macarrão",3.49), 1);

        listadupla.imprimeLista();

        System.out.println("Removido: "+listadupla.removeMeio(1));

        listadupla.addInicio(new Produto("Tomate",2.99));
        listadupla.addFinal(new Produto("Batata",4.99));
        listadupla.imprimeLista();
       
}     
    }
