package Aula08;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        double anos;
        Scanner sc = new Scanner (System.in);
        System.out.println("anos");
        anos= sc.nextDouble();
        double meses;
        System.out.println("meses");
        meses= sc.nextDouble();
        double dias;
        System.out.println("dias");
        dias= sc.nextDouble();
        double calculodedias=365*anos + 30*meses + dias;
        System.out.println(" 38o resultado e tantos dias "+ calculodedias);

    }
}
