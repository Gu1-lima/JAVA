import java.util.Scanner;

public class aula9Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float somas, n1, n2, media, media_Turma;
        somas = 0;

        for (int c = 1; c < 11 ; c++) {
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Primeira nota: ");
            n1 = sc.nextFloat();

            System.out.println("Segunda nota: ");
            n2 = sc.nextFloat();

            media = (n1 + n2) / 2;
            somas = somas+media;
            System.out.println("Media do Aluno e = "+media);
            {
                if (media >= 6) {
                    System.out.println("O "+nome+" esta aprovado");
                } else {
                    System.out.println("O "+nome+" esta de Recuperacao");
                }
            }
        }
        media_Turma = somas / 10;
        System.out.println("Media da turma = "+media_Turma);
    }
}