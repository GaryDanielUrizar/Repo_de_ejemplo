/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack;

/**
 *
 * @author Gary Urizar
 */
public class HT {
    
    public static void main(String[] args)
    {
        // Precio de articulos
        double pierna_carnotauro = 15.58;
        double huevos_pterosaurio = 7.50;
        double dino_mascota = 150.0;
        double collar_dino = 10.0;
        
        // Calculos de total
        int suma_con_enteros = (int)(pierna_carnotauro + huevos_pterosaurio + dino_mascota + collar_dino);
        double suma_con_decimales = pierna_carnotauro + huevos_pterosaurio + dino_mascota + collar_dino;
        
        // Calculo de cuantos billetes de &20 necesita
        int billetes_utilizados =  suma_con_enteros / 20;
        
        // Datos en pantalla
        System.out.println("Total de la compra en forma entera: &" + String.valueOf(suma_con_enteros));
        System.out.println("Total de la compra en forma decimal: &" + String.valueOf(suma_con_decimales));
        System.out.println("Total aproximado de billetes de &20 a utilizar: " + String.valueOf(billetes_utilizados));
    }
}
