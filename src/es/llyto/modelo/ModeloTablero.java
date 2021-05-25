package es.llyto.modelo;

public class ModeloTablero 
{

	int filas = 6;
	int columnas = 7;
	public int[][] tablero = new int[filas][columnas];
	int iElegido = 0;
	int fila = 0;
	int jugador = 0;


	public void mostrarPosiciones() 
	{
		for (int i = 0; i < columnas; i++)	
		{	
			for (int j = 0; j < filas; j++)
			{
				System.out.print(tablero[i][j]+"\t");
			}
			System.out.println("");
		}
	}


	public int buscarPosicion(int vetical) 
	{
		if (tablero[5][vetical] == 0) 
		{
			iElegido = 5;
		}
		else 
		{
			for (int i = 0; i < 6; i++)	
			{	
				for (int j = vetical; j == vetical; j++)
				{
					if (tablero[i][j] == 0) 
					{
						iElegido = i;
					}
				}
			}
		}

		return iElegido;

	}

	public void llenarTablero(int horizontal, int vertical, int jugador) 
	{
		tablero[horizontal][vertical] = jugador;
	}

	public boolean comprobacionHorizontalDerecha(int columna, int posicion, int turno) 
	{
		boolean aGanado = true;
		for (int i = 0; i<4 ; i++) 
		{
			if (aGanado) 
			{
				if (tablero[posicion][columna+i] == turno) 
				{
					aGanado = true;
				}
				else 
				{
					aGanado = false;
				}
			}

		}

		return aGanado;
	}

	public boolean comprobacionHorizontalIzquierda(int columna, int posicion, int turno) 
	{
		boolean aGanado = true;
		for (int i = 0; i<4 ; i++)  
		{
			if (aGanado) 
			{
				if (tablero[posicion][columna-i] == turno) 
				{
					aGanado = true;
				}
				else 
				{
					aGanado = false;
				}
			}

		}

		return aGanado;
	}

	public boolean comprobacionAbajoVertical(int columna, int posicion, int turno) 
	{
		boolean aGanado = true;
		for (int i = 0; i<4 ; i++)  
		{
			if (aGanado) {
				if (tablero[posicion+i][columna] == turno) 
				{
					aGanado = true;
				}
				else 
				{
					aGanado = false;
				}
			}
			
		}

		return aGanado;
	}
	
	public boolean comprobacionDiagonalDerechaArriba(int columna, int posicion, int turno) 
	{
		boolean aGanado = true;
		for (int i = 0; i<4 ; i++)  
		{
			if (aGanado) {
				if (tablero[posicion-i][columna+i] == turno) 
				{
					aGanado = true;
				}
				else 
				{
					aGanado = false;
				}
			}
			
		}

		return aGanado;
	}
	
	public boolean comprobacionDiagonalIzquierdaArriba(int columna, int posicion, int turno) 
	{
		boolean aGanado = true;
		for (int i = 0; i<4 ; i++)  
		{
			if (aGanado) {
				if (tablero[posicion-i][columna-i] == turno) 
				{
					aGanado = true;
				}
				else 
				{
					aGanado = false;
				}
			}
			
		}

		return aGanado;
	}
	
	public boolean comprobacionDiagonalDerechaAbajo(int columna, int posicion, int turno) 
	{
		boolean aGanado = true;
		for (int i = 0; i<4 ; i++)  
		{
			if (aGanado) {
				if (tablero[posicion+i][columna+i] == turno) 
				{
					aGanado = true;
				}
				else 
				{
					aGanado = false;
				}
			}
			
		}

		return aGanado;
	}
	
	public boolean comprobacionDiagonalIzquierdaAbajo(int columna, int posicion, int turno) 
	{
		boolean aGanado = true;
		for (int i = 0; i<4 ; i++)  
		{
			if (aGanado) {
				if (tablero[posicion+i][columna-i] == turno) 
				{
					aGanado = true;
				}
				else 
				{
					aGanado = false;
				}
			}
			
		}

		return aGanado;
	}






}
