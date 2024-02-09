import java.util.Scanner;

public class WageCalc {

    public static double descSind(double salBrutoVal){
        return (salBrutoVal * 1.05) - salBrutoVal;
    }

    public static double descImpRenda(double salBrutoVal){
        return (salBrutoVal * 1.11) - salBrutoVal;
    }

    public static double descINSS(double salBrutoVal){
        return (salBrutoVal * 1.08) - salBrutoVal;
    }

    public static double salarioBruto(double valorHora, double horasMes){
        return valorHora * horasMes;
    } 
    public static void main(String[] args){
        Scanner getValue = new Scanner(System.in);

        System.out.println("Insira quanto ganha por hora: ");
        double valorHora = getValue.nextDouble();
        System.out.println("Insira as horas trabalhadas no mês: ");
        double horasMes = getValue.nextDouble();
        getValue.close();

        double salBrutoVal = salarioBruto(valorHora, horasMes);
        double descontos = descINSS(salBrutoVal) + descImpRenda(salBrutoVal) + descSind(salBrutoVal);

        System.out.println("Salário bruto: R$" + salBrutoVal);
        System.out.println("Desconto INSS: R$" + descINSS(salBrutoVal));
        System.out.println("Desconto Imposto de renda: R$" + descImpRenda(salBrutoVal));
        System.out.println("Desconto sindicato: R$" + descSind(salBrutoVal)); 
        System.out.println("Salário liquido: R$" + (salBrutoVal - descontos));

    }
}
