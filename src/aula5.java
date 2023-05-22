import java.util.Scanner;

//Desenvolva um programa que tenha um menu pra a escolha
public class aula5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a operacao\n1 para soma \n2 para subtracao \n3 para multiplicacao \n4 divisao ");
        int n = sc.nextInt();
        if (n > 4 || n < 1){
            System.out.println("Opcao invalida ");
        }
        switch(n){
            case 1:
                System.out.println("digite um numero:");
                int n1 = sc.nextInt();
                System.out.println("Digite outro numero; ");
                float n2 = sc.nextFloat();
                float soma = n1+n2;
                System.out.println(n1+"+"+n2+"="+soma);
                break;
            case 2:
                System.out.println("digite um numero:");
                int nSub1 = sc.nextInt();
                System.out.println("Digite outro numero; ");
                int nSub2 = sc.nextInt();
                float sub = nSub1-nSub2;
                System.out.println(nSub1+"-"+nSub2+"="+sub);
                break;
            case 3:
                System.out.println("digite um numero:");
                int nMult1 = sc.nextInt();
                System.out.println("Digite outro numero; ");
                int nMult2 = sc.nextInt();
                float mul = nMult1*nMult2;
                System.out.println(nMult1+"x"+nMult2+"="+mul);
                break;
            case 4:
                System.out.println("digite um numero:");
                float nDiv1 = sc.nextFloat();
                System.out.println("Digite outro numero; ");
                float nDiv2 = sc.nextFloat();
                float div = nDiv1/nDiv2;
                System.out.println(nDiv1+"/"+nDiv2+"="+div);
                break;

        }
    }
}
