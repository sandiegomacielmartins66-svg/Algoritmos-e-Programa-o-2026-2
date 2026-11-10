import java.util.Scanner;
public class Main6{
    static void main(String[] args){
        Scanner input = new Scanner(System.in);
       int senhaCorreta = 2026;
       int senha;
       int tentativas = 0;
        System.out.println("Digite a senha de 4 digitos:");
        senha = input.nextInt();
        tentativas++;
        while (senha != senhaCorreta) {
            System.out.println("Senha Incorreta! Tente novamente:");
            senha = input.nextInt();
            tentativas++;
        }
        System.out.println("Acesso autorizado");
        System.out.println("Total de tentativas" + tentativas);
    }
}
