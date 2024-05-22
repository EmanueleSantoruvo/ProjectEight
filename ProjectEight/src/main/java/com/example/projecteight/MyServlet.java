package com.example.projecteight;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destinazione = request.getParameter("destination");
        String info = InfoViaggio(destinazione);
        request.setAttribute("destinazione", destinazione);
        request.setAttribute("InfoViaggio", info);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    private String InfoViaggio(String destinazione) {

        switch (destinazione){
            case "Parigi":

        }
    return "lol";
}
}

