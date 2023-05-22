import java.util.Scanner;

public class aula13Desafio_fumanate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cigaros,dias,anos,min,tempo, minPerd, vida;
        System.out.print("Digite o numero de cigarros que voce fuma por dias: ");
        cigaros = sc.nextFloat();
        System.out.print("Digite a quantos anos voce fuma: ");
        anos = sc.nextFloat();
        tempo = anos*365;
        min = tempo*cigaros;
        minPerd = min*10;
        dias = 24*60;
        vida = minPerd/dias;
        System.out.println("Voces tem o total de dias "+(int)vida+" perdidos");
    }
}