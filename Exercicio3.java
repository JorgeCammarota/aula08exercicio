package Aula08;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double salario;
        Scanner sc = new Scanner (System.in);
        System.out.println("salario do usuario");
        salario= sc.nextDouble();  //leitura
        double quantidadedesalario=salario/1212;
        System.out.println("voce ganha " + quantidadedesalario);



    }
}
