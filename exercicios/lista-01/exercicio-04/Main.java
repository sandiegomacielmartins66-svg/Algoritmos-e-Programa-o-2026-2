import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double preco;
        double desconto;
        System.out.println("Digite o preço do produto");
        preco = input.nextDouble();
        desconto = preco * 0, 9;
        System.out.println(desconto);
    }
}
