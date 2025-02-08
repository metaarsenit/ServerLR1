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


@WebServlet(name="DeleteServlet", urlPatterns = {"/delete"})
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        String name = req.getParameter("name");
        GlobalState.delete(name);

        try (PrintWriter out = resp.getWriter()) {
            out.print(HtmlProvider.getDeletePage());
        }
    }
}
