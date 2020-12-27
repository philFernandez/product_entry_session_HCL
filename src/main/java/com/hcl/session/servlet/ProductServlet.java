package com.hcl.session.servlet;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.hcl.session.pojo.Product;

@WebServlet(name = "ProductServlet",
        description = "Servlet for instantiating Product pojo and saving session",
        urlPatterns = {"/productEntry"})
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        new Product(id, name, price, quantity);
        HttpSession session = request.getSession();

        // session.setAttribute("id", newProduct.getId());
        // session.setAttribute("name", newProduct.getName());
        // session.setAttribute("price", String.format("%.2f", newProduct.getPrice()));
        // session.setAttribute("quantity", newProduct.getQuantity());
        session.setAttribute("products", Product.getProducts());

        response.sendRedirect("showNewProduct.jsp");
    }
}
