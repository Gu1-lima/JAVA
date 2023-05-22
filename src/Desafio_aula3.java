import java.util.Date;
import java.util.Scanner;

public class Desafio_aula3 {
    public static void main(String[] args) {
        Date dt = new Date();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o ano que voce nasceu: ");
        int data_nasc = sc.nextInt();
        int ano = dt.getYear();
        int ano_atual=ano+1900;
        int idade = ano_atual - data_nasc;
        System.out.println(nome+" tem " +idade+ "anos");
    }
}