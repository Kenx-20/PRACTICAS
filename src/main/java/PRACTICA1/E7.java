package PRACTICA1;

import java.util.Scanner;

public class E7 {

    public static void main(String[] args) {
        /* 7.- Ingresar por teclado 5 notas y mostrar el promedio. */
        Scanner dato = new Scanner(System.in);
        double notas[] = new double[6];
        int con = 1;
        double promedio, sum = 0;
        while (con < 6) {
            System.out.println("Ingrese la " + con + "° nota: ");
            notas[con] = dato.nextDouble();
            sum = sum + notas[con];
            con++;
        }
        promedio = sum / 5;
        System.out.println("Su promedio es : " + promedio);
    }
}