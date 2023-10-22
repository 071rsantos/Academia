import entities.Academia;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Academia academia = new Academia();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int opc;

        do {System.out.println("\n----------------------------------------------------------\n" +
                "O que deseja?\n" +
                "1: Matricular aluno.\n" +
                "2: Mostrar dados do aluno.\n" +
                "3: Mostrar treino do aluno.\n" +
                "4: Encerrar programa." +
                "\n----------------------------------------------------------\n");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    academia.matricularAluno();
                    break;
                case 2:
                    academia.mostrarDadosAlunos();
                    break;
                case 3:
                    academia.mostrarTreino();
                    break;
                case 4:
                    System.out.println("Encerrado.");
                    break;
            }
        } while (opc!=3);

    }
}
