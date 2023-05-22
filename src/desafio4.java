import java.util.Date;
import java.util.Scanner;

//dev um programa que leia o ano de nasc de uma pesoa e moste qual sua idade.lembrando de usar a biblioteca date para o calculo.
public class desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date dt = new Date();
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o ano que voce nasceu: ");
        int data_nasc = sc.nextInt();
        int ano = dt.getYear();
        int ano_atual = ano+1900;
        int idade = ano_atual-data_nasc;
        System.out.println(nome+" tem "+idade+" anos.");

    }
}
