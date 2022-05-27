package testeThrows;

public class TesteString {

    private static void aumentarLetras() throws NullPointerException{//lançando exceção
        String frase = null;
        String novaFrase= null;
        novaFrase=frase.toUpperCase();
        System.out.println("Frase antiga: "+frase);
        System.out.println("Frase nova: "+novaFrase);
    }

    public static void main(String[] args) {
        try {
            aumentarLetras();
        }catch(NullPointerException e){
            System.out.println("Ocorreu um NULLpointer Exception ao executar o metodo aumentar letras");
        }



    }
}
