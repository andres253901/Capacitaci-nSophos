package com.sophos.Capacitacion.Nivel1Calse2;

import com.sophos.Capacitacion.Clase4.Carro;

/**
 * Hello world!
 *
 */


public class App 
{
	
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );   	
     	Edad edadPersona = new Edad();
     	edadPersona.setEdad(45);
    	
    	
        Carro nuevoCarro = new Carro();
        nuevoCarro.setCantidadLlantas(5);
        nuevoCarro.setColor("Rojo");
        nuevoCarro.setTipoEnergia("Hibrido");
        
        System.out.println(nuevoCarro.getCantidadLlantas() +","+  nuevoCarro.getColor() +","+ nuevoCarro.getTipoEnergia());
       
    }
    
    
    
    
}
