import java.util.Scanner;

public class Aula14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mediaS, mediaF, somaF, somaS, salario, filhos, maior, habitante;
        habitante= 0;
        maior = 1;
        mediaF = 0;
        mediaS = 0;
        somaS = 0;
        somaF = 0;
        for(int  c=1; c<11; c++){
            System.out.println("Habitante: "+c);
            System.out.print("Digite o seu salario R$:");
            salario = sc.nextFloat();
            System.out.print("Digite seu Numero de filhos: ");
            filhos = sc.nextInt();

            somaS = somaS+salario;
            somaF = somaF+filhos;
            habitante= habitante+1;
            {
                if (salario > maior){
                    maior = salario;
                }
                else{
                    maior = maior;
                }
            }
        }
        mediaS = somaS/habitante;
        System.out.println("A media do salario dos habitante e : "+mediaS);
        mediaF = somaF/habitante;
        System.out.println("A media do filhos dos habitantes e : "+(int)mediaF);
        System.out.println("O maior salario entre os Habitante e de R$:"+maior);
    }
}
