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
        String destinazione = request.getParameter("destinazione");
        String info = InfoViaggio(destinazione);
        request.setAttribute("destinazione", destinazione);
        request.setAttribute("InfoViaggio", info);
        request.getRequestDispatcher("risultato.jsp").forward(request, response);
    }

    private String InfoViaggio(String destinazione) {
        String stato = "";
        String descrizione = "";
        String costo = "";

        switch (destinazione) {
            case "Roma":
                stato = "Italia";
                descrizione = "La città eterna, famosa per il Colosseo e il Vaticano.";
                costo = "€200";
                break;
            case "Parigi":
                stato = "Francia";
                descrizione = "La città delle luci, conosciuta per la Torre Eiffel.";
                costo = "€250";
                break;
            case "Atene":
                stato = "Grecia";
                descrizione = "La culla della civiltà occidentale, famosa per l'Acropoli.";
                costo = "€180";
                break;
            case "Bruxelles":
                stato = "Belgio";
                descrizione = "Sede dell'Unione Europea, famosa per la Grand Place.";
                costo = "€220";
                break;
            case "Budapest":
                stato = "Ungheria";
                descrizione = "La perla del Danubio, famosa per le terme.";
                costo = "€190";
                break;
            case "Copenaghen":
                stato = "Danimarca";
                descrizione = "Una città moderna con una ricca storia vichinga.";
                costo = "€230";
                break;
            case "Lisbona":
                stato = "Portogallo";
                descrizione = "Una città collinare con tram iconici e il castello di São Jorge.";
                costo = "€210";
                break;
        }

        return String.format("Stato: %s<br>Descrizione: %s<br>Costo: %s", stato, descrizione, costo);
    }
}
