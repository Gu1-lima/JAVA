import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Numero:");
        float num1 = sc.nextFloat();
        System.out.println("Digite outro Numero");
        float num2 = sc.nextFloat();
        float soma = num1+num2;
        float sub = num1-num2;
        float mut = num1*num2;
        float div = num1/num2;
        System.out.println(num1+" + "+num2+"="+soma);
        System.out.println(num1+" - "+num2 +"="+sub);
        System.out.println(num1+" x "+num2 +"="+mut);
        System.out.println(num1+" / "+num2 +"="+div);

    }
}
