package com.metaarsenit.springboot_app.servlets;

import com.metaarsenit.springboot_app.html.GlobalState;
import com.metaarsenit.springboot_app.html.HtmlProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Objects;

@WebServlet(name="AddServlet", urlPatterns = {"/add"})
public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = resp.getWriter()) {
            out.print(HtmlProvider.getAddPage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = resp.getWriter()) {
            String name = req.getParameter("name");
            String[] ingredients =  req.getParameterValues("ingredients[]");
            GlobalState.add(name, ingredients[0], ingredients[1], ingredients[2], ingredients[3], ingredients[4]);

            out.print(HtmlProvider.getAddPage());


            // && !Objects.equals(a, "")
            /*
            for (String a : req.getParameterValues("ingredients[]")) {
                if (a != null) {
                    out.print("aaaaaa    ");
                }

            }
            */
        }
    }
}
