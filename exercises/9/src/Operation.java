public class Operation {

    public static int sum(int n1, int n2){
        return n1 + n2;
    }

    public static int sub(int n1, int n2){
        return n1 - n2;
    }

    public static int prod(int n1, int n2){
        return n1 * n2;
    }

    public static double frac(double n1, double n2){
        return n1 / n2;
    }

    public static void main(String[] args){
        
        int numero1 = 10;
        int numero2 = 20;

        int sumResult = sum(numero1, numero2);
        int subResult = sub(numero1, numero2);
        int prodResult = prod(numero1, numero2);
        double fracResult = frac(numero1, numero2);

        System.out.println("Soma: " + sumResult);
        System.out.println("Subtração: " + subResult);
        System.out.println("Produto: " + prodResult);
        System.out.println("Divisão: "+ fracResult);
    }
}
