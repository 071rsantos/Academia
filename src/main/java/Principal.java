import entities.Academia;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Academia academia = new Academia();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        academia.matricularAluno();

        System.out.println("Mostrar dados do aluno? (1sim / 2nao) ");
        int opc = sc.nextInt();
        switch (opc){
            case 1:
                academia.mostrarDadosAlunos();
                break;
            case 2:
                System.out.println("Encerrado.");
                break;
        }

    }
}
