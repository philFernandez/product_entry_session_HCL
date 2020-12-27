package com.hcl.session.servlet;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hcl.session.pojo.Product;

@WebServlet(name = "ProductServlet",
        description = "Servlet for instantiating Product pojo and saving session",
        urlPatterns = {"/productEntry"})
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.getWriter().println(new Product(1, "Stereo", 123.99, 100));
    }
}
