package com.ecodeup.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.ecodeup.conexion.Conexion;
import com.ecodeup.model.Producto;

public class ProductoDAO {
		private Connection connection;
		private PreparedStatement statement;
		private boolean estadoOperacion;
		
		//guardar
		public boolean guardar(Producto producto) throws SQLException {
			String sql=null;
			estadoOperacion=false;
			connection=obtenerConexion();
			
			try {
				connection.setAutoCommit(false);
				sql="INSERT INT productos (id, nombre, cantidad, precio,fecha_crear,fecha_actualizar) VALUES(?,?,?,?,?,?)";
				statement=connection.prepareStatement(sql);
				
				statement.setString(1, null);
				statement.setString(2, producto.getNombre());
				statement.setDouble(3, producto.getCantidad());
				statement.setDouble(4, producto.getPrecio());
				statement.setDate(5, producto.getFechaCrear());
				statement.setDate(6, producto.getFechaActualizar());
				
				estadoOperacion=statement.executeUpdate()>0;
				
				connection.commit();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				connection.rollback();
				e.printStackTrace();
			}
			
			return true;
		}
		
		//editar
		public boolean editar(Producto producto) {
			return true;
		}
		
		//eliminar
		public boolean eliminar(Producto producto) {
			return true;
		}
		
		//obtener lista
		public List<Producto> obtenerProductos(){
			return null;
		}
		
		//
		public Producto obtenerProducto(int idProducto) {
			return null;
		}
		
		//obtener conexion
		private Connection obtenerConexion() throws SQLException {
			return Conexion.getConnection();
		}
		
		

		

}
