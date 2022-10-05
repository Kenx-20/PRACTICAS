package PRACTICA1;

public class E2 {

    public static void main(String[] args) {
        /* 2.- En un arreglo, mostrar los datos de un usuario (nombre, edad y sexo). */
        String nombres[] = {"Victor", "Ronald", "Carol", "Paola"};
        int edad[] = {25, 30, 19, 22};
        char sexo[] = {'M', 'M', 'M', 'F'};
        System.out.println("Datos de los usuarios");
        System.out.println("NOMBRES EDAD SEXO");
        System.out.println("------- ---- ----");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + "\t" + edad[i] + "\t" + sexo[i]);
        }
    }
}