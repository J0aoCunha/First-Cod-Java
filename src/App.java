/*
 *  CALCULADORA DE IMC FEITA EM JAVA;
 * 
 */

import java.util.Scanner; // importa o scanner

public class App {
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in); // cria o scanner

        float peso;
        float altura;
        float imc;

        System.out.println("Digite seu peso: ");
        peso = Teclado.nextFloat();
        System.out.println("Digite sua altura: ");
        altura = Teclado.nextFloat();
        imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Seu IMC é: " + imc + " Você esta abaixo do peso!!!");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Seu IMC é: " + imc + ", Seu peso esta ideal!!");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Seu IMC é:" + imc + ", Você esta levemente acima do peso!!");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Seu imc é:" + imc + " Você está com obesidade de grau 1");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Ser IMC é: " + imc + "Você esta com obesidade de grau 2, Cuide-se mais.");
        } else {
            System.out.println("Seu IMC é: " + imc + "Você esta com obesidade de grau 3, Cuidado!!!");
        }

    }
}
