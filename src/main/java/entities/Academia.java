package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Academia {
    Scanner sc = new Scanner(System.in);
    //iniciar com 3 instrutores.
    Instrutor instrutor = new Instrutor("Fernando", "Emagrecimento");
    Instrutor instrutor2 = new Instrutor("João Augusto", "Hipertrofia");
    Instrutor instrutor3 = new Instrutor("Giovanni", "Condicionamento");

    //Iniciar com 3 tipos de treino
    Treino ab = new Treino("AB", "SUPERIORES E INFERIORES");
    Treino abc = new Treino("ABC", "PUXADAS, EMPURRADAS E PERNAS");
    Treino abcd = new Treino("ABCD", "QUADRICEPS & PANTURRILHA, PEITO & TRICEPS, COSTAS & BICEEPS, OMBRO & POSTERIOR");

    //Inicializar arrayList
    List<Aluno> list = new ArrayList<>();

    //Declarar aluno
    Aluno aluno;

    //coletar dados do aluno
    public void matricularAluno(){
        sc.nextLine();
        System.out.println("##### MATRICULAR ALUNO #####");
        System.out.println("--------------------------------------------------------------");
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine().toUpperCase();
        System.out.println("Escolha seu professor baseado no seu foco: \n");
        System.out.print("INSTRUTOR"+"          "+"ESPECIALIDADE");
        System.out.println("\n---------------------------------------------------------------");
        System.out.format("1 " +instrutor);
        System.out.println();
        System.out.format("2 "+instrutor2);
        System.out.println();
        System.out.format("3 " +instrutor3);
        System.out.println("\n----------------------------------------------------------------");
        int opc = sc.nextInt();

        switch (opc) {
            case 1 -> {
                aluno = new Aluno(nome, instrutor, abc);
                list.add(aluno);
                System.out.println("Aluno matriculado");
            }
            case 2 -> {
                aluno = new Aluno(nome, instrutor2, abcd);
                list.add(aluno);
                System.out.println("Aluno matriculado");
            }
            case 3 -> {
                aluno = new Aluno(nome, instrutor3, ab);
                list.add(aluno);
                System.out.println("Aluno matriculado");
            }
            default -> {
                System.out.println("Opcao invalida.");
                break;
            }
        }
    }
    public void mostrarDadosAlunos(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ALUNO" + "          "+ "INSTRUTOR" +"            "+"FOCO"+ "            "+ "TREINO");
            System.out.println("\n------------------------------------------------------------------------");
            System.out.printf(list.get(i).getNome()+ "          "+ list.get(i).getInstrutor()+ "          "+ list.get(i).getTreino());
            System.out.println("\n------------------------------------------------------------------------");

        }
    }

    public void mostrarTreino(){
        System.out.println("Digite o nome do aluno que deseja acessar o treino: ");
        sc.nextLine();
        String nome = sc.nextLine().toUpperCase();
        Integer pos = position(list, nome);
         if (pos == null){
             System.out.println("Aluno não encontrado.");
         }
         else{
             System.out.println("#### TREINO ###");
             System.out.printf(list.get(pos).getTreino().getGrupamento());
         }
    }

    public Integer position(List<Aluno> list, String nome) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return null;
    }

}
