package arrays;

import javax.swing.*;

public class TrabalhandoArray {

    public static void main(String[] args) {
      /*  //declarando array de paises
        String[] paises = new String[4];

        //input do array de paises
        for (int i=0; i< paises.length; i++){
            paises[i] = JOptionPane.showInputDialog("Informe um país");

        }
        //listando o array de paises
        for (String listaPaises:paises) {
            System.out.println(listaPaises);
        }
*/
        //declarando array de inteiros
        int[] numeros = new int[10];

        //input array de numeros
        for (int i=0; i< numeros.length;i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Informe os numeros"));
        }

        //listar array de numeros antes do cáculo
        for (Integer listaNumeros:numeros) {
            System.out.println(listaNumeros);
        }

        int novoValor=11;
        numeros[8]=novoValor+4;


        //listar array de numeros após o cáculo
        for (Integer listaNumeros:numeros) {
            System.out.println(listaNumeros);
        }


    }

}
