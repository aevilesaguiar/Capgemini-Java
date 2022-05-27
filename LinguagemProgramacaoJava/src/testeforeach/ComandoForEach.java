package testeforeach;

public class ComandoForEach {
    //criar um vetor, carregá-lo já iniciáliza-lo e en seguida vou
    //ler os elementos do vetor usando foreach
    public static void main(String[] args) {
        int [] vetorNumero = new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println("Varrendo o vetor sem For Each");
        for (int i = 0; i < vetorNumero.length; i++) {

            System.out.println("Nr: "+vetorNumero[i]);

        }

        System.out.println("Varrendo o vetor com For Each");
        //varrendo com forEach

        for (int listaNumeros:vetorNumero) {
            System.out.println("Nr: "+listaNumeros);
        }


    }


}
