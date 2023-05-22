import java.util.Scanner;

public class Aula17Desafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int p = 15;
        float v[] = new float[p];
        float v2[] = new float[p];
        int v3[] = new int[p];
        int  valores , valores2, valores3 = 0, vt;
        for (valores=0; valores<p; valores++){
            System.out.printf("Informe o%2d valor do primeiro vetor %d: ",(valores+1), p);
            v[valores] = ler.nextFloat();
        }
        System.out.println("\n Digite os valores do segundo vetor: \n");
        for (valores2=0; valores2<p; valores2++){
            System.out.printf("Informe o %2d valor do segundo vetor %d: ",(valores2+1), p);
            v2[valores2] = ler.nextFloat();
        }
        for (vt=0; vt<p; vt++){
            while(v2[vt]==v[vt]){
                v3[vt] = 1;
                System.out.println(v3[valores3]);
            }while(v2[vt]!=v[vt]){
                v3[vt] = 0;
                System.out.println(v3[valores3]);
            }

        }
    }
}
