package es.llyto.modelo;

import java.awt.TextArea;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class modeloGanadores 
{

	// ====================================== BASE DATOS ==================================================================
	BaseDatos bd = null;
	String sentencia = "";
	Connection connection = null;
	Statement statement = null;
	ResultSet rs = null;

	public void ConsultaCitas(TextArea consulta) 
	{
		bd= new BaseDatos();
		connection = bd.conectar();
		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			sentencia = "select * from ganadores order by movimientosGanador asc limit 10;";
			rs = statement.executeQuery(sentencia);
			consulta.selectAll();
			consulta.setText("");
			consulta.append("Id\tNombre\tMovimientos\n");
			consulta.append("================================\n");
			while (rs.next()) {
				consulta.append(rs.getInt("idGanador")+"\t"+rs.getString("nombreGanador")+"\t"+rs.getInt("movimientosGanador")+"\n");
			}
		} catch (SQLException e) {
			consulta.selectAll();
			consulta.setText("");
			consulta.append("Error al cargar los datos");	
		}finally {
			bd.desconectar(connection);
		}
	}
	
	public void insertarJugador(String nombreJugador, int movimientos) 
	{
		bd = new BaseDatos();
		connection = bd.conectar();
		try
		{
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			sentencia = "INSERT INTO ganadores(idGanador, nombreGanador, movimientosGanador) values(null, '"+nombreJugador+"', "+movimientos+");";
			statement.executeUpdate(sentencia);

		}
		catch (SQLException e1)
		{
			
		}
		finally 
		{
			bd.desconectar(connection);
		}
	}

}
