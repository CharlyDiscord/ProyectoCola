/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectocola;

/**
 *
 * @author UTS2026
 */
public class Cola 
{ 
    private Nodo inicio = null; 
    private Nodo fin = null; 
    private int tope = 0; 
    private int max = 0; 
 
    public boolean overflow()  
    { 
        return tope == max; 
    } 
 
    public boolean underflow()  
    { 
        return inicio == null; 
    } 
 
    public boolean insert(int v)  
    { 
        if (overflow())  
        { 
            return false; 
        } 
 
        Nodo nuevo = new Nodo(v); 
 
        if (underflow())  
        { 
            inicio = nuevo; 
            fin = nuevo; 
        }  
        else  
        { 
            fin.setSig(nuevo); 
            fin = nuevo; 
        } 
 
        tope++; 
        return true; 
    } 
 
    public int extract()  
    { 
        if (underflow())  
        { 
            return -1; 
        } 
 
        int valor = inicio.getValor(); 
        inicio = inicio.getSig(); 
        tope--; 
 
        if (inicio == null)  
        { 
            fin = null; 
        } 
 
        return valor; 
    } 
 
    public void printQueue() 
    { 
        if (underflow())  
        { 
            System.out.println("La cola esta vacia."); 
            return; 
        } 
 
        System.out.println("---"); 
        Nodo act = inicio; 
 
        while (act != null)  
        { 
            System.out.println(act.getValor()); 
            act = act.getSig(); 
        } 
 
        System.out.println("---"); 
    } 
 
    public void size(int nuevoTam)  
    { 
        if (nuevoTam <= 0)  
        { 
            System.out.println("Porfavor digite un valor mayor a cero."); 
            return; 
        } 
 
        if (nuevoTam < tope)  
        { 
            System.out.println("No se puede asignar un menor tamano"); 
            return; 
        } 
 
        max = nuevoTam; 
        System.out.println("El tamano actual de la cola cambio"); 
    } 
 
    public int getTope()  
    { 
        return tope; 
    } 
 
    public int getMax()  
    { 
        return max; 
    } 
} 