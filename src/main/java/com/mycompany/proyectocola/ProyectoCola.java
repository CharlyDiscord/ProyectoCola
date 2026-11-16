/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectocola;

import java.util.Scanner; 

/**
 *
 * @author UTS2026
 */
public class ProyectoCola  
{ 
    public static void main(String[] args)  
    { 
        Scanner entrada = new Scanner(System.in); 
        Cola cola = new Cola(); 
 
        int opcion; 
        int numero; 
        int resultado; 
        int nuevoTam; 
 
        do  
        { 
            System.out.println("MENU COLAS"); 
            System.out.println("1.Tamano de Cola"); 
            System.out.println("2.Insert"); 
            System.out.println("3.Extract"); 
            System.out.println("4.Imprimir Cola"); 
            System.out.println("5.Salir"); 
            System.out.print("Seleccionar Opcion => "); 
 
            opcion = entrada.nextInt(); 
 
            switch (opcion)  
            { 
                case 1: 
                    System.out.print("Ingresa el nuevo tamano de la cola: "); 
                    nuevoTam = entrada.nextInt(); 
                    cola.size(nuevoTam); 
                    System.out.println("valores actuales: " + cola.getTope()); 
                    break; 
 
                case 2: 
                    System.out.print("Ingresa el valor que deseas pasar a la cola: "); 
                    numero = entrada.nextInt(); 
 
                    if (cola.insert(numero))  
                    { 
                        System.out.println("el valor se ingreso a la cola :) "); 
                    }  
                    else  
                    { 
                        System.out.println("Cola llena, elimina un valor para seguir..."); 
                    } 
                    break; 
 
                case 3: 
                    resultado = cola.extract(); 
 
                    if (resultado == -1)  
                    { 
                        System.out.println("Cola vacia, ingresa un valor para seguir..."); 
                    }  
                    else  
                    { 
                        System.out.println("valor eliminado: " + resultado); 
                    } 
                    break; 
 
                case 4: 
                    cola.printQueue(); 
                    break; 
 
                case 5: 
                    System.out.println("nos vemos :D "); 
                    break; 
 
                default: 
                    System.out.println("Selecciona una opcion del menu >:/ "); 
                    break; 
            } 
        }  
        while (opcion != 5); 
 
        entrada.close(); 
    } 
} 
