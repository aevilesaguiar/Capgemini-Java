package parte1.comandosCondicionais;

public class ComandosCondicionaisEx {
    public static void main(String[] args) {

        int idade=16;


        if (idade>=18){

            System.out.println("Pode dirigir!");

            if (idade >65) {
                System.out.println(" Mas, Deve ser avaliado a sua condição");

            }
        }else {
            System.out.println("Não pode dirigir");
        }

    }
}
