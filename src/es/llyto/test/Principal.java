package es.llyto.test;

import es.llyto.controlador.ControladorPantallaInicial;
import es.llyto.vista.PantallaInicial;

public class Principal {

	public static void main(String[] args) 
	{
		
		PantallaInicial vista = new PantallaInicial();
		new ControladorPantallaInicial(vista);
		
	}

}