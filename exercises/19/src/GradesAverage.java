import java.util.Scanner;

public class GradesAverage {

    public static double calcAverage(double g1, double g2, double g3, double g4){
        return ((g1 + g2 + g3 + g4)/4);
    }

    public static void main(String[] args) {
        Scanner getGrade = new Scanner(System.in);

        System.out.println("Insira a 1ª nota:");
        double g1 = getGrade.nextDouble();
        System.out.println("Insira a 2ª nota:");
        double g2 = getGrade.nextDouble();
        System.out.println("Insira a 3ª nota:");
        double g3 = getGrade.nextDouble();
        System.out.println("Insira a 4ª nota:");
        double g4 = getGrade.nextDouble();
        getGrade.close();

        System.out.println("Sua nóta média é: " + (calcAverage(g1, g2, g3, g4)));

    }
}
