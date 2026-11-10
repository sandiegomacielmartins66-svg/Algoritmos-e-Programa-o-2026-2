import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota;
        System.out.println("Sua nota:");
        nota = input.nextDouble();
        if (nota >= 8) {
            System.out.println("Aluno aprovado!");
        } else if (nota >= 6) {
            System.out.println("Aluno em recuperação.");
        } else if (nota <= 5) {
            System.out.println("Aluno reprovado.");
        }
    }
}
