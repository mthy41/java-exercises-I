public class IsMultOf3 {

    public static boolean isMultipleOf3 (int var){
        boolean isMultiple = true;

        //este programa considera todos os múltiplos inteiros
        //incluindo números negativos não-naturais.

        if ((var % 3) != 0){
            isMultiple = false;
        }
        return isMultiple;
    }
    public static void main(String[] args) {
        int randomValue = -9;

        System.out.println(isMultipleOf3(randomValue));
    }
}
