import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valor;
        double desconto = 0.9;
        double resultado;
        System.out.println("Valor da compra:");
        valor = input.nextFloat();
        if (valor >= 100) {
            resultado = valor * 0.9;
            System.out.println("Recebe desconto" + resultado);
        } else {
            {
                System.out.println("Não recebe desconto.");
            }
        }
    }
}
