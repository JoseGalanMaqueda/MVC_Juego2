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
	

	public int buscarPosicion(int fila) 
	{
		this.fila = fila;
		if (tablero[5][fila] == 0) 
		{
			iElegido = 5;
		}
		else 
		{
			for (int i = 0; i < 6; i++)	
			{	
				for (int j = fila; j == fila; j++)
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
	
	public void llenarTablero(int posicion, int fila, int jugador) 
	{
		tablero[iElegido][fila] = jugador;
	}
	
	
}
