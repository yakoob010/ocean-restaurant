package controller;

import DAO.ReservationDAO;
import DAO.ReservationDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Reservation;

import java.io.IOException;

@WebServlet("/add-reservation")
public class AddReservationServlet extends HttpServlet {
    private ReservationDAO resDAO = new ReservationDAOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Extract data
        String name = request.getParameter("guestName");
        String room = request.getParameter("roomNumber");
        String date = request.getParameter("checkIn");
        double price = Double.parseDouble(request.getParameter("totalPrice"));

        // 2. Create Model Object
        Reservation newRes = new Reservation(0, name, room, date, price, "PENDING");

        // 3. Save via DAO
        boolean success = resDAO.addReservation(newRes);

        if (success) {
            // Redirect back to dashboard to see the new entry
            response.sendRedirect("dashboard");
        } else {
            // In case of error, send back to form with a message
            request.setAttribute("error", "Failed to add reservation. Try again, G.");
            request.getRequestDispatcher("add-reservation.jsp").forward(request, response);
        }
    }
}
