import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int codigo;
        double preço = 0;
        int quantidade;
        double desconto = 0;
        double total;
        double precoFinal;
        System.out.println("Digite o código do produto:");
        codigo = input.nextInt();
        System.out.println("Digite a quantidade do produto comprado:");
        quantidade = input.nextInt();
        if (codigo<=10 && codigo>=1){
            preço = 10;}
        if (codigo<=20 && codigo>=11){
            preço = 15;
        }
        if (codigo<=30 && codigo>=21){
            preço = 20;
        }
        if (codigo<=40 && codigo>=31){
            preço = 30;
        }
        total = preço * quantidade;
        if (total==250) {
            desconto = total * 0.05;
        }
        if (total>=251 && total<=500){
            desconto = total *0.10;
        }
        if (total>=501){
            desconto = total *0.15;
        }
        precoFinal = total - desconto;
        System.out.println("Total:" + precoFinal);
    }
}
