package parte2.classeConceito2;

import parte2.classeConceito.Pessoa;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(String nomePessoa, Integer idadePessoa, String cpf) {
        super(nomePessoa, idadePessoa);
        this.cpf = cpf;
    }


    public PessoaFisica() {

    }


    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + " nome =" + this.getNomePessoa()+ '\'' +
                '}';
    }
}
