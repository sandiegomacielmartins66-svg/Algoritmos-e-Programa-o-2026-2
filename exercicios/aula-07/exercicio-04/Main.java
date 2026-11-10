import java.util.Scanner;
static void main (String[] args){
    Scanner input = new Scanner(System.in);
    double valor;
    double desconto;
    double valorFinal;
    System.out.println("Digite o valor do produto:");
    valor = input.nextDouble();
    desconto = valor * 0.10;
    valorFinal = valor - desconto;
    System.out.println("Valor final com desconto é:" + valorFinal);
}
