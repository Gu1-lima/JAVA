import java.util.Scanner;
//desenvolva um vetor com 8 elementos int. simultaneamente construa outro vetor com o mesmo tipo e tamanho do anterior o valor do segundo vetor e o primeiro vetor mul por dois
public class desafioAula16 {
    public static void main(String[] args) {
        Scanner vetor = new Scanner(System.in);
        int n = 8;
        int pri[] = new int[n];
        int  valores;
        for (valores=0; valores<n; valores++){
            System.out.printf("Informe %2do. valor de %d: ",(valores+1), n);
            pri[valores] = vetor.nextInt();
        }
        System.out.println();
        for (valores=0;valores<n;valores++){
            System.out.printf("vetor1[%d] = %2d\n ",valores , pri[valores]);
        }
        System.out.println();
        for (valores=0;valores<n;valores++) {
            System.out.printf("vetor2[%d] = %2d\n ", valores , pri[valores]*2);
        }
    }
}