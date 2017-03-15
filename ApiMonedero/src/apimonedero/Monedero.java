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
public class Monedero {
   private double saldo;
    //constructor
    public Monedero(){
    }
    ///Cantidad Inicial
    public Monedero(double cantidadInicial)throws DineroInicialExcepcion3{
        if (cantidadInicial>0) {
            this.saldo=cantidadInicial;
        }else{
            throw new DineroInicialExcepcion3(1);
        }
    }//fin cantidad inicial
    
    
    ///Ingreso
    public void ingreso(Double ingreso)throws DineroInicialExcepcion3{
        if (ingreso>0) {
            this.saldo+=ingreso;
        }else
            throw new DineroInicialExcepcion3(2);
    }
    
    ///Retirar Dinero
    public void retirar(Double sacarDinero)throws DineroInicialExcepcion3{
        if(sacarDinero<=saldo&&sacarDinero>0){
           this.saldo-=sacarDinero;
        }else{
            throw new DineroInicialExcepcion3(3);
        }
    }
    //ver saldo
    void verSaldo(){
        System.out.println(this.saldo);
}

    public double getSaldo() {
        return saldo;
    }

    void ingreso(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}//fin class
