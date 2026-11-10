import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float Celcius;
        int opção;
        double resultado;
        System.out.println("Digite a temperatura em Celcius:");
        Celcius = input.nextFloat();
        System.out.println("Digite 1 para converção em Fahrenheit ou 2 para converção em Kelvin:");
        opção = input.nextInt();
        if (opção ==1) {
            resultado = Celcius * 1.8 + 32;
            System.out.println("Fahrenheit:" + resultado);
        }
        if (opção == 2) {
            resultado = Celcius + 273.15;
            System.out.println("Kelvin:" + resultado);
        }
        if (opção !=1 && opção !=2){
            System.out.println("Opção inválida.");
        }
    }
}
