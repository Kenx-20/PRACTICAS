package PRACTICA1;

public class E1 {

    public static void main(String[] args) {
        /* 1.- Empleando arreglos, mostrar n productos con sus respectivos precios. */
        String utiles[] = {"Pelota", "Zapatilla", "Mochila", "Polo"};
        double precios[] = {35.5, 89.60, 45.99, 25.70};
        System.out.println("Lista de Productos y sus precios");
        for (int i = 0; i < utiles.length; i++) {
            System.out.println(utiles[i] + " " + precios[i]);
        }
    }
}