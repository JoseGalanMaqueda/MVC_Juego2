package es.llyto.vista;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;

public class PantallaJugadores extends Frame
{
	
	private static final long serialVersionUID = 1L;
	
	Font letra = new Font("Open Sans", Font.BOLD, 15);
	
	public Image fondo;
	public Image botonAceptar;
	public Image botonCancelar;
	public Toolkit herramienta;
	public TextField txtNombreJugadorUno = new TextField(15);
	public TextField txtNombreJugadorDos = new TextField(15);
	
	public Dialog dlgError = new Dialog(this, "Operacion Incorrecta", true );
	public Label lblError = new Label("Nombre Jugador no valido");
	
	
	public PantallaJugadores() 
	{
		setSize(423, 237);
		setTitle("Jugadores");
		herramienta = getToolkit();
		fondo = herramienta.getImage("img//Fondos//fondo_PantallaJugadores.png");
		botonAceptar = herramienta.getImage("img//PantallaJugadores//button_aceptar_2.png");
		botonCancelar = herramienta.getImage("img//PantallaJugadores//button_cancelar_2.png"); // 130x34
		setLayout(null);
		txtNombreJugadorUno.setBounds(220, 62, 175, 30); // EjeX // EjeY //Anchura // Altura
		add(txtNombreJugadorUno);
		txtNombreJugadorDos.setBounds(220, 120, 175, 30);
		add(txtNombreJugadorDos);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);		
	}

	@Override
	public void paint(Graphics g) 
	{
		g.drawImage(fondo, 0, 23,this);
		g.setFont(letra);
		g.drawString("Nombre Jugador 1:", 35, 83);
		g.drawString("Nombre Jugador 2:", 35, 140);
		g.drawImage(botonCancelar,55,180,this);
		g.drawImage(botonAceptar, 230, 180, this);
	}
	
	public void creacionDialogoNotificacion(Dialog dialogo, Label lbl) {
		dialogo.setSize(230, 100);
		dialogo.setLayout(new FlowLayout());
		dialogo.add(lbl);
		dialogo.setLocationRelativeTo(null);
		dialogo.setVisible(true);
	}

	
	public void cargarBotonesNegros(int hover) 
	{
		if (hover == 1) 
		{
			herramienta = getToolkit();
			botonCancelar = herramienta.getImage("img//PantallaJugadores//btn_cancelar_negro2.png");
			repaint();
		}
		
		else if (hover == 2) 
		{
			herramienta = getToolkit();
			botonAceptar = herramienta.getImage("img//PantallaJugadores//btn_aceptar_negro2.png");
			repaint();
		}
	}
	
	public void cargarbotonesNormales() 
	{
		herramienta = getToolkit();
		botonAceptar = herramienta.getImage("img//PantallaJugadores//button_aceptar_2.png");
		botonCancelar = herramienta.getImage("img//PantallaJugadores//button_cancelar_2.png");
	}
	
	

}
