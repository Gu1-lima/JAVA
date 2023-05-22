import java.util.Scanner;

public class Desafio_triangolo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do lado 1 do triangulo ");
        float lado1 = sc.nextFloat();
        System.out.println("Digite outro valor lado 2 do Triangulo ");
        float lado2 = sc.nextFloat();
        System.out.println("Digite outro valor lado 3 do Triangulo ");
        float lado3 = sc.nextFloat();
        if (lado1==lado2 && lado3==lado2 && lado3==lado1){
            System.out.println("O triangulo e Equilatero");
        }
        if (lado1==lado2 && lado2!=lado3 || lado3==lado2 && lado1!=lado3 || lado3==lado1 && lado2!=lado1){
            System.out.println("O triangulo e Isosceles");
        }
        if (lado1!=lado2 && lado3!=lado1 && lado2!=lado3) {
            System.out.println("O triangulo e Escaleno");
        }
    }
}
