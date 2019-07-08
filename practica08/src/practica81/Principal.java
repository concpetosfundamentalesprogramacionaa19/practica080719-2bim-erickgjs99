/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica81;

import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
        int sum;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.printf("Ingrese el numero a sumar\n");
        sum = entrada.nextInt();
        double suma2 = SumaNumeros.obtenerSumaUno(sum);
        System.out.println(suma2);
        
    }
}
