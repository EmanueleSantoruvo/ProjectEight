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
        String destination = request.getParameter("destination");
        String info = getTravelInfo(destination);
        request.setAttribute("destination", destination);
        request.setAttribute("travelInfo", info);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    private String getTravelInfo(String destination) {
        if (destination.equalsIgnoreCase("Roma")) {
            return "Roma è la capitale d'Italia, famosa per il Colosseo, il Pantheon e altre attrazioni storiche.";
        } else if (destination.equalsIgnoreCase("Parigi")) {
            return "Parigi è la capitale della Francia, famosa per la Torre Eiffel, il Louvre e altri monumenti.";
        } else {
            return "Spiacenti, non abbiamo informazioni sulla destinazione selezionata.";
        }
    }
}

