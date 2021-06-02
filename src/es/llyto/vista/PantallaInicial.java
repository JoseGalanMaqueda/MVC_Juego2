package es.llyto.vista;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class PantallaInicial extends Frame {

	private static final long serialVersionUID = 1L;

	// ====================================== IMAGENES ================================================
	public Image fondo;
	public Image btnNuevaPartida;
	public Image btnRanking;
	public Image btnAyuda;
	public Image btnSalir;
	public Toolkit herramienta;


	// ================================== CONSTRUCTOR ===================================================
	public PantallaInicial() 
	{
		setSize(620, 348);
		setTitle("Cuatro en Raya");
		herramienta = getToolkit();
		fondo = herramienta.getImage("img//Fondos//fondoPrinpipal.png");

		btnNuevaPartida = herramienta.getImage("img//PantallaPrincipal//btnNuevaPartida_Negro_formato.png");
		btnRanking = herramienta.getImage("img//PantallaPrincipal//btnRanking2_Negro.png");
		btnAyuda = herramienta.getImage("img//PantallaPrincipal//btnAyuda2_Negro.png");
		btnSalir = herramienta.getImage("img//PantallaPrincipal//btnSalir2_Negro.png");
		
		btnNuevaPartida = herramienta.getImage("img//PantallaPrincipal//btnNuevaPartida2.png"); // Botones 170x45
		btnRanking = herramienta.getImage("img//PantallaPrincipal//btnRanking2.png");
		btnAyuda = herramienta.getImage("img//PantallaPrincipal//btnAyuda2.png");
		btnSalir = herramienta.getImage("img//PantallaPrincipal//btnSalir2.png");
		

		setLocationRelativeTo(null);
		setVisible(true);
	}

	// ================================= PAINT ==========================================================

	@Override
	public void paint(Graphics g) 
	{
		g.drawImage(fondo, 4, 23,this);
		g.drawImage(btnNuevaPartida, 225, 90,this); // Mitad 225 y altura mitad 151
		g.drawImage(btnRanking, 225, 140,this); // Se suman de 50 en 50
		g.drawImage(btnAyuda, 225, 190,this);
		g.drawImage(btnSalir, 225, 240,this);
	}

	
	public void cargarBotonesNegros(int hover) 
	{
		if (hover == 1) 
		{
			herramienta = getToolkit();
			btnNuevaPartida = herramienta.getImage("img//PantallaPrincipal//btnNuevaPartida_Negro_formato.png");
			repaint();
		}
		
		else if (hover == 2) 
		{
			herramienta = getToolkit();
			btnRanking = herramienta.getImage("img//PantallaPrincipal//btnRanking2_Negro.png");
			repaint();
		}
		else if (hover == 3) 
		{
			herramienta = getToolkit();
			btnAyuda = herramienta.getImage("img//PantallaPrincipal//btnAyuda2_Negro.png");
			repaint();
		}
		else if (hover == 4) 
		{
			herramienta = getToolkit();
			btnSalir = herramienta.getImage("img//PantallaPrincipal//btnSalir2_Negro.png");
			repaint();
		}
	}
	
	public void cargarBotonesNormales() 
	{
		
		btnNuevaPartida = herramienta.getImage("img//PantallaPrincipal//btnNuevaPartida2.png"); 
		btnRanking = herramienta.getImage("img//PantallaPrincipal//btnRanking2.png");
		btnAyuda = herramienta.getImage("img//PantallaPrincipal//btnAyuda2.png");
		btnSalir = herramienta.getImage("img//PantallaPrincipal//btnSalir2.png");
		repaint();
	}


}
