package org.cuatrovientos; 
import java.io.IOException; 
import java.math.BigDecimal; 
import java.util.List; 
import org.cuatrovientos.product.Product; 
import jakarta.servlet.ServletException; 
import jakarta.servlet.annotation.WebServlet; 
import jakarta.servlet.http.HttpServlet; 
import jakarta.servlet.http.HttpServletRequest; 
import jakarta.servlet.http.HttpServletResponse; 

@WebServlet("/catalog") 
public class ProductCatalogServlet extends HttpServlet { 

    @Override 
    protected void doGet( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        
        List<Product> products = List.of(
            new Product(0, "Pintura", new BigDecimal("4.20")),
            new Product(1, "Paquete de folios", new BigDecimal("3.65")),
            new Product(2, "Pinceles", new BigDecimal("1.75"))
        );

        request.setAttribute("products", products); 
        request.getRequestDispatcher("/WEB-INF/views/catalog.jsp").forward(request, response); 
    } 
}
