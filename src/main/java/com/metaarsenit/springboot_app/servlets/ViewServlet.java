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
import java.util.Map;


@WebServlet(name="ViewServlet", urlPatterns = {"/view"})
public class ViewServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        /*

        <tr>
                            <th>Мохито</th>
                            <th>Лаймовый сок 30 мл</th>
                            <th>Мята 10 листочков</th>
                            <th>Содовая 150 мл</th>
                            <th>Белый ром 50 мл</th>
                            <th></th>
                            <th id="buttonTh">
                                <form action="/delete" method="delete">
                                    <button type="submit" id="deleteButton">Удалить</button>
                                </form>

                            </th>
                        </tr>
         */

        String tableRowPattern = """
            <tr>
                <th>NAME</th>
                <th>ING1</th>
                <th>ING2</th>
                <th>ING3</th>
                <th>ING4</th>
                <th>ING5</th>
                <th id="buttonTh">
                    <form action="/delete?name=NAME" method="POST">
                        <button type="submit" id="deleteButton">Удалить</button>
                    </form>
                </th>
            </tr>
            """;

        String dataInjection = "";
        for (Map<String, String> data : GlobalState.test) {
            String tableRow = tableRowPattern;
            tableRow = tableRow.replace("NAME", data.get("name"));
            tableRow = tableRow.replace("ING1", data.get("ing1"));
            tableRow = tableRow.replace("ING2", data.get("ing2"));
            tableRow = tableRow.replace("ING3", data.get("ing3"));
            tableRow = tableRow.replace("ING4", data.get("ing4"));
            tableRow = tableRow.replace("ING5", data.get("ing5"));
            dataInjection = dataInjection.concat(tableRow);

        }

        String page = HtmlProvider.getViewPage().replace("DATAPLACEMENT", dataInjection);


        try (PrintWriter out = resp.getWriter()) {
            out.print(page);
        }
    }
}
