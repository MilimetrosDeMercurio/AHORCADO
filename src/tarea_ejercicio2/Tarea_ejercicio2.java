/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea_ejercicio2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Tarea_ejercicio2 {

    
    public static void main(String[] args) {
        System.out.println("-----BIENVENIDO AL JUEGO-----");
        Scanner entrada = new Scanner(System.in);
        boolean flag=true;
        int opcion=0;
        while(flag){
            System.out.println("-----MENU-----");
            System.out.println("1.Jugar\n2.Salir");
            System.out.println("Que opcion deseas escoger: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    juegoAhorcado(entrada);
                    flag=false;
                    break;
                case 2:
                    flag=false;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        }
    }
    
    public static void juegoAhorcado(Scanner scanercito){
        // solo se tienen 10 intentos
        String palabra1 = "tacos";
        String palabra2 = "Caracoles";
        String palabra3 = "Videojuegos";
        String[] palabras;
        palabras = new String[]{palabra1,palabra2,palabra3};
        String[] palabrasActuales;
        Random aleatorio = new Random();
        int nAleatorio = aleatorio.nextInt(3);
        char caracterActual;
        boolean flag2=true;
        int intentos = 0;
        int aciertos = 0;
        palabrasActuales = new String[palabras[nAleatorio].length()];
        for (int i = 0; i < palabras[nAleatorio].length(); i++) {
            palabrasActuales[i] = "[_]";
        }
        while(flag2){
            if (intentos >= 10) {
                flag2=false;
                System.out.println("!GAME OVER!");
            }
            if (aciertos == palabras[nAleatorio].length()) {
                flag2=false;
                System.out.println("!WINNER!");
            }
            if (intentos <= 10) {
            System.out.println("Intentos: " + intentos);
            for (int i = 0; i < palabrasActuales.length; i++) {
                System.out.printf(palabrasActuales[i]);
            }
            System.out.println("");
            if(flag2 == true){
            System.out.println("Introduce una letra: ");
            caracterActual = scanercito.next().charAt(0);
            //System.out.print(caracterActual);
            System.out.println("");
            for (int j = 0; j < palabras[nAleatorio].length(); j++) {
                if (palabras[nAleatorio].charAt(j) == caracterActual) {
                    palabrasActuales[j] = ("[" + caracterActual + "]");
                    aciertos++;
                }
            }
            }
            }
        intentos++;    
        }
    }
    


    
    
}
