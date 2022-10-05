package PRACTICA1;

public class E8 {

    public static void main(String[] args) {
        /* 8.- PROPUESTO: Un cliente realiza la siguiente compra de artefactos, plancha,
        licuadora, lavadora y cocina, si la compra supera los 1200, recibe un descuento
        de 17 %, mostrar el precio de cada artefacto, así como el monto, el descuento y
        el pago total si le corresponde un descuento. */
        String artefactos[] = {"Plancha", "Licuadora", "Lavadora", "Cocina"};
        double precios[] = {119.5, 216.85, 2299.00, 1699.00};
        double suma = 0;
        System.out.println("Datos del cliente");
        System.out.println("ARTEFACTOS MONTO");
        System.out.println("---------- -----");
        for (int i = 0; i < artefactos.length; i++) {
            suma += precios[i];
            System.out.println(artefactos[i] + " " + precios[i]);
        }
        System.out.println("Precio a pagar es: "+suma);
        if (suma>1200) {
            suma = suma*83/100;
            System.out.println("El descuento es aplicable y pago total es: " + suma);
        }else{
            System.out.println("No es posible aplicar el descuento y el pago total es: "+suma);
        }
    }
}