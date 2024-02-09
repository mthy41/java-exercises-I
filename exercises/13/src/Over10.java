public class Over10 {

    public static boolean valueChecker (byte value){
        if (value <= 10 && value >= 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        byte randomValue = 10;

        System.out.println(valueChecker(randomValue));
    }
}
