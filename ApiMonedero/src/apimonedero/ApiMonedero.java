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
public class ApiMonedero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sw=0;
       Menu miMenu = new Menu();
       Monedero miMonedero = null;
       do{
       try{
        switch (miMenu.mostrarMenu()) {
            case 1:
              miMonedero=new Monedero(Utilidades.leerTexto("Dime que cantidad que deseas ingresar"));
                break;
            case 2:
                double ingreso;
                ingreso = Utilidades.leerTexto("Que cantidad deseas ingresar");
                miMonedero.ingreso(ingreso);
                break;
            case 3:
                double retirar;
                retirar=Utilidades.leerTexto("Que cnatidad desear retirar");
                miMonedero.retirar(retirar);
                break;
            case 4:
                miMonedero.verSaldo();
                break;
            case 5:
                sw=1;
                break;
        }
       } catch (DineroInicialExcepcion3 ex){
           System.out.println(ex.getMessage());
       } catch (Exception ex){
           System.out.println("Error");
       }
       
       }while(sw==0);
    
    }//main
    
}//class
