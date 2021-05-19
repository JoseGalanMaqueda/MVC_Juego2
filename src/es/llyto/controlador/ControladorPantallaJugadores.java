package es.llyto.controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import es.llyto.modelo.ModeloTablero;
import es.llyto.vista.*;

public class ControladorPantallaJugadores implements WindowListener, MouseMotionListener, MouseListener
{
	PantallaJugadores vista;
	
	public ControladorPantallaJugadores(PantallaJugadores vista) 
	{
		this.vista = vista;
		
		// ================================= LISTENERS ========================================
		this.vista.addWindowListener(this);
		this.vista.addMouseListener(this);
		this.vista.addMouseMotionListener(this);
		
		this.vista.dlgError.addWindowListener(this);
	}

	// ======================================= WINDOW LISTENER ==========================================
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		if (vista.isActive()) 
		{
			vista.setVisible(false);
		}
		else if (vista.dlgError.isActive()) 
		{
			vista.dlgError.setVisible(false);
		}
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

	// ===================================== MOUSE LISTENER ===================================
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		if ((e.getX()>= 57) && (e.getX()<= 184) && (e.getY() >= 182) && (e.getY()<=212)) 
		{
			this.vista.setVisible(false);
		}
		else if ((e.getX()>= 231) && (e.getX()<= 360) && (e.getY() >= 182) && (e.getY()<=212)) 
		{
			if ((this.vista.txtNombreJugadorUno.getText().length() == 0) || (this.vista.txtNombreJugadorDos.getText().length() == 0)) 
			{
				vista.creacionDialogoNotificacion(vista.dlgError, vista.lblError);
			}
			else 
			{
				Tablero vista = new Tablero(this.vista.txtNombreJugadorUno.getText(), this.vista.txtNombreJugadorDos.getText());
				ModeloTablero modelo = new ModeloTablero();
				new ControladorTablero(vista, modelo);
				this.vista.setVisible(false);
			}
			
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

	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
		if ((e.getX()>= 57) && (e.getX()<= 184) && (e.getY() >= 182) && (e.getY()<=212)) 
		{
			vista.cargarBotonesNegros(1);
		}
		else if ((e.getX()>= 231) && (e.getX()<= 360) && (e.getY() >= 182) && (e.getY()<=212)) 
		{
			vista.cargarBotonesNegros(2);
		}
		else 
		{
			vista.cargarbotonesNormales();
		}
	}
}
