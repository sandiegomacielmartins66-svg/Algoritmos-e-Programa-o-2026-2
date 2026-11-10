import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade;
        String Infantil;
        String Juvenil;
        String Adulto;
        System.out.println("Digite sua idade:");
        idade = input.nextInt();
        if (idade <= 12) {
            System.out.println ("Infantil.");
        }
        if (idade >= 13 && idade < 17) {
            System.out.println("Juvenil.");
        } else if (idade >= 17)
            System.out.println("Adulto.");{
        }
    }
}
