import java.util.Scanner;

public class aulaVetores16 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int n = 10;
        int v[] = new int[n];
        int i;

        for (i=0; i<n; i++){
            System.out.printf("Informe %2do. valor de %d: ",(i+1), n);
            v[i] = numero.nextInt();
        }
        int soma = 0;
        int menor = v[0];
        int maior = v[0];
        for (i=0; i<n; i++){
            soma = soma + v[i];
            if (v[i] < menor)
                menor = v[i];
            if (v[i] > maior)
                maior = v[i];
        }
        System.out.println();
        for (i=0;i<n;i++){
            if (v[i] == menor) {
                System.out.printf("v[%d] = %2d < menor valor\n", i, v[i]);
            }
            else if (v[i] == maior){
                    System.out.printf("v[%d] = %2d < maior valor\n",i, v[i]);
                }
            else System.out.printf("v[%d] = %2d\n ",i , v[i]);
            }
        }
    }

