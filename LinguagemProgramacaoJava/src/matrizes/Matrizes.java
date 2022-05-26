package matrizes;

import javax.swing.*;

public class Matrizes {
    public static void main(String[] args) {

        /*
        * Escreva um algoritmo que solicite a entrada de quatro notas
        * para cada aluno, calcular a média dos alunos e exibir em tela.
        * Ao final mostrar a media da turma.
        * Ao lado da media do aluno deve seguir a seguinte regra de negócio
        * Se media >=7,5   -> Aluno Aprovado
        * Se media >= 5,5 e <7,5  -> Aluno em recuperação
        * Se media <5,5 -> Aluno Reprovado
        * */

        //Declarando o vetor
        String [] alunos={"Joao", "Maria", "Aline"};

        //Matriz de notas
        float notas[][]=new float[3][4];

        // somaNotas: controla o somatório das notas de cada aluno
        // mediaAlunos para calcular a media do aluno
        float somaNotas, mediaAluno;

        //armazena o status do aluno e utilizado para imprimir o boletim
        String statusAluno;

        //Informa as notas do aluno
        //laço externo para associar aluno á nota
        for (int i=0; i<alunos.length;i++ ){
            //varre as linhas
            System.out.println("Aluno : "+alunos[i]);

            //laço interno para informar a nota de cada aluno
            somaNotas=0;
            mediaAluno=0;
                //varre as colunas que são as notas
                for (int k=0;k<4; k++){
                    notas[i][k] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nº " + (k+1) + " do aluno " + alunos[i]));
                    somaNotas=somaNotas+notas[i][k];
                }
                mediaAluno=somaNotas/4;

                if(mediaAluno>=7.5){
                    statusAluno="APROVADO";
            }else if ((mediaAluno>=5.5) && (mediaAluno<7.5)) {
                    statusAluno="EM RECUPERAÇÃO";

            }else{
                    statusAluno="REPROVADO";
                }


        //impressão boletim

        System.out.println("***************Boletim***********************");
        System.out.println("Aluno: "+alunos[i]);
            System.out.println("Notas");
            for (int j1 = 0; j1 < notas.length ; j1++) {
                System.out.println((j1+1)+ " - "+notas[i][j1]);
            }

            System.out.println("Media...: "+mediaAluno+" - "+ statusAluno);
        }

    }
}
