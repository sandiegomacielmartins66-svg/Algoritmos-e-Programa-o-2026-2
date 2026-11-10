import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double renda;
        double prestacao;
        double limite;
        System.out.println("Digite sua renda mensal:");
        renda = input.nextDouble();
        System.out.println("Digite o valor da prestação:");
        prestacao = input.nextDouble();
        limite = renda * 0.30;
        if (prestacao > 3000 && renda < 10000) {
            System.out.println("Financiamento negado por alta prestação");
        }
        else if (prestacao > limite) {
            System.out.println("Financiamento negado por baixa renda");
        }
        else {
            System.out.println("Financiamento aprovado");
        }
        input.close();
    }
}
