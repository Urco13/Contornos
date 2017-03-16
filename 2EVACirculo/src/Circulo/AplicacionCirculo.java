/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circulo;

/**
 *
 * @author dam115
 */
public class AplicacionCirculo {
  
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5.3);
        Circulo circulo2 = new Circulo();
        circulo1.setRadio(28);
        //metodo de clase
        System.out.println("El circulo mas grande de un objeto es ");
        System.out.println(Circulo.mostrarMayor(circulo1, circulo2).getRadio());
    }
}

