import java.util.Scanner;
public class Aula17ler_matrix {
    public static void main(String[] args) {
        Scanner ler_matrix = new Scanner(System.in);
        int matrix4x4 [] [] = new int [4] [4];
        for(int l = 0; l < 4; l++ ){
            for(int c = 0; c < 4; c++ ){
                System.out.print("Matrix ["+l+"]" + "["+c+"]: ");
                matrix4x4[l][c]=ler_matrix.nextInt();
            }
        }
        //LAÇO PRA MOSTRAr O VALORES DOS DADOS
        for(int l = 0; l < 4; l++ ){
            for(int c = 0; c < 4; c++ ){
                System.out.print(matrix4x4[l][c] + "\t");
            }
            System.out.println();
        }
    }
}
