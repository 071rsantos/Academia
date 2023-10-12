import entities.Academia;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Academia academia = new Academia();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int opc;

        academia.matricularAluno();

        do {System.out.println("\n----------------------------------------------------------\n" +
                "O que deseja?\n" +
                "1: Mostrar dados do aluno.\n" +
                "2: Mostrar treino do aluno.\n" +
                "3: Encerrar programa." +
                "\n----------------------------------------------------------\n");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    academia.mostrarDadosAlunos();
                    break;
                case 2:
                    academia.mostrarTreino();
                    break;
                case 3:
                    System.out.println("Encerrado.");
                    break;
            }
        } while (opc!=3);

    }
}
