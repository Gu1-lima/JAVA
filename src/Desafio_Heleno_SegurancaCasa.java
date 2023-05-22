import java.util.Scanner;

public class Desafio_Heleno_SegurancaCasa {
    public static void main(String[] args) {
        Scanner verificador = new Scanner(System.in);
        int senhas [] = {1234,6594,7856,6969,};
        int  Pin;
        int F = 0;
        System.out.print("Informe sua indentidade: \n1 Para Pai\n2 Para mae\n3 Para filho\n4 Para Filha\n Digite: ");
        F = verificador.nextInt();
        if (F <1 || F >4){
            System.out.println("Acesso negado");
        }
        switch (F) {

            case 1:
                System.out.println("Digite a senha do pai");
                Pin = verificador.nextInt();
                if (Pin == senhas[0]){
                    System.out.println("Acesso liberado");
                } else {
                    System.out.println("Acesso negado");
                    System.out.println();
                }
                    break;
            case 2:
                System.out.println("Digite a senha da Mae:");
                Pin = verificador.nextInt();
                if (Pin == senhas[1]){
                    System.out.println("Acesso liberado");
                    System.out.println();
                } else {
                    System.out.println("Acesso negado");
                }
                    break;
            case 3:
                System.out.println("Digite a senha do filho:");
                Pin = verificador.nextInt();
                if (Pin == senhas[2]){
                    System.out.println("Acesso liberado");
                    System.out.println();
                } else {
                    System.out.println("Acesso negado");
                }
                break;
            case 4:
                System.out.println("Digite a senha da filha:");
                Pin = verificador.nextInt();
                if (Pin == senhas[3]){
                    System.out.println("Acesso liberado");
                    System.out.println();
                } else {
                    System.out.println("Acesso negado");
                }
                break;
            }
        }
    }