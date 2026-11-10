import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int maior;
        System.out.println("Digite o primeiro número:");
        numero1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        numero2 = input.nextInt();
        System.out.println("Digite o terceiro número:");
        numero3 = input.nextInt();
        maior = numero1;
        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior){
            maior = numero3;
        }
        System.out.println("O maior número dentre os três:" + maior);
    }
}
