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
public  class Circulo {
    private double radio;
    
    ////constructores/////
    public Circulo(){};
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    //////metodosSet////
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    //metodoGet//
    public double getRadio(){
        this.radio=radio;
        return radio;
//        return this.radio;
    }
    /////calcular area////
    public float calcularArea(){
        float area;
        area =  (float) (Math.PI * this.radio * 2);
        return area;
        //return(Math.PI*(Math.pow(this.radio,2)));
    }
    
    //calcular longitud////////
    public float calcularLongitud(){
        float longitud;
        longitud = (float)(2 * Math.PI * this.radio);
        return longitud;
    }
    
    //metodo mostrar///
    static double mostrarRadio(Circulo circulo){
        return circulo.radio;
        
    }
//    public static 
//    static Circulo mostrarMayor(Circulo circulo1, Circulo circulo2){
////        double resultado ;
////        
////        resultado= Math.max(circulo1.getRadio(),circulo2.getRadio());//Aqui nos da el mayor de los valores de 2 radios de 2 objetos diferentes
////        //recibimos el resultado del mayor y comprobamos cual es
////        if(resultado==circulo1.getRadio())
////           return circulo1;
////        else
////            return circulo2;
//        if(circulo1.getRadio()>circulo2.getRadio()){
//            return circulo1;
//        }else
//            return circulo2;
//    }
}
