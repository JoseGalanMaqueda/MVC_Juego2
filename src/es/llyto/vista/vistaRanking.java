package es.llyto.vista;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.Toolkit;

public class vistaRanking extends Frame 
{
	private static final long serialVersionUID = 1L;

	public Image fondo;
	public Image botonCancelar;
	public Toolkit herramienta;
	public TextArea txaRanking = new TextArea(15,50);

	public vistaRanking() 
	{
		herramienta = getToolkit();
		fondo = herramienta.getImage("img//Fondos//fondoRanking.png");
		botonCancelar = herramienta.getImage("img//PantallaJugadores//button_cancelar_2.png");
		setLayout(null);
		txaRanking.setBounds(160, 70, 400, 260);
		add(txaRanking);
		setSize(700,393);  
		setTitle("Ranking");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(fondo, 0, 23, this);
		g.drawImage(botonCancelar,290,340,this);
	}

	public void cargarBotonesNegros() 
	{
		herramienta = getToolkit();
		botonCancelar = herramienta.getImage("img//PantallaJugadores//btn_cancelar_negro2.png");
		repaint();
	}

	public void cargarbotonesNormales() 
	{
		herramienta = getToolkit();
		botonCancelar = herramienta.getImage("img//PantallaJugadores//button_cancelar_2.png");
		repaint();
	}


}
