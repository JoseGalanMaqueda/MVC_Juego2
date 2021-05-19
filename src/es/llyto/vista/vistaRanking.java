package es.llyto.vista;

import java.awt.Frame;

public class vistaRanking extends Frame 
{
	private static final long serialVersionUID = 1L;

	public vistaRanking() 
	{
		setSize(700,400);  // Escalar imagen de fondo a este tamano
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new vistaRanking();
	}

}
