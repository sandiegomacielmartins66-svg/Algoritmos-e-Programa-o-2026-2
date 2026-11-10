import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double kWh;
        double valor;
        System.out.println("Digite o consumo por kWh:");
        kWh = input.nextDouble();
        if (kWh<= 100) {
            valor = kWh *0.50;
            System.out.println("Valor da conta:" + valor);
        }
        if (kWh>=101 && kWh<200) {
            valor = kWh * 0.70;
            System.out.println("Valor da conta:" + valor);
        }
        if (kWh>200){
            valor = kWh * 0.90;
            System.out.println("Valor da conta:" + valor);
        }
    }
}
