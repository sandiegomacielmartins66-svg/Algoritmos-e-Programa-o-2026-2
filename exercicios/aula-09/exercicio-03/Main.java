import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double numero;
        double par;
        double impar;
        System.out.println("Insira um número:");
        numero = input.nextDouble();
        if (numero % 2 == 0){
            System.out.println("Par");
            System.out.println("Valor do número ao quadrado:" + numero * numero);
            System.out.println("Valor do número ao cubo:" + numero * numero * numero);
        }
        if (numero % 2 == 1){
            System.out.println("Impar");
            System.out.println("Valor do número ao quadrado:" + numero * numero);
            System.out.println("Valor do número ao cubo:" + numero * numero * numero);
        }
    }
}
