package parte1.lacoDeRepeticao;

public class For {
    public static void main(String[] args) {
        //For
        int dado=0;
        for (int i = 1; i<=10; i++){
            System.out.println("i"+i);
            dado=i;
        }
        System.out.println("Sai do laço e executei " + dado+"vezes");

        for (int j=1; j<=15; j++){
            System.out.println("Estou fazendo a "+j+ "ª vez");
            if(j==5){
                System.out.println("Parei na "+j+" ª vez");
            }

            if(j==10){
                System.out.println("Parei na "+j+" ª vez");
                break;
            }


        }




    }
}
