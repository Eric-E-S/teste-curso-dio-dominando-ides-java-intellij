package br.com.dio.calculadora;


import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor");
        b = scan.nextInt();

        scan.close();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("soma: " + somar);
        System.out.println("Subtração: " + subtrair);
        System.out.println("Multiplicar: " + multiplicar);
        System.out.println("Divisão: " + dividir);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        return (double) a / b;
    }
}
