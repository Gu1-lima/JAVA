import java.util.Scanner;
public class Aula2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o seu nome:");
            String nome = sc.nextLine();
            System.out.println("Digite a sua idade");
            int idade = sc.nextInt();
            System.out.println("O Aluno " +nome+ " tem "+idade+" anos.");
    }
    }

