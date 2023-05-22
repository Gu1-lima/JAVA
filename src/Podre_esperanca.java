import java.util.Scanner;

public class Podre_esperanca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Pobre Esperanca====\nDigite:\n1-Para doar R$:5,00\n2-Para doar R$:10,00\n3-Para doar R$:50.00\n4-Para doar R$:100,00\n5-Digite um valor para a doacao\n6-Para sair");
        int n = sc.nextInt();
        if (n>6 || n<1) {
            System.out.println("Opcao invalida");
        }
            switch (n){
                case 1:
                    System.out.println("Voce acaba de doar R$:5,00");
                    break;
                case 2:
                    System.out.println("Voce acaba de doar R$:10,00");
                    break;
                case 3:
                    System.out.println("Voce acaba de doar R$:50,00");
                    break;
                case 4:
                    System.out.println("Voce acaba de doar R$:100,00");
                case 5:
                    System.out.print("Digite o valor que voce quer doar:");
                    float valor = sc.nextFloat();
                    System.out.println("Voce duou R$:"+valor);
                    break;
                case 6:
                    System.out.println("ok");
                    System.out.println("Saindo.");
                    System.out.println("Saindo..");
                    System.out.println("Saindo...");
                    System.out.println("Voce acaba de sair.");
                    break;

            }
        }
    }
