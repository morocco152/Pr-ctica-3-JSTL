package com.ecodeup.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
				sql="INSERT INTO productos ( nombre, cantidad, precio,fecha_crear,fecha_actualizar) VALUES(?,?,?,?,?)";
				statement=connection.prepareStatement(sql);
				
				statement.setString(1, producto.getNombre());
				statement.setDouble(2, producto.getCantidad());
				statement.setDouble(3, producto.getPrecio());
				statement.setDate(4, producto.getFechaCrear());
				statement.setDate(5, producto.getFechaActualizar());
				
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
		public List<Producto> obtenerProductos() throws SQLException{
			ResultSet resultSet = null;
			List<Producto> listaProductos= new ArrayList<>();

			String sql = null;
			estadoOperacion = false;
			connection=obtenerConexion();

			try {
				sql = "SELECT * FROM productos";
				statement=connection.prepareStatement(sql);
				resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
					Producto p=new Producto();
					p.setId(resultSet.getInt(1));
					p.setNombre(resultSet.getString(2));
					p.setCantidad(resultSet.getDouble(3));
					p.setPrecio(resultSet.getDouble(4));
					p.setFechaCrear(resultSet.getDate(5));
					p.setFechaActualizar(resultSet.getDate(6));
					listaProductos.add(p);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			return listaProductos;
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
