import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja cadastrar um Gerente (1) ou um Programador (2)?");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha) {
            case 1:
                System.out.println("Cadastro de Gerente:");
                System.out.print("Nome: ");
                String nomeGerente = scanner.nextLine();

                System.out.print("Ano de nascimento: ");
                int anoGerente = scanner.nextInt();
                System.out.print("Mês de nascimento: ");
                int mesGerente = scanner.nextInt();
                System.out.print("Dia de nascimento: ");
                int diaGerente = scanner.nextInt();

                System.out.print("Salário: ");
                double salarioGerente = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Projeto: ");
                String projetoGerente = scanner.nextLine();

                Gerente gerente = new Gerente(nomeGerente, LocalDate.of(anoGerente, mesGerente, diaGerente), salarioGerente, projetoGerente);
                System.out.println("Gerente cadastrado com sucesso!");
                System.out.println("Nome: " + gerente.getNome());
                System.out.println("Idade: " + gerente.calcularIdade());
                System.out.println("Salário: " + gerente.informarSalario());
                System.out.println("Projeto: " + gerente.informarProjeto());
                break;

            case 2:

                System.out.println("Cadastro de Programador:");
                System.out.print("Nome: ");
                String nomeProgramador = scanner.nextLine();

                System.out.print("Ano de nascimento: ");
                int anoProgramador = scanner.nextInt();
                System.out.print("Mês de nascimento: ");
                int mesProgramador = scanner.nextInt();
                System.out.print("Dia de nascimento: ");
                int diaProgramador = scanner.nextInt();

                System.out.print("Salário: ");
                double salarioProgramador = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Linguagem: ");
                String linguagemProgramador = scanner.nextLine();

                Programador programador = new Programador(nomeProgramador, LocalDate.of(anoProgramador, mesProgramador, diaProgramador), salarioProgramador, linguagemProgramador);
                System.out.println("Programador cadastrado com sucesso!");
                System.out.println("Nome: " + programador.getNome());
                System.out.println("Idade: " + programador.calcularIdade());
                System.out.println("Salário: " + programador.informarSalario());
                System.out.println("Linguagem: " + programador.informarLinguagem());
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}