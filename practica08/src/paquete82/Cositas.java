/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete82;

/**
 *
 * @author Usuario
 */
public class Cositas {
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, tamanio - 1 ); 
        }
         
    }
    public static int sumaArreglo(int n[]){
        int suma = 0;
        for (int i = 0; i < n.length; i++) {
            suma = suma + n[i];
        }
        return suma;
    }
}
