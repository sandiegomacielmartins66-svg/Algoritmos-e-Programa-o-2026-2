import java.util.Scanner;
public class Main7{
    static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double soma = 0;
        double nota;
        int quantidade = 0;
        double media;
        System.out.println("Digite uma nota:");
        nota = input.nextDouble();
        while (nota>=0){
            soma = soma + nota;
            quantidade++;
            System.out.println("Digite outra nota ou -1 pra encerrar o processo.");
            nota = input.nextDouble();
        }
        if (quantidade > 0) {
            media = soma / quantidade;
            System.out.println("Quantidade de notas válidas " + quantidade);
            System.out.println("Média: " + media);
        }else{
            System.out.println("Nenhuma nota válida foi digitada.");
        }
    }
}
