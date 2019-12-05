/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12_1;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Garaje {

    private int n_coches;
    private String matricula;
    Scanner sc = new Scanner(System.in);
    private int n_horas;
    private double precio;
    private double dinero;

    public void aparcar() {
        for (n_coches = 0; n_coches < 5; n_coches++) {
            System.out.println("Dispoñible");
            System.out.println("Cal é a matrícula?");
            matricula = sc.next();
            System.out.println("Canto tempo leva?");
            n_horas = sc.nextInt();
            if (n_horas < 3) {
                precio = 1.5;
            } else {
                precio = 1.5 + 0.2 * (n_horas - 3);
            }
            System.out.println("El precio es " + precio + ".");
            System.out.println("Con cuanto dinero pagas?");
            dinero = sc.nextDouble();
            System.out.println("\nFACTURA\nMatricula: "
                    + matricula + "\nTiempo: " + n_horas + "\nPrecio: "
                    + precio + "\nCartos recibidos: " + dinero
                    + "\nCartos devoltos: " + (dinero - precio) + "\n");
        }
        System.out.println("Completo");
    }
}
