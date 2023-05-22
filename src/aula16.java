// desenvolva um programa que leia o numero do mes corespondende, e mostrer quantos dias tem esse mes. e obrigatorio o uso de vetores
import java.util.Scanner;
public class aula16 {
    public static void main(String[] args) {
        Scanner mes = new Scanner(System.in);
        String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro ", "dezembro",};
            int dias[] = {31,28,31,30,31,30,31,30,31,30,31};
        System.out.printf("Digite o mes que voce quer comferir: ");
        int m = mes.nextInt();
        System.out.printf("%s, tem %d dias.\n", meses[m-1], dias[m-1]);
    }
}
