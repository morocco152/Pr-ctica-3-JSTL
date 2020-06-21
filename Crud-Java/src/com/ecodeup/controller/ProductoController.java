package com.ecodeup.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecodeup.dao.ProductoDAO;
import com.ecodeup.model.Producto;

/**
 * Servlet implementation class ProductoController
 */
@WebServlet(description = "Administra peticion", urlPatterns = { "/productos" })
public class ProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String opcion = request.getParameter("opcion");
		
		if(opcion.equals("crear")) {
			System.out.println("opcion crear precionada");
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("/views/crear.jsp");
			requestDispatcher.forward(request, response);
			
			
		}else if(opcion.equals("listar")) {
			System.out.println("opcion listar precionada");
			
		}
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		String opcion=request.getParameter("opcion");
		Date fechaActual=new Date();
		
		ProductoDAO productoDAO = new ProductoDAO(); 
		Producto producto=new Producto();
		producto.setNombre(request.getParameter("nombre"));
		producto.setCantidad(Double.parseDouble(request.getParameter("cantidad")));
		producto.setPrecio(Double.parseDouble(request.getParameter("precio")));
		producto.setFechaCrear(new java.sql.Date(fechaActual.getTime()));
		
		try {
			productoDAO.guardar(producto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//doGet(request, response);
	}

}
