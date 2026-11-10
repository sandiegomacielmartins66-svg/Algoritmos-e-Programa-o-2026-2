import java.util.Scanner;
public class Main5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número:");
        numero =input.nextInt();
        for (int i=1; i<=10; i++){
            int resultado = numero * i;
            System.out.println(resultado);
        }
    }
}
