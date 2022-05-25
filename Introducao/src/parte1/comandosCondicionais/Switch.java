package parte1.comandosCondicionais;

public class Switch {
    public static void main(String[] args) {

        int op = '9';

        System.out.println("Escolha uma das opções: \n1-Inclusão\n2-alteração\n3-exclusão\n4-consulta");

        switch (op) {
            case '1': {
                System.out.println("Chame programa de Inclusão");
                break;
            }
            case '2': {
                System.out.println("Programa de alteração");
                break;
            }
            case '3': {
                System.out.println("Programa de Exclusão");
                break;
            }

            case '4': {
                System.out.println("Programa de Consulta");
                break;
            }
            default:
            {
                System.out.println("Opção incorreta");
                break;

            }


        }
    }
}