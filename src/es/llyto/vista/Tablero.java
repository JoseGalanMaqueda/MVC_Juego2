package es.llyto.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Tablero extends Frame
{

	private static final long serialVersionUID = 1L;

	Font letra = new Font("Open Sans", Font.BOLD, 20);
	Font letraDos = new Font("Open Sans", Font.BOLD, 16);
	Image fondo;
	Image bntSalir;
	public Toolkit herramienta;
	String jugador1 = "";
	String jugador2 = "";
	Color tablero = new Color(0,0,200);
	Color tablero2 = new Color(0,0,160);
	public String hora = "12:00";
	public int turno = 1;
	int x = 175;
	int y = 140;
	int incrementoX = 70;
	int incrementoY = 36;
	int n_recuadrosAzules = 7*6;
	int filas = 6;
	int columnas = 7;
	public int[][] tableroDatos = new int[filas][columnas];


	public Tablero(String jugador1,String jugador2) 
	{
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		setTitle("Juego");
		setSize(800, 449);
		herramienta = getToolkit();
		fondo = herramienta.getImage("img//Fondos//fondo_Tablero.png");
		bntSalir = herramienta.getImage("img//Tablero//btnSalir2.png");
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(fondo, 0, 23, this);

		g.setFont(letra);
		g.drawString(jugador1, 120, 90);
		g.drawString(jugador2, 565, 90);

		g.setFont(letraDos);
		g.drawString(hora, 380, 70);

		if (turno == 1) 
		{
			g.drawString("Turno "+ jugador1, 330, 110);
		}
		else if (turno == 2) 
		{
			g.drawString("Turno "+ jugador2, 330, 110);
		}


		g.drawRoundRect(150, 135, 500, 220, 20, 20);

		g.drawOval(57, 68, 30, 30);
		g.drawOval(700, 68, 30, 30);

		g.setColor(tablero);

		g.fillRoundRect(150, 135, 500, 220, 20, 20);

		g.setColor(Color.yellow);
		g.fillOval(57, 68, 30, 30);

		g.setColor(Color.RED);
		g.fillOval(700, 68, 30, 30);

		
		
		for (int i = 0; i < columnas; i++)	
		{	
			for (int j = 0; j < filas; j++)
			{
				if (tableroDatos[j][i]==0) {
					g.setColor(tablero2);
					g.fillOval(x+(incrementoX*i), y+(incrementoY*j), 30, 30);
				}else if (tableroDatos[j][i]==1) {
					g.setColor(Color.yellow);
					g.fillOval(x+(incrementoX*i), y+(incrementoY*j), 30, 30);
				}
				else if (tableroDatos[j][i]==2) {
					g.setColor(Color.red);
					g.fillOval(x+(incrementoX*i), y+(incrementoY*j), 30, 30);
				}
				
			}
		}
		
		
		/*
		for (int i = 0; i < 7; i++)	
		{	
			for (int j = 0; j < 6; j++)
			{
				g.fillOval(x+(incrementoX*i), y+(incrementoY*j), 30, 30);
			}
		}*/
		


		g.drawImage(bntSalir, 335, 385 ,this );

	}

	public void cargarBotonNegro() {
		herramienta = getToolkit();
		bntSalir = herramienta.getImage("img//Tablero//btnSalir2_Negro.png");
		repaint();
	}

	public void cargarBotonNormal() {
		herramienta = getToolkit();
		bntSalir = herramienta.getImage("img//Tablero//btnSalir2.png");
		repaint();
	}

	public void mostrarPosiciones() 
	{
		for (int i = 0; i < 6; i++)	
		{	
			for (int j = 0; j < 7; j++)
			{
				System.out.print(tableroDatos[i][j]+"\t");
			}
			System.out.println("");
		}
	}



}

