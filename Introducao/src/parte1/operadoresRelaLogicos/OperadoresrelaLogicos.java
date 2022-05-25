package parte1.operadoresRelaLogicos;

public class OperadoresrelaLogicos {
    public static void main(String[] args) {

        //Operadores Relacionais
        //> <  >=  <= != ==

        int num1=6;
        int num2=3;
        int num3=num1-num2;

        if (num1==num3){
            System.out.println("Verdadeiro");
        }else if(num2!=num1){
            System.out.println("Verdadeiro");
        }

        System.out.println(num1 + " é > que "+num3+" : "+ (num1>num3));
        System.out.println(num1 + " é < que "+num2+" : "+ (num1<num2));
        System.out.println(num1 + " é > que "+num3+" : "+ (num1>num3));
        System.out.println("************Operadores Lógicos*******************");

        int dado1=50, dado2=65, saldo=100;
        //&& = E /and     || =OU /OR

        if(dado2>dado1 && saldo>=120 ){
            System.out.println("Você bateu a meta");
        }else if(dado2>dado1 && saldo<120){
            System.out.println("Falta pouco para bater a meta");
        } else if (dado1>dado2  || saldo<120) {
            System.out.println(" Não foi muito bem!");
        }


    }
}
