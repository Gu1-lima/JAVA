import java.util.Scanner;
public class Prova_pratica {
    public static void main(String[] args) {
        Scanner Kms = new Scanner(System.in);
        float distancia, valor_final = 0, valor;
        int resposta;
        do {
            System.out.print("Digite a distancias em quilometros: ");
            distancia = Kms.nextFloat();
            if (distancia >= 1 && distancia <= 10) {
                valor = (float) 3.65*distancia;
                System.out.println("O valor desta corrida e R$: " + valor);
                valor_final = valor_final + valor;
            } else if (distancia >= 11 && distancia <= 30) {
                valor = (float) 4.78*distancia;
                System.out.println("O valor desta corrida e R$: " + valor);
                valor_final = valor_final + valor;
            } else if (distancia >= 31 && distancia <= 50) {
                valor = (float) 5.34*distancia;
                System.out.println("O valor desta corrida e R$: " + valor);
                valor_final = valor_final + valor;
            } else if (distancia >= 51) {
                valor = (float) 6.80*distancia;
                System.out.println("O valor desta corrida e R$: " + valor);
                valor_final = valor_final + valor;
            } else {
                System.out.println("O valor digitado e invalido:");
                System.out.print("Por gentileza digite a distancias em quilometros: ");
                distancia = Kms.nextFloat();
                if (distancia >= 1 && distancia <= 10) {
                    valor = (float) 3.65*distancia;
                    System.out.println("O valor desta corrida e R$: " + valor);
                    valor_final = valor_final + valor;
                } else if (distancia >= 11 && distancia <= 30) {
                    valor = (float) 4.78*distancia;
                    System.out.println("O valor desta corrida e R$: " + valor);
                    valor_final = valor_final + valor;
                } else if (distancia >= 31 && distancia <= 50) {
                    valor = (float) 5.34*distancia;
                    System.out.println("O valor desta corrida e R$: " + valor);
                    valor_final = valor_final + valor;
                } else if (distancia >= 51) {
                    valor = (float) 6.80*distancia;
                    System.out.println("O valor desta corrida e R$: " + valor);
                    valor_final = valor_final + valor;
                } else {
                    System.out.println("O valor digitado e invalido:");
                    System.out.print("Por gentileza digite a distancias em quilometros: ");
                    distancia = Kms.nextFloat();
                }
            }
            System.out.println("Voce deseja calcular outra corrida\n Digite 1 para sim e 0 para Nao:");
            resposta = Kms.nextInt();
        }while (resposta==1);
        System.out.println();
        System.out.println("Obrigado por utilizar este programa!");
    }
}