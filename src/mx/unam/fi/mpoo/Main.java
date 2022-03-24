package mx.unam.fi.mpoo;

//import controlador.Sumadora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AlanM
 */

public class Main {
    /**
     * 
     * @param args Nos devuelve el valor de la suma 
     */
    public static void main(String[] args) {
        controlador.Sumadora sum=new controlador.Sumadora();
        System.out.println("Clase emaquetada");
        double suma=sum.sumar(10.5, 5.8);
        System.out.println(suma);
    }
}
