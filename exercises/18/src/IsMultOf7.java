public class IsMultOf7 {

    public static boolean isMultipleOf7 (int var){
        //variavel de auxilio para evitar o uso de else
        boolean isMultiple = true;

        //este programa considera todos os múltiplos inteiros
        //incluindo números negativos não-naturais.

        if ((var % 7) != 0){
            isMultiple = false;
        }
        return isMultiple;
    }
    public static void main(String[] args) {
        int randomValue = 21;

        System.out.println(isMultipleOf7(randomValue));
    }
}
