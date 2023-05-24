package Aula08;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double imc;
        double altura;
        double peso;
        Scanner sc = new Scanner (System.in);
        System.out.println("escreva sua altura");
        altura= sc.nextDouble();
        System.out.println("escreva seu peso");
        peso= sc.nextDouble();
        imc=peso/(altura*altura);
        System.out.println("seu imc e " +imc);

    }
}
