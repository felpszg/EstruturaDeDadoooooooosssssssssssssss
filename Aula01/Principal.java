public class Principal{
    public static void main(String[] args){

        //Alunos
        No obj1 = new No("Rafael");
        obj1.setNextNo(new No("Cecília"));
        obj1.getNextNo().setNextNo(new No("zeca"));
        obj1.getNextNo().getNextNo().setNextNo(new No("Ze doido"));


        No aux = obj1;
        while (aux != null){
            System.out.println(aux.getDado());
            aux = aux.getNextNo();
        }
    }
}