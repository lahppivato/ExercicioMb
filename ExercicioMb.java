import java.util.*;
import java.lang.Math;

public class ExercicioMb {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double mb;
        
        System.out.println("informe a quantidade de Mb: ");
        mb = input.nextDouble();
        if (mb > 100) {
            mb = (mb - 100) * 2 + 40;
            System.out.println("" + mb + " Reais");
        } else {
            System.out.println("40 Reais");
        }
    }
}
