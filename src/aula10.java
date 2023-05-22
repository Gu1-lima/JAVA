import java.util.Scanner;

public class aula10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        float casa, salario, porcentagem, pagamento, parcelas;
        int financiamento;
        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o valor de seu salario R$: ");
        salario = sc.nextFloat();
        System.out.print("Digte o valor da casa: ");
        casa = sc.nextFloat();
        System.out.print("Digite quantos anos voce quer financiar a casa R$: ");
        financiamento = sc.nextInt();
        pagamento = financiamento*12;
        porcentagem= salario*30/100;
        parcelas = casa/pagamento;
        if (parcelas < porcentagem){
            System.out.println( nome+" seu finaciamento foi aprovado e ficou "+financiamento+" parcelas de R$:"+parcelas);
        } else {
            System.out.println(nome+" seu financiamento nao foi aprovado");
        }
    }
}
