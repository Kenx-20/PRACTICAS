package PRACTICA1;

import java.util.Scanner;

public class E4 {

    public static void main(String[] args) {
        /* 4.- Ingresar por teclado 10 números en un arreglo y mostrar el numero mayor y el numero menor. */
        Scanner dato = new Scanner(System.in);
        int mayor = 0;
        int menor = 0;
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i+1) + " a evaluar: ");
            numeros[i] = dato.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (mayor < numeros[i]) {
                mayor = numeros[i];
            }
        }
        menor = mayor;
        for (int i = 0; i < numeros.length; i++) {
            if (menor > numeros[i]) {
                menor = numeros[i];
            }
        }
        System.out.println("El numero mayor es " + mayor + " y el numero menor es " + menor);
    }
}
