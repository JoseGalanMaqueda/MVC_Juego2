package es.llyto.controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import es.llyto.modelo.Ayuda;
import es.llyto.modelo.modeloGanadores;
import es.llyto.vista.*;

public class ControladorPantallaInicial implements MouseListener, WindowListener, MouseMotionListener
{

	PantallaInicial vista;
	
	// ====================================== CONSTRUCTOR ==================================================
	public ControladorPantallaInicial(PantallaInicial vista) 
	{
		
		this.vista = vista;
		
		// =========================== VENTANA PRINCIPAL ===================================================
		vista.addMouseListener(this);
		vista.addWindowListener(this);
		vista.addMouseMotionListener(this);
		
	}

	
	//  ======================================= MOUSE LISTENER =============================================
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		
		if ((e.getX()>= 227) && (e.getX()<= 392) && (e.getY() >= 90) && (e.getY()<=133)) 
		{
			PantallaJugadores vista = new PantallaJugadores();
			new ControladorPantallaJugadores(vista);
		}
		else if ((e.getX()>= 227) && (e.getX()<= 392) && (e.getY() >= 140) && (e.getY()<=183)) 
		{
			vistaRanking vista = new vistaRanking();
			modeloGanadores modelo = new modeloGanadores();
			new ControladorRanking(vista, modelo);
		}
		else if ((e.getX()>= 227) && (e.getX()<= 392) && (e.getY() >= 192) && (e.getY()<=232)) 
		{
			Ayuda.ejecutarAyuda();
		}
		else if ((e.getX()>= 227) && (e.getX()<= 392) && (e.getY() >= 243) && (e.getY()<=282)) 
		{
			System.exit(0);
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
	
	// ======================================== WINDOWS LISTENER =================================================
	
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
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

	// ================================== MOUSE MOTION LISTENER ============================================
	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		if ((e.getX()>= 227) && (e.getX()<= 392) && (e.getY() >= 90) && (e.getY()<=133)) 
		{
			vista.cargarBotonesNegros(1);
		}
		else if ((e.getX()>= 227) && (e.getX()<= 392) && (e.getY() >= 140) && (e.getY()<=183)) 
		{
			vista.cargarBotonesNegros(2);
		}
		else if ((e.getX()>= 227) && (e.getX()<= 392) && (e.getY() >= 192) && (e.getY()<=232)) 
		{
			vista.cargarBotonesNegros(3);
		}
		else if ((e.getX()>= 227) && (e.getX()<= 392) && (e.getY() >= 243) && (e.getY()<=282)) 
		{
			vista.cargarBotonesNegros(4);
		}
		else 
		{
			vista.cargarBotonesNormales();
		}
		
	}


}
