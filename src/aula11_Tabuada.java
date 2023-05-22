import java.util.Scanner;

public class aula11_Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Digite um numero inteiro: ");
        n = sc.nextInt();
        for(int c=1; c<11; c++){
            int cal = n*c;
            System.out.println(c+"x"+n+"="+cal);

        }

    }
}
