public class IsOdd {

    public static boolean oddNumCheck(int value){
        //usei uma variavel auxiliar para evitar else!!!
        boolean isOdd = true;
        if ((value % 2) == 0){
            isOdd = false;
        }
            return isOdd;
        }
    public static void main(String[] args) {
        int randomValue = 132;
        System.out.println(oddNumCheck(randomValue));
    }
}
