package construtores;

public class Main {
    public static void main(String[] args) {
    //dados através do construtor
        Aluno aluno=new Aluno(9.5,8.8,8.0);
    //calculando a média
        double mediaAlunoFinal=aluno.calcularMediaAluno();

        //definindo a situação do aluno

        if(mediaAlunoFinal<6){
            aluno.situacaoAluno=STATUS.REPROVADO;
        }else{
            aluno.situacaoAluno=STATUS.APROVADO;
        }

        //imprimindo a situação do aluno
        System.out.println(" A média do aluno é: " + aluno.calcularMediaAluno() + " e o mesmo está "+ aluno.situacaoAluno);
    }
}
