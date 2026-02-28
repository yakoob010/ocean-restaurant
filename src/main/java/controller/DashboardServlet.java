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
import java.util.List;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
    private ReservationDAO resDAO = new ReservationDAOImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Security Check: Only logged-in users
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        List<Reservation> reservations = resDAO.getAllReservations();
        request.setAttribute("reservations", reservations);
        request.getRequestDispatcher("dashboard.jsp").forward(request, response);
    }
}
