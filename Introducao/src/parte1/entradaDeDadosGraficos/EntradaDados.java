package parte1.entradaDeDadosGraficos;

import javax.swing.*;

public class EntradaDados {

    public static void main(String[] args) {
        //Entrada de dados viaJOptionPane


        int idade=Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));
        System.out.println("A pessoa tem " + idade+ " anos");
        JOptionPane.showMessageDialog(null,"A pessoa tem " + idade+ " anos");

        float salario = Float.parseFloat(JOptionPane.showInputDialog("Qual os eu salário"));
        System.out.println("O seu salário é "+ salario);
        JOptionPane.showMessageDialog(null,"O seu salário é "+ salario );




    }
}
