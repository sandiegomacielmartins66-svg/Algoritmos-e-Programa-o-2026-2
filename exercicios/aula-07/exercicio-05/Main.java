import java.util.Scanner;
void main (String[] args){
    Scanner input = new Scanner(System.in);
    double Altura;
    double Peso;
    double IMC;
    System.out.println("Digite sua altura em metros:");
    Altura = input.nextDouble();
    System.out.println("Digite seu peso em KG:");
    Peso = input.nextDouble();
    IMC = Peso / (Altura * Altura);
    System.out.println("Seu IMC é:" + IMC);
}
