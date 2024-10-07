import java.time.LocalDate;


class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, LocalDate nasc, double salario, String linguagem) {
        super(nome, nasc, salario);
        this.linguagem = linguagem;
    }

    public String informarLinguagem() {
        return this.linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}