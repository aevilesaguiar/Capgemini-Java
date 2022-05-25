package parte1.lacoDeRepeticao;

public class LacoRepeticao {
    public static void main(String[] args) {

        //Comando While

        int qtdeVezes =1;

        //laço pré testado
        System.out.println("***********************While************************");
        while(qtdeVezes<=10){
            System.out.println("Estou fazendo a " + qtdeVezes+ " ª vez");

            qtdeVezes++;
        }
        System.out.println("Sai do laço e executei " + (qtdeVezes-1));
        System.out.println("***************************************");
//laço pós testado
        System.out.println("********************Do While*******************");

        qtdeVezes=0;
        do {
            System.out.println("Estou fazendo a " + qtdeVezes+ " ª vez");
            qtdeVezes++;
        }while (qtdeVezes<=10);
        System.out.println("Sai do laço e executei " + (qtdeVezes-1));
    }
}
