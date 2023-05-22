import java.util.Scanner;

public class Aula15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, media, somas, media_Turma, qnt_R, qnt_Aluno, qnt_Rc, qnt_A;
        int alunos;
        qnt_Aluno= 0;
        somas = 0;
        media = 0;
        media_Turma = 0;
        qnt_R = 0;
        qnt_A = 0;
        qnt_Rc = 0;
        System.out.println("Digite a quantidade de alunos: ");
        alunos = sc.nextInt();
        int i = 1;
        while (i<(alunos+1)){
            System.out.println("Aluno "+i);
            i+=1;
            System.out.print("Primeira nota: ");
            n1 = sc.nextFloat();

            System.out.print("Segunda nota: ");
            n2 = sc.nextFloat();

            media = (n1 + n2) / 2;
            somas = somas+media;
            System.out.println("Media do Aluno e = "+media);
            {
                if (media >= 7) {
                    System.out.println("O aluno esta aprovado");
                    qnt_A=qnt_A+qnt_Aluno+1;
                } else if (media >=4){
                    System.out.println("O aluno esta de Recuperacao");
                    qnt_Rc = qnt_Rc+qnt_Aluno+1;
                }else {
                    System.out.println("O aluno esta reprovado ");
                    qnt_R = qnt_R+qnt_Aluno+1;
                }
            }
        }
        media_Turma = somas / alunos;
        System.out.println("Media da turma = "+media_Turma);
        System.out.println(qnt_A+" alunos foram aprovados");
        System.out.println(qnt_Rc+" alunos foram pra recuperacao");
        System.out.println(qnt_R+" alunos foram reprovados");
    }
}
