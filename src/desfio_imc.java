import java.util.Scanner;
public class desfio_imc {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("*===Calculador de IMC===*\n");
            System.out.print("Digte a sua altura: ");
            float altura = sc.nextFloat();
            System.out.print("Digite  seu peso: ");
            float peso = sc.nextFloat();
            float imc = (float)  (peso/Math.pow(altura , 2));
            if (imc < 17 ) {
                System.out.println(" IMC " + imc + "\nSituacao: Muito abaixo do peso.");
            }else if (imc> 17 && imc<18.5){
                System.out.println(" IMC " + imc + "\nSituacao:  Abaixo do peso.");
            }else if (imc> 18.5 && imc<25){
                System.out.println(" IMC " + imc + "\nSituacao:  peso normal.");
            }else if (imc> 25 && imc<30){
                System.out.println(" IMC " + imc + "\nSituacao: Acima do peso.");
            }else if (imc> 30 && imc<35){
                System.out.println(" IMC " + imc + "\nSituacao: Obesidade grau 1.");
            }else if (imc> 35 && imc<40) {
                System.out.println(" IMC " + imc + "\nSituacao: Obesidade severa.");
            } else  {
                System.out.println(" IMC " + imc + "\nSituacao: Obesidade Mórbida.");

            }

        }
    }