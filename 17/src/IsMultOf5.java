public class IsMultOf5 {

    public static boolean isMultipleOf5 (int var){
        //variavel de auxilio para evitar o uso de else
        boolean isMultiple = true;

        //este programa considera todos os múltiplos inteiros
        //incluindo números negativos não-naturais.

        if ((var % 5) != 0){
            isMultiple = false;
        }
        return isMultiple;
    }
    public static void main(String[] args) {
        int randomValue = 12;

        System.out.println(isMultipleOf5(randomValue));
    }
}
