import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade;
        int meses;
        System.out.println("Sua idade em anos:");
        idade = input.nextInt();
        meses= idade * 12;
        System.out.println("Sua idade em meses é:" +meses);
    }
}
