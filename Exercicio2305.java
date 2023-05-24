package Aula08;

import java.util.Scanner;

public class Exercicio2305 {
    public static void main(String[] args) {
        double peso;
        double multa;
        double excesso;
        Scanner quilo = new Scanner (System.in);
        System.out.println("quantos quilos o peixe tem");
        peso= quilo.nextDouble();
        excesso=peso - 50;
        multa=4*excesso;
        System.out.println("A multa foi de "+multa);
        System.out.println("o excesso foi de"+excesso);
    }
}
