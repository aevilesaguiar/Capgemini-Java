package parte2.classeConceito2;

import parte2.classeConceito.Pessoa;

public class PessoaJuridica {


    private String cnpj;
    private Pessoa pessoa;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
