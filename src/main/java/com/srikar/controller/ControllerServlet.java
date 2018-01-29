package com.srikar.controller;

import com.srikar.domain.Product;
import com.srikar.form.ProductForm;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by vedantas on 1/29/2018.
 */
public class ControllerServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        int index = uri.lastIndexOf('/');
        String action = uri.substring(index + 1);
        if (action.equals("product_input.action")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/ProductForm.jsp");
            dispatcher.forward(request, response);
        } else if (action.equals("product_save.action")) {
            ProductForm productForm = new ProductForm();
            productForm.setName(request.getParameter("name"));
            productForm.setDescription(request.getParameter("description"));
            productForm.setPrice(request.getParameter("price"));

            Product product = new Product();
            product.setName(productForm.getName());
            product.setDescription(productForm.getDescription());
            try {
                product.setPrice(Float.parseFloat(productForm.getPrice()));
            } catch (NumberFormatException ex) {

            }
            request.setAttribute("product", product);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/ProductDetails.jsp");
            dispatcher.forward(request, response);
        }
    }
}
