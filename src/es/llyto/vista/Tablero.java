package es.llyto.vista;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;

public class Tablero extends Frame
{

	private static final long serialVersionUID = 1L;

	Font letra = new Font("Open Sans", Font.BOLD, 20);
	Font letraDos = new Font("Open Sans", Font.BOLD, 16);
	Image fondo;
	Image bntSalir;
	Image fondoDialogo;
	public Toolkit herramienta;
	public String jugador1 = "";
	public String jugador2 = "";
	Color tablero = new Color(0,0,200);
	Color tablero2 = new Color(0,0,160);
	public int turno = 1;
	int x = 175;
	int y = 140;
	int incrementoX = 70;
	int incrementoY = 36;
	int n_recuadrosAzules = 7*6;
	int filas = 6;
	int columnas = 7;
	public int[][] tableroDatos = new int[filas][columnas];
	
	public Dialog dlgGanador = new Dialog(this, "Ganador", true );
	public Label lblMensaje = new Label();
	
	public Dialog dlgEmpate = new Dialog(this, "Empate", true );
	public Label lblEmpate = new Label();


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
	public void paint(Graphics g) 
	{
		g.drawImage(fondo, 0, 23, this);

		g.setFont(letra);
		g.drawString(jugador1, 120, 90);
		g.drawString(jugador2, 565, 90);

		g.setFont(letraDos);

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


		g.drawImage(bntSalir, 335, 385 ,this );
		
		g.drawImage(fondoDialogo, 0, 23, dlgGanador);

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
	
	public void creacionDialogoGanador(String ganador, int movimientos) 
	{
		dlgGanador.setSize(350, 100);
		dlgGanador.setLayout(new FlowLayout());
		lblMensaje.setText("El Ganador es "+ganador+", ha tenido "+movimientos+" movimientos");
		dlgGanador.add(lblMensaje);
		dlgGanador.setLocationRelativeTo(null);
		dlgGanador.setResizable(false);
		dlgGanador.setVisible(true);
	}
	
	public void creacionDialogoEmpate() 
	{
		dlgEmpate.setSize(350, 100);
		dlgEmpate.setLayout(new FlowLayout());
		lblEmpate.setText("La partida ha quedado Empate");
		dlgEmpate.add(lblEmpate);
		dlgEmpate.setLocationRelativeTo(null);
		dlgEmpate.setResizable(false);
		dlgEmpate.setVisible(true);
	}
	


}

