import java.time.LocalDate;

class Gerente extends Funcionario {
    private String projeto;

    public Gerente(String nome, LocalDate nasc, double salario, String projeto) {
        super(nome, nasc, salario);
        this.projeto = projeto;
    }

    public String informarProjeto() {
        return this.projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
}
