import java.util.Scanner;

public class exercicio61
{
    public static void main(String[] args){
        System.out.print(" Quantas linhas: ");
        int L = new Scanner(System.in).nextInt();
        for (int i=1; i<= L; i++)
        {
            for (int j=1; j<=i; j++)
                System.out.print(" * ");
                System.out.println();
        }
    
    }
}
