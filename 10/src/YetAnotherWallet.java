public class YetAnotherWallet {

    public static double moneyInput(double currentBalace, double inputValue){

        return currentBalace + inputValue;
    }

    public static void main(String[] args){
        double saldo = 500.50;
        System.out.println(saldo);
        saldo = moneyInput(saldo, 300.25);
        System.out.println(saldo);
        saldo = moneyInput(saldo, -150.75);
        System.out.println(saldo);
    }
}
