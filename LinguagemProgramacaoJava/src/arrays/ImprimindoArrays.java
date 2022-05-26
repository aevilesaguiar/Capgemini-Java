package arrays;

public class ImprimindoArrays {

    public static void main(String[] args) {

        //declarando um array
        String[] paises = new String[5];

        //inicializar o array
        paises[0]="Brasil";
        paises[1]="Alemanha";
        paises[2]="Itália";
        paises[3]="Aústria";
        paises[4]="Polônia";

        //foreach
        for (String lista:paises) {
            System.out.println(lista);
        }

       int[] anos = new int[4];

        anos[0]=1994;
        anos[1]=1999;
        anos[2]=2000;
        anos[3]=2009;

        for (int dados:anos) {
            System.out.println(anos);
        }

    }
}
