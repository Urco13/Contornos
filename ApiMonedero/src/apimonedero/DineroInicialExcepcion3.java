/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apimonedero;

/**
 *
 * @author urco1
 */
public class DineroInicialExcepcion3 extends Exception{
     private  int error;
    public DineroInicialExcepcion3(int error){
        this.error=error;
    }
       
     @Override
         public String getMessage(){
           switch (this.error) {
            case 1:return "No puedes poner una cantidad inicial de 0";
            case 2:return "Tu ingreso no puede ser menor de 0";
            case 3:return "No puedes retirar menos de 0 y mas del saldo";
            default: return "";
        }
  
}
}
