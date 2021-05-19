package es.llyto.controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import es.llyto.modelo.ModeloTablero;
import es.llyto.vista.*;

public class ControladorTablero implements WindowListener, MouseListener, MouseMotionListener
{
	Tablero vista;
	ModeloTablero modelo;

	public ControladorTablero(Tablero vista, ModeloTablero modelo) 
	{
		this.vista = vista;
		this.modelo = modelo;
		
		this.vista.addWindowListener(this);
		this.vista.addMouseListener(this);
		this.vista.addMouseMotionListener(this);
	}


	// ==================================== WINDOW LISTENER =====================================
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		if (vista.isActive()) 
		{
			vista.setVisible(false);
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

	// ============================== MOUSE MOTION LISTENER ============================
	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
		if ((e.getX()>= 337) && (e.getX()<= 464) && (e.getY() >= 387) && (e.getY()<=418)) 
		{
			vista.cargarBotonNegro();
		}
		else 
		{
			vista.cargarBotonNormal();
		}

	}
	// ================================ MOUSE LISTENER ================================
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		if ((e.getX()>= 337) && (e.getX()<= 464) && (e.getY() >= 387) && (e.getY()<=418)) 
		{
			vista.setVisible(false);
		}
		else if ((e.getX()>= 173) && (e.getX()<= 210) && (e.getY() >= 140) && (e.getY()<=343)) 
		{
			int columna = 0;
			if (vista.turno == 1) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 1);
				vista.turno = 2;
				
			}
			else if (vista.turno == 2) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 2);
				vista.turno = 1;
			}
			vista.repaint();
		}
		else if ((e.getX()>= 245) && (e.getX()<= 279) && (e.getY() >= 140) && (e.getY()<=343)) 
		{
			int columna = 1;
			if (vista.turno == 1) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 1);
				modelo.mostrarPosiciones();
				vista.turno = 2;
			}
			else if (vista.turno == 2) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 2);
				modelo.mostrarPosiciones();
				vista.turno = 1;
			}
			vista.repaint();
		}
		else if ((e.getX()>= 317) && (e.getX()<= 362) && (e.getY() >= 140) && (e.getY()<=343)) 
		{
			int columna = 2;
			if (vista.turno == 1) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 1);
				modelo.mostrarPosiciones();
				vista.turno = 2;
			}
			else if (vista.turno == 2) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 2);
				modelo.mostrarPosiciones();
				vista.turno = 1;
			}
			vista.repaint();
		}
		else if ((e.getX()>= 389) && (e.getX()<= 423) && (e.getY() >= 140) && (e.getY()<=343)) 
		{
			int columna = 3;
			if (vista.turno == 1) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 1);
				modelo.mostrarPosiciones();
				vista.turno = 2;
			}
			else if (vista.turno == 2) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 2);
				vista.tableroDatos = modelo.tablero;
				modelo.mostrarPosiciones();
				vista.turno = 1;
			}
			vista.repaint();
		}
		else if ((e.getX()>= 461) && (e.getX()<= 495) && (e.getY() >= 140) && (e.getY()<=343)) 
		{
			int columna = 4;
			if (vista.turno == 1) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 1);
				modelo.mostrarPosiciones();
				vista.turno = 2;
			}
			else if (vista.turno == 2) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 2);
				modelo.mostrarPosiciones();
				vista.turno = 1;
			}
			vista.repaint();
		}
		else if ((e.getX()>= 533) && (e.getX()<= 567) && (e.getY() >= 140) && (e.getY()<=343)) 
		{
			int columna = 5;
			if (vista.turno == 1) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 1);
				modelo.mostrarPosiciones();
				vista.turno = 2;
			}
			else if (vista.turno == 2) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 2);
				modelo.mostrarPosiciones();
				vista.turno = 1;
			}
			vista.repaint();
		}
		else if ((e.getX()>= 605) && (e.getX()<= 639) && (e.getY() >= 140) && (e.getY()<=343)) 
		{
			int columna = 6;
			if (vista.turno == 1) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 1);
				modelo.mostrarPosiciones();
				vista.turno = 2;
			}
			else if (vista.turno == 2) 
			{
				modelo.llenarTablero(modelo.buscarPosicion(columna), 2);
				modelo.mostrarPosiciones();
				vista.turno = 1;
			}
			vista.repaint();
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