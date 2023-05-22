import java.util.Scanner;
//crie um programa que leia o salario atual de u funcionario e faça um calculo de um novo salario de acordo com um numero de dependentes
public class aula6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do Funcionario: ");
        String nome = sc.nextLine();
        System.out.print("Digite o seu salario atual: ");
        Float salario = sc.nextFloat();
        System.out.print("Digite a quantidade de depentes: ");
        int op = sc.nextInt();
        if (op==0){
            float calculo0 = (5*salario)/100+salario;
            System.out.println(nome+" seu salario e: "+calculo0);
        }
        if (op==1 || op==2 ||op==3 ){
            float calculo1 = (salario*10)/100+salario;
            System.out.println(nome+" seu salario e: "+calculo1);
        }
        if (op==4 || op==5 || op==6){
            float calculo2 = (salario*15)/100+salario;
            System.out.println(nome+" seu salario e: "+calculo2);
        }
        if (op>6 ){
            float calculo3 = (salario*18)/100+salario;
            System.out.println(nome+" seu salario e: "+calculo3);
        }
    }
}
