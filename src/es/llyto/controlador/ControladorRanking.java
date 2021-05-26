package es.llyto.controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import es.llyto.modelo.modeloGanadores;
import es.llyto.vista.vistaRanking;

public class ControladorRanking implements MouseListener, WindowListener, MouseMotionListener
{
	
	vistaRanking vista;
	modeloGanadores modelo;
	
	public ControladorRanking(vistaRanking vista, modeloGanadores modelo) 
	{
		this.vista = vista;
		this.modelo = modelo;
		
		this.vista.addMouseListener(this);
		this.vista.addWindowListener(this);
		this.vista.addMouseMotionListener(this);
		
		modelo.ConsultaCitas(vista.txaRanking);
	}
	

	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
		if ((e.getX()>= 292) && (e.getX()<= 419) && (e.getY() >= 342) && (e.getY()<=372)) 
		{
			vista.cargarBotonesNegros();
		}
		else 
		{
			vista.cargarbotonesNormales();
		}			
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		vista.setVisible(false);
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}


	@Override
	public void mouseClicked(MouseEvent e) 
	{
		if ((e.getX()>= 292) && (e.getX()<= 419) && (e.getY() >= 342) && (e.getY()<=372)) 
		{
			this.vista.setVisible(false);
		}		
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
