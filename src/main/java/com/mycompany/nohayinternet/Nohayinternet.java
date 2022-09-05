/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nohayinternet;

/**
 *
 * @author daniel
 */
public class Nohayinternet {

    public static void main(String[] args) {
        
        
        boolean Nohaynternet = false;
        boolean HayInternetPeroMuyPoquito = true;
        boolean HayBuenInternetPeroNoEsSuficiente = false;

        if (Nohaynternet) {
            System.out.println("No hay internet");
        } else if (HayInternetPeroMuyPoquito) {
            System.out.println("Tienes muy poquito internet");
        } else if (HayBuenInternetPeroNoEsSuficiente) {
            System.out.println("Casi casi, falata solo un poquito mas");
        } else {
            System.out.println("¡Tienes internet suficiente!");
        }
    }
}
