package PRACTICA1;

public class E3 {

    public static void main(String[] args) {
        /* 3.-Mostrar el promedio de notas de tres cursos. */
        String cursos[] = {"Diseño", "Fisica", "Ingles"};
        int practicas[] = {14, 17, 11};
        System.out.println("Promedio de Cursos");
        System.out.println("CURSO  NOTA");
        System.out.println("------ ----- ");
        int pp = (practicas[0] + practicas[1] + practicas[2]) / 3;
        for (int i = 0; i < cursos.length; i++) {
            System.out.println(cursos[i] + "\t" + practicas[i]);
        }
        System.out.println("Su Promedio es: " + pp);
    }
}