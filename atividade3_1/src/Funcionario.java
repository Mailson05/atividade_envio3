import java.time.LocalDate;
import java.time.Period;


class Funcionario {
    private String nome;
    private LocalDate nasc;
    private double salario;

    public Funcionario(String nome, LocalDate nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public double informarSalario() {
        return this.salario;
    }

    public int calcularIdade() {
        return Period.between(this.nasc, LocalDate.now()).getYears();
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNasc() {
        return nasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNasc(LocalDate nasc) {
        this.nasc = nasc;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
