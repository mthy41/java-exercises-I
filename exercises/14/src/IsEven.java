public class IsEven {

    public static boolean evenNumCheck(int value){
        //usei uma variavel auxiliar para evitar else!!!
        boolean isEven = true;
        if ((value % 2) != 0){
            isEven = false;
        }
            return isEven;
        }
    public static void main(String[] args) {
        int randomValue = 132;
        System.out.println(evenNumCheck(randomValue));
    }
}
