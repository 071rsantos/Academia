package entities;

import java.util.Locale;
import java.util.Scanner;

public class Academia {
    Scanner sc = new Scanner(System.in);
    //iniciar com 3 instrutores.
    Instrutor instrutor = new Instrutor("Fernando", "Emagrecimento");
    Instrutor instrutor2 = new Instrutor("João", "Hipertrofia");
    Instrutor instrutor3 = new Instrutor("Giovanni", "Condicionamento");

    //Iniciar com 3 tipos de treino
    Treino ab = new Treino("AB", "SUPERIORES E INFERIORES");
    Treino abc = new Treino("ABC", "PUXADAS, EMPURRADAS E PERNAS");
    Treino abcd = new Treino("ABCD", "QUADRICEPS & PANTURRILHA, PEITO & TRICEPS, COSTAS & BICEEPS, OMBRO & POSTERIOR");

    //Declarar aluno
    Aluno aluno;

    //coletar dados do aluno
    public void matricularAluno(){
        System.out.println("##### MATRICULAR ALUNO #####");
        System.out.println("--------------------------------------------------------------");
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Escolha seu professor baseado no seu foco: ");
        System.out.format("15%s 15%s", "INSTRUTOR", "ESPECIALIDADE");
        System.out.println("---------------------------------------------------------------");
        System.out.format("15%s 1", instrutor);
        System.out.format("15%s 2", instrutor2);
        System.out.format("15%s 3", instrutor3);
        int opc = sc.nextInt();
        switch (opc){
            case 1:
                aluno = new Aluno(nome,instrutor,abc);
                System.out.println("Aluno matriculado");
                break;
            case 2:
                aluno = new Aluno(nome,instrutor2,abcd);
                System.out.println("Aluno matriculado");
                break;
            case 3:
                aluno = new Aluno(nome,instrutor3,ab);
                System.out.println("Aluno matriculado");
                break;
            default:
                System.out.println("Opcao invalida.");;
                break;
        }
    }
    public void mostrarDadosAlunos(){
        System.out.format("15%s 15%s 15%s", "ALUNO", "INSTRUTOR", "TREINO");
        System.out.println("\n------------------------------------------------------------------------");
        System.out.format("15%s 15%s 15%s", aluno.getNome(), aluno.getInstrutor(), aluno.getTreino());
        System.out.println("\n------------------------------------------------------------------------");
    }

}
