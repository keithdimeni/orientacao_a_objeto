package exercicioInterface;

/**
 * Classe que implementa uma ‘interface’
 * Obrigatorio a Classe que implementa uma 'interface' cumprir com todo contrado da classe
 */
public class Calculadora implements OperacaMatematica{

    public void soma(double num1, double num2) {
        System.out.println("Soma entre " + num1 + " + " + num2 + " = " + (num1+num2));
    }
    public void subtracao(double num1, double num2) {
        System.out.println("Subtracao entre " + num1 + " - " + num2 + " = " + (num1-num2));
    }
    public void multiplicacao(double num1, double num2) {
        System.out.println("Multiplicacao entre " + num1 + " X " + num2 + " = " + (num1*num2));
    }
    public void divisao(double num1, double num2) {
        System.out.println("Divisao entre " + num1 + " / " + num2 + " = " + (num1/num2));
    }
}
