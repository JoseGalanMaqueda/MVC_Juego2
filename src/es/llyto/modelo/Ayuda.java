package es.llyto.modelo;

import java.io.IOException;

public class Ayuda 
{

	public static void ejecutarAyuda() 
	{
		try
		{
			Runtime.getRuntime().exec("hh.exe .\\Ayuda\\AyudaJuego.chm");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
