package construtores;

public class Aluno {

    private double nota1;
    private double nota2;
    private double nota3;
    STATUS situacaoAluno;
    MATRICULA situacaMatricula;

    public Aluno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    //método calcular media aluno
    public double calcularMediaAluno(){
        double mediaAluno=0;

        //calculo Media
        mediaAluno=(this.nota1+this.nota2+this.nota3)/3;

        return mediaAluno;
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", situacaoAluno=" + situacaoAluno +
                '}';
    }

}
